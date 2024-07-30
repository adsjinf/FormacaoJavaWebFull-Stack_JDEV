package venda;

import java.math.BigDecimal;

public class ExecutarTeste {
    public static void main(String[] arqs) {
        Venda venda = new Venda();
        Produto produto1 = new Produto();
        produto1.setId(1L);
        produto1.setNome("Modulo orientação objeto");
        produto1.setValor(BigDecimal.valueOf(100));

        Produto produto2 = new Produto();
        produto2.setId(2L);
        produto2.setNome("Modulo de Spring Boot API Rest");
        produto2.setValor(BigDecimal.valueOf(300));

        Produto produto3 = new Produto();
        produto3.setId(3L);
        produto3.setNome("Modulo de Angular 8");
        produto3.setValor(BigDecimal.valueOf(100));

        Produto produto4 = new Produto();
        produto4.setId(3L);
        produto4.setNome("Modulo de Hibernate");
        produto4.setValor(BigDecimal.valueOf(300));

        venda.setDescricaoVenda("Venda Curso Formação Java");
        venda.setEnderecoEntrega("Entregar pelo E-Mail");
        venda.setId(10L);
        venda.setNomeCliente("José Ismael");

        venda.getListaProdutos().add(produto1);
        venda.getListaProdutos().add(produto2);
        venda.addProduto(produto3);
        venda.addProduto(produto4);

        for (Produto produto : venda.getListaProdutos()){
            System.out.println("Descição do Produto " + produto);
        }

        System.out.println("Valor total da venda : " + venda.getValorTotal());

    }
}
