package br.com.aulura.desafioDeCompras.cartao;

public class TipoCartao {
    public static final int CREDITO = 1;
    public static final int DEBITO = 2;
    public static final int LOJA = 3;

    public static double getDesconto(int tipo) {
        switch (tipo) {
            case CREDITO:
                return 0.05; // 5% de desconto para cartão de crédito
            case DEBITO:
                return 0.10; // 10% de desconto para cartão de débito
            case LOJA:
                return 0.15; // 15% de desconto para cartão da loja
            default:
                return 0.0; // Sem desconto para outros tipos de cartão
        }
    }
}
