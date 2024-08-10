package modulo_10.classe;

import java.util.Objects;

public class Pessoa10 {
    protected String nome;
    protected int idade;
    protected String  dataNascimento;
    protected String registroGeral;
    protected String numeroCPF;
    protected String nomePai;
    protected String nomeMae;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa10 pessoa10 = (Pessoa10) o;
        return idade == pessoa10.idade && Objects.equals(nome, pessoa10.nome) && Objects.equals(dataNascimento, pessoa10.dataNascimento) && Objects.equals(registroGeral, pessoa10.registroGeral) && Objects.equals(numeroCPF, pessoa10.numeroCPF) && Objects.equals(nomePai, pessoa10.nomePai) && Objects.equals(nomeMae, pessoa10.nomeMae);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, dataNascimento, registroGeral, numeroCPF, nomePai, nomeMae);
    }

    @Override
    public String toString() {
        return "Pessoa10{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCPF='" + numeroCPF + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                '}';
    }

    public boolean pessoaMaiorIdade(){
        return idade>=18;
    }
}
