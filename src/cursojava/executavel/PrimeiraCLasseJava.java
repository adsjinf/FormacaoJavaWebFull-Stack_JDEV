package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;

public class PrimeiraCLasseJava {
    public static void main(String[] args) {


        String nomeAluno = JOptionPane.showInputDialog("Qual o Nome do Aluno?");
        int idadeAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual o Idade?"));
        String dataNascimentoAluno = JOptionPane.showInputDialog("Qual a Data de Nascimento?");
        String registroGeralAluno = JOptionPane.showInputDialog("Qual o Registro Geral?");
        String cpfAluno = JOptionPane.showInputDialog("Qual o CPF do Aluno?");
        String nomeMaeAluno = JOptionPane.showInputDialog("Qual o Nome da Mãe?");
        String nomePaiAluno = JOptionPane.showInputDialog("Qual o Nome do Pai?");
        String dataMAtriculaAluno = JOptionPane.showInputDialog("Qual a Data da Matricula?");
        String serieAluno = JOptionPane.showInputDialog("Qual a Serie?");
        String nomeEscolaAluno = JOptionPane.showInputDialog("Qual o Nome da Escola?");
//
//        String nomeDisciplina1 = JOptionPane.showInputDialog("Qual o Nome da Disciplina 1?");
//        double nota1Aluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a 1 Nota?"));

        Aluno aluno1 = new Aluno();
        aluno1.setNome(nomeAluno);
        aluno1.setIdade(idadeAluno);
        aluno1.setDataNascimento(dataNascimentoAluno);
        aluno1.setRegistroGeral(registroGeralAluno);
        aluno1.setNumeroCpf(cpfAluno);
        aluno1.setNomeMae(nomeMaeAluno);
        aluno1.setNomePai(nomePaiAluno);
        aluno1.setDataMatricula(dataMAtriculaAluno);
        aluno1.setSerieMatriculado(serieAluno);
        aluno1.setNomeEscola(nomeEscolaAluno);

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Banco de Dados");
        disciplina1.setNota(90);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Matematica");
        disciplina2.setNota(80);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Geografia");
        disciplina3.setNota(97);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Java Web");
        disciplina4.setNota(70);

        aluno1.getDisciplinas().add(disciplina1);
        aluno1.getDisciplinas().add(disciplina2);
        aluno1.getDisciplinas().add(disciplina3);
        aluno1.getDisciplinas().add(disciplina4);

        System.out.println(aluno1.toString());
        System.out.println("Média do Aluno = " + aluno1.getMediaNota());
        System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aluno Aprovado" : "Aluno Reprovado"));

    }
}