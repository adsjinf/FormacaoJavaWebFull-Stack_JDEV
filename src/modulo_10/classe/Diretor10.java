package modulo_10.classe;

import java.util.Objects;

public class Diretor10 extends Pessoa10{
    private String registroEducacao;
    private int tempoDirecao;
    private String titulacao;

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public int getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Diretor10 diretor10 = (Diretor10) o;
        return tempoDirecao == diretor10.tempoDirecao && Objects.equals(registroEducacao, diretor10.registroEducacao) && Objects.equals(titulacao, diretor10.titulacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), registroEducacao, tempoDirecao, titulacao);
    }

    @Override
    public String toString() {
        return "Diretor10{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCPF='" + numeroCPF + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", registroEducacao='" + registroEducacao + '\'' +
                ", tempoDirecao=" + tempoDirecao +
                ", titulacao='" + titulacao + '\'' +
                '}';
    }
}
