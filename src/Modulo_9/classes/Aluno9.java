package Modulo_9.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* Está é nossa classe/objeto que representa o Aluno */
public class Aluno9 {

    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    private List<Disciplina9> disciplina9s = new ArrayList<Disciplina9>();

    public void setDisciplinas(List<Disciplina9> disciplina9s) {
        this.disciplina9s = disciplina9s;
    }

    public List<Disciplina9> getDisciplinas() {
        return disciplina9s;
    }

    public Aluno9() {}

    public Aluno9(String nomePadrao){
        nome = nomePadrao;
    }

    public Aluno9(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }

    public String getNome() { return nome; }

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

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    /* Metodo que retorna a média do aluno */
    public double getMediaNota(){
        double somaNotas = 0.0;
        for (Disciplina9 disciplina9 : disciplina9s){
            somaNotas += disciplina9.getNota();
        }
        return somaNotas/ disciplina9s.size();
    }

    public boolean getAlunoAprovado() {
        double media = this.getMediaNota();
        if (media >= 70 ){
            return true;
        } else {
            return  false;
        }

    }

    public String getListaDisciplinas(){
        String listaDisciplinas = "";
        int contador=1;
        for (Disciplina9 disciplinas : disciplina9s){
            listaDisciplinas = listaDisciplinas + contador + " - "  +  disciplinas.getDisciplina() + ", ";
            contador++;
        }
        return listaDisciplinas;
    }

    public String getAlunoAprovado2() {
        double media = this.getMediaNota();
        if (media >= 50 ) {
            if (media >= 70) {
                return StatusAluno9.APROVADO;
            } else {
                return StatusAluno9.RECUPERACAO;
            }
        } else {
            return StatusAluno9.REPROVADO;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", Matemática='" + disciplina9s.toString() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno9 aluno9 = (Aluno9) o;
        return Objects.equals(nome, aluno9.nome) && Objects.equals(numeroCpf, aluno9.numeroCpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroCpf);
    }
}
