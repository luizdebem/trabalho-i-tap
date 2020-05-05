package Controllers;

import Modelos.Produto;
import java.io.*;

public class RegistroProduto extends Produto {

    public RegistroProduto() {
        super();
    }

    public RegistroProduto(int codigo, String nome, String modelo, String marca, String estado, double preco, int foiDeletado) {
        super(codigo, nome, modelo, marca, estado, preco, foiDeletado);
    }

    public void leitura(RandomAccessFile arquivo) throws IOException {
        setCodigo(arquivo.readInt());
        setNome(montaPalavra(arquivo, 30).trim());
        setModelo(montaPalavra(arquivo, 30).trim());
        setMarca(montaPalavra(arquivo, 30).trim());
        setEstado(montaPalavra(arquivo, 30).trim());
        setPreco(arquivo.readDouble());
        setFoiDeletado(arquivo.readInt());
    }

    private String montaPalavra(RandomAccessFile arquivo, int tamanho) throws IOException {
        char palavra[] = new char[tamanho];
        char temp;
        for (int i = 0; i < palavra.length; i++) {
            temp = arquivo.readChar();
            palavra[i] = temp;
        }
        return new String(palavra).replace('\0', ' ');
    }

    public void escrita(RandomAccessFile arquivo) throws IOException {
        arquivo.writeInt(getCodigo());
        escrevePalavra(arquivo, getNome(), 30);
        escrevePalavra(arquivo, getModelo(), 30);
        escrevePalavra(arquivo, getMarca(), 30);
        escrevePalavra(arquivo, getEstado(), 30);
        arquivo.writeDouble(getPreco());
        arquivo.writeInt(getFoiDeletado());
    }

    private void escrevePalavra(RandomAccessFile arquivo, String palavra, int tamanho) throws IOException {
        StringBuffer buffer = null;
        if (palavra != null) {
            buffer = new StringBuffer(palavra);
        } else {
            buffer = new StringBuffer(tamanho);
        }
        buffer.setLength(tamanho);
        arquivo.writeChars(buffer.toString());
    }

    public int getTamanhoRegistro() {
        // De acordo com os atributos. 30 = max de caracteres
        return (4 + (2 * 30) + (2 * 30) + (2 * 30) + (2 * 30) + 8 + 4);
    }

}
