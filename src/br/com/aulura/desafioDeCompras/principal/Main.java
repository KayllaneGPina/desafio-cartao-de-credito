package br.com.aulura.desafioDeCompras.principal;

import br.com.aulura.desafioDeCompras.carrinho.Compras;
import br.com.aulura.desafioDeCompras.cartao.Cartao;
import br.com.aulura.desafioDeCompras.cartao.TipoCartao;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        Cartao cartao = new Cartao(limite);

        int sair = 1;
        while(sair != 0) {
            System.out.println("Digite a descrição da compra:");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra:");
            double valor = leitura.nextDouble();

            System.out.println("Tipos de cartões: \n 1 - Crédito (5% de desconto); \n 2 - Débito (10% de desconto); \n 3 - Cartão da Loja (15% de desconto ); \n 4 - Outros cartões (Sem desconto);");
            System.out.println("Digite o tipo do seu cartão: ");
            int tipoCartao = leitura.nextInt();


            Compras compra = new Compras(descricao, valor, tipoCartao);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        Collections.sort(cartao.getCompras());
        for (Compras c : cartao.getCompras()) {
            double valorComDesconto = c.getValor() * (1 - TipoCartao.getDesconto(c.getTipoCartao()));
            System.out.println(c.getDescricao() + " - " + valorComDesconto);
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());

    }
}