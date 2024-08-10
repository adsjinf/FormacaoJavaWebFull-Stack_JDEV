package modulo_10.classe;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno10 extends Pessoa10 {
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    private List<Disciplina10> disciplinas10 = new ArrayList<Disciplina10>();


    public void setDisciplinas(List<Disciplina10> disciplina9s) {
        this.disciplinas10 = disciplinas10;
    }

    public List<Disciplina10> getDisciplinas() {
        return disciplinas10;
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
        for (Disciplina10 disciplina10 : disciplinas10){
            somaNotas += disciplina10.getNota();
        }
        return somaNotas/ disciplinas10.size();
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
        for (Disciplina10 disciplinas : disciplinas10){
            listaDisciplinas = listaDisciplinas + contador + " - "  +  disciplinas.getDisciplina() + ", ";
            contador++;
        }
        return listaDisciplinas;
    }

    public String getAlunoAprovado2() {
        double media = this.getMediaNota();
        if (media >= 50 ) {
            if (media >= 70) {
                return StatusAluno10.APROVADO;
            } else {
                return StatusAluno10.RECUPERACAO;
            }
        } else {
            return StatusAluno10.REPROVADO;
        }
    }

    @Override
    public double salario() {
        return 1500.90;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aluno10 aluno10 = (Aluno10) o;
        return Objects.equals(dataMatricula, aluno10.dataMatricula) && Objects.equals(nomeEscola, aluno10.nomeEscola) && Objects.equals(serieMatriculado, aluno10.serieMatriculado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dataMatricula, nomeEscola, serieMatriculado);
    }

    @Override
    public String toString() {
        return "Aluno10{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCPF='" + numeroCPF + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                '}';
    }


    @Override /* Rescreve a classe com nova rotina */
    public boolean pessoaMaiorIdade() {
        return idade >= 21;
    }

    public String msgMaiorIdade(){
        return this.pessoaMaiorIdade() ? "Obaa aluno é maior de idade" : "Ixii vc é menor de idade";
    }
}
