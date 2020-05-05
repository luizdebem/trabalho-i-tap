package Controllers;

import java.io.*;

public class GerenciadorProduto {

    private String nomeArquivo;
    private RandomAccessFile arquivo;

    public GerenciadorProduto() {
        setNomeArquivo("arquivos/produtos.dat");
        abrirArquivo();
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public RandomAccessFile getArquivo() {
        return arquivo;
    }

    public void setArquivo(RandomAccessFile arquivo) {
        this.arquivo = arquivo;
    }

    public void abrirArquivo() {
        try {
            File fileArquivo = new File(getNomeArquivo());
            arquivo = new RandomAccessFile(fileArquivo, "rw");
        } catch (IOException io) {

        }
    }

    public void fecharArquivo() {
        try {
            arquivo.close();
        } catch (IOException io) {

        }
    }

    public boolean inserirFimArquivo(RegistroProduto registro) {
        try {
            arquivo.seek(arquivo.length());
            registro.escrita(arquivo);
            return true;
        } catch (IOException e) {

        }
        return false;
    }

    public int proximoCodigo() {
        int proximo = -1;

        RegistroProduto registro = new RegistroProduto();
        try {
            if (getArquivo().length() > 0) {
                arquivo.seek(0);
                while (getArquivo().getFilePointer() < getArquivo().length()) {
                    registro.leitura(arquivo);
                    if (registro.getCodigo() > proximo) {
                        proximo = registro.getCodigo();
                    }
                }
            } else {
                proximo = 0;
            }
        } catch (EOFException e) {

        } catch (IOException io) {

        }

        return proximo + 1;
    }

    public String listarLogico() {
        String linha = "";
        RegistroProduto registro = new RegistroProduto();

        try {
            arquivo.seek(0);
            while (getArquivo().getFilePointer() < getArquivo().length()) {
                registro.leitura(arquivo);
                if (registro.getFoiDeletado() != -1) {
                    linha = linha + registro.toString() + "\n";
                }
            }
        } catch (EOFException e) {

        } catch (IOException io) {

        }
        return linha;
    }

    public String listarFisico() {
        String linha = "";
        RegistroProduto registro = new RegistroProduto();
        try {
            arquivo.seek(0);
            while (getArquivo().getFilePointer() < getArquivo().length()) {
                registro.leitura(arquivo);
                linha = linha + registro.toString() + "\n";
            }
        } catch (EOFException e) {

        } catch (IOException io) {

        }

        return linha;
    }

    public int getQuantidadeRegistro() {
        int contador = 0;
        try {
            RegistroProduto registro = new RegistroProduto();
            arquivo.seek(0);
            while (getArquivo().getFilePointer() < getArquivo().length()) {
                registro.leitura(arquivo);
                if (registro.getCodigo() != -1) {
                    contador = contador + 1;
                }
            }
        } catch (IOException io) {

        }
        return contador;
    }

    public boolean atualizarArquivo(int chave, RegistroProduto cliente) {
        try {
            int posicao = posicaoRegistro(chave);
            if (posicao != -1) {
                RegistroProduto registro = cliente;
                arquivo.seek(posicao * registro.getTamanhoRegistro());
                registro.escrita(arquivo);
                return true;

            } else {
                return false;
            }
        } catch (EOFException e) {

        } catch (IOException io) {

        }
        return false;
    }

    public int posicaoRegistro(int chave) {
        int posicao = -1;
        RegistroProduto registro = new RegistroProduto();

        try {
            arquivo.seek(0);
            boolean achei = false;
            while ((getArquivo().getFilePointer() < getArquivo().length()) && (achei == false)) {
                registro.leitura(arquivo);
                if (registro.getCodigo() == chave) {
                    achei = true;
                }
                posicao = posicao + 1;
            }

            if (achei == true) {
                return posicao;
            } else {
                return -1;
            }
        } catch (EOFException e) {

        } catch (IOException io) {

        }
        return posicao;
    }

    public boolean excluirLogico(int chave) {
        int posicao = -1;
        RegistroProduto registro = new RegistroProduto();
        try {
            arquivo.seek(0);
            boolean achei = false;
            while ((getArquivo().getFilePointer() < getArquivo().length()) && (achei == false)) {
                registro.leitura(arquivo);
                if (registro.getCodigo() == chave) {
                    achei = true;
                }
                posicao = posicao + 1;
            }
            if (achei == true) {
                registro.setFoiDeletado(-1);
                arquivo.seek(posicao * registro.getTamanhoRegistro());
                registro.escrita(arquivo);
                return true;
            } else {
                return false;
            }
        } catch (EOFException e) {

        } catch (IOException io) {

        }
        return false;
    }

    public boolean excluirFisico(int chave) {
        RegistroProduto registro = new RegistroProduto();
        try {
            String nomeArquivoTemp = getNomeArquivo().substring(0, getNomeArquivo().indexOf("."));
            nomeArquivoTemp = nomeArquivoTemp + ".TMP";
            File fileArquivoTemp = new File(nomeArquivoTemp);
            RandomAccessFile arquivoTemp = new RandomAccessFile(fileArquivoTemp, "rw");
            arquivoTemp.setLength(0);
            try {
                arquivo.seek(0);
                while ((getArquivo().getFilePointer() < getArquivo().length())) {
                    registro.leitura(arquivo);
                    if (registro.getCodigo() != -1) {
                        if (registro.getCodigo() != chave) {
                            arquivoTemp.seek(arquivoTemp.length());
                            registro.escrita(arquivoTemp);
                        }
                    }
                }
            } catch (EOFException eof) {

            } catch (IOException io) {

            }

            arquivo.setLength(0);
            try {
                arquivoTemp.seek(0);
                while ((arquivoTemp.getFilePointer() < arquivoTemp.length())) {
                    registro.leitura(arquivoTemp);
                    arquivo.seek(arquivo.length());
                    registro.escrita(arquivo);
                }
            } catch (EOFException eof) {

            } catch (IOException io) {

            }
            arquivoTemp.setLength(0);

            arquivoTemp.close();

            fileArquivoTemp.delete();
            return true;
        } catch (EOFException e) {

        } catch (IOException io) {

        }
        return false;
    }

    public RegistroProduto pesquisarRegistro(int chave) {
        RegistroProduto retorno = null;
        RegistroProduto registro = new RegistroProduto();
        try {
            arquivo.seek(0);
            boolean achei = false;
            while ((getArquivo().getFilePointer() < getArquivo().length()) && (achei == false)) {
                registro.leitura(arquivo);
                if (registro.getCodigo() == chave) {
                    achei = true;
                }
            }

            if (achei == true) {
                return registro;
            } else {
                return retorno;
            }
        } catch (EOFException eof) {
            eof.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }
        return retorno;
    }

    public RegistroProduto pesquisarRegistroNome(String pesquisa) {
        RegistroProduto retorno = null;
        RegistroProduto registro = new RegistroProduto();
        try {
            arquivo.seek(0);
            boolean achei = false;

            while ((getArquivo().getFilePointer() < getArquivo().length()) && (achei == false)) {
                registro.leitura(arquivo);

                if (registro.getNome().toLowerCase().equals(pesquisa.toLowerCase())) {
                    System.out.println("Pesquisa ok " + registro.getNome());
                    achei = true;
                }
            }

            if (achei == true) {
                return registro;
            } else {
                return retorno;
            }
        } catch (EOFException e) {

        } catch (IOException io) {

        }
        return retorno;
    }

    public boolean zeraArquivo() {
        try {
            arquivo.setLength(0);
            return true;
        } catch (IOException io) {

            return false;
        }
    }

}
