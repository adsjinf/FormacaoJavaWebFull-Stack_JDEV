package modulo_10.classe;

import java.util.Objects;

public class Aluno10 extends Pessoa10 {
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

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
}
