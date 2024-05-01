package br.com.aulura.desafioDeCompras.carrinho;

import java.util.Comparator;

public class Compras implements Comparable<Compras> {
    private String descricao;
    private double valor;
    private int tipoCartao;

    public Compras(String descricao, double valor, int tipoCartao) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipoCartao = tipoCartao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(int tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    @Override
    public String toString() {
        return "Compras: " +
                "descricao ='" + descricao + '\'' + "valor" + ":" + valor + '\'' + "tipo do cartão = " + tipoCartao;
    }

    @Override
    public int compareTo(Compras outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
