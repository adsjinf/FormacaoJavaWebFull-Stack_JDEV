package Modulo_9.venda;

import java.math.BigDecimal;

public class ExecutarTeste9 {
    public static void main(String[] arqs) {
        Venda9 venda9 = new Venda9();
        Produto9 produto91 = new Produto9();
        produto91.setId(1L);
        produto91.setNome("Modulo orientação objeto");
        produto91.setValor(BigDecimal.valueOf(100));

        Produto9 produto92 = new Produto9();
        produto92.setId(2L);
        produto92.setNome("Modulo de Spring Boot API Rest");
        produto92.setValor(BigDecimal.valueOf(300));

        Produto9 produto93 = new Produto9();
        produto93.setId(3L);
        produto93.setNome("Modulo de Angular 8");
        produto93.setValor(BigDecimal.valueOf(100));

        Produto9 produto94 = new Produto9();
        produto94.setId(3L);
        produto94.setNome("Modulo de Hibernate");
        produto94.setValor(BigDecimal.valueOf(300));

        venda9.setDescricaoVenda("Venda Curso Formação Java");
        venda9.setEnderecoEntrega("Entregar pelo E-Mail");
        venda9.setId(10L);
        venda9.setNomeCliente("José Ismael");

        venda9.getListaProdutos().add(produto91);
        venda9.getListaProdutos().add(produto92);
        venda9.addProduto(produto93);
        venda9.addProduto(produto94);

        for (Produto9 produto9 : venda9.getListaProdutos()){
            System.out.println("Descição do Produto " + produto9);
        }

        System.out.println("Valor total da Modulo_9.cursojava.venda : " + venda9.getValorTotal());

    }
}
