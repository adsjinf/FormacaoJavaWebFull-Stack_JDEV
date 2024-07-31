package Modulo_9.venda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Venda9 {
    private Long id;
    private String descricaoVenda;
    private String nomeCliente;
    private String enderecoEntrega;
    private BigDecimal valorTotal;

    private List<Produto9> listaProduto9s = new ArrayList<Produto9>();

    public List<Produto9> getListaProdutos() {
        return listaProduto9s;
    }

    public void addProduto(Produto9 produto9) {
        this.listaProduto9s.add(produto9);
    }

    private double totalVenda(){
        double total = 0.0;
        for (Produto9 produto9 : listaProduto9s){
            total += produto9.getValor().doubleValue();
        }
        return  total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricaoVenda() {
        return descricaoVenda;
    }

    public void setDescricaoVenda(String descricaoVenda) {
        this.descricaoVenda = descricaoVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public BigDecimal getValorTotal() {
        this.valorTotal = BigDecimal.valueOf(totalVenda());
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda9 venda9 = (Venda9) o;
        return Objects.equals(id, venda9.id) && Objects.equals(descricaoVenda, venda9.descricaoVenda) && Objects.equals(nomeCliente, venda9.nomeCliente) && Objects.equals(enderecoEntrega, venda9.enderecoEntrega) && Objects.equals(valorTotal, venda9.valorTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricaoVenda, nomeCliente, enderecoEntrega, valorTotal);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", descricaoVenda='" + descricaoVenda + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", enderecoEntrega='" + enderecoEntrega + '\'' +
                ", valorTotal=" + valorTotal +
                ", listaProdutos=" + listaProduto9s +
                '}';
    }
}
