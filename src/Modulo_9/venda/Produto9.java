package Modulo_9.venda;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto9 {
    private Long id;
    private String nome;
    private BigDecimal valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto9 produto9 = (Produto9) o;
        return Objects.equals(id, produto9.id) && Objects.equals(nome, produto9.nome) && Objects.equals(valor, produto9.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, valor);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
