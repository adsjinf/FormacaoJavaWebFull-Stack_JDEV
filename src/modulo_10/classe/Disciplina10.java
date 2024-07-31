package modulo_10.classe;

import java.util.Objects;

/* Essa classe Disciplina servirá para todas os objetos e instancias de notas e disciplinas (materias) */
public class Disciplina10 {
    private double nota;
    private String disciplina;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina10 that = (Disciplina10) o;
        return Double.compare(nota, that.nota) == 0 && Objects.equals(disciplina, that.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota, disciplina);
    }
}
