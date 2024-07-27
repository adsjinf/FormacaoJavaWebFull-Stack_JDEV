package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CLasseAluno {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();

        for (int qtdAlunos = 0; qtdAlunos <= 1; qtdAlunos++) {
            String nomeAluno = JOptionPane.showInputDialog("Qual o Nome do Aluno " + (qtdAlunos + 1) + "?");

//        int idadeAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual o Idade?"));
//        String dataNascimentoAluno = JOptionPane.showInputDialog("Qual a Data de Nascimento?");
//        String registroGeralAluno = JOptionPane.showInputDialog("Qual o Registro Geral?");
//        String cpfAluno = JOptionPane.showInputDialog("Qual o CPF do Aluno?");
//        String nomeMaeAluno = JOptionPane.showInputDialog("Qual o Nome da Mãe?");
//        String nomePaiAluno = JOptionPane.showInputDialog("Qual o Nome do Pai?");
//        String dataMAtriculaAluno = JOptionPane.showInputDialog("Qual a Data da Matricula?");
//        String serieAluno = JOptionPane.showInputDialog("Qual a Serie?");
//        String nomeEscolaAluno = JOptionPane.showInputDialog("Qual o Nome da Escola?");

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);

//        aluno.setIdade(idadeAluno);
//        aluno.setDataNascimento(dataNascimentoAluno);
//        aluno.setRegistroGeral(registroGeralAluno);
//        aluno.setNumeroCpf(cpfAluno);
//        aluno.setNomeMae(nomeMaeAluno);
//        aluno.setNomePai(nomePaiAluno);
//        aluno.setDataMatricula(dataMAtriculaAluno);
//        aluno.setSerieMatriculado(serieAluno);
//        aluno.setNomeEscola(nomeEscolaAluno);
            List<String> nomeDisciplinas = new ArrayList<String>();
            nomeDisciplinas.add("Matemática");
            nomeDisciplinas.add("Geografia");
            nomeDisciplinas.add("Informática");
            nomeDisciplinas.add("Português");
            for (String nomedisciplina : nomeDisciplinas) {
                //String nomeDisciplina = JOptionPane.showInputDialog("Qual o Nome da Disciplina " + pos + " / 4 ?");
                double notaAluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a Nota da Disciplina " + nomedisciplina + " ?"));

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomedisciplina);
                disciplina.setNota(notaAluno);
                aluno.getDisciplinas().add(disciplina);
            }

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

            if (escolha == JOptionPane.YES_OPTION) {
                int continuarRemover = 0;
                while (continuarRemover == 0) {

                    int disciplinaRemover = Integer.parseInt(JOptionPane.showInputDialog("Qual o Número da Disciplina para ser removida " + aluno.getListaDisciplinas() + " ?"));
                    if (disciplinaRemover <= aluno.getDisciplinas().size()) {
                        aluno.getDisciplinas().remove(disciplinaRemover - 1);
                    } else {
                        JOptionPane.showInternalMessageDialog(null, "Disciplina informada não encontrada");
                    }
                    if (aluno.getDisciplinas().size() > 0) {
                        continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo disciplina ?");
                    } else {
                        continuarRemover = 1;
                    }
                }
            }
            alunos.add(aluno);
        }
        String nomeAlunos = "";
        for (Aluno aluno : alunos) {
            nomeAlunos = nomeAlunos + aluno.getNome() + " / ";
        }
        int quantidadeAlunos = alunos.size();
        for (Aluno aluno : alunos) {
            String nomeAluno = JOptionPane.showInputDialog("Qual o Nome do aluno deseja exibir dados " + nomeAlunos + " ?");
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                alunos.remove(aluno);
                break;
            } else {
                System.out.println(aluno.toString());
                System.out.println("Média do Aluno = " + aluno.getMediaNota());
                for (Disciplina disciplina : aluno.getDisciplinas()) {
                    System.out.println(disciplina.getDisciplina() + "= " + disciplina.getNota());
                }
                System.out.println("-------------------------------------------------------------------------------");
//            System.out.println("Resultado = " + (aluno.getAlunoAprovado() ? "Aluno Aprovado" : "Aluno Reprovado"));
                System.out.println("Resultado = " + aluno.getAlunoAprovado2());
                System.out.println("-------------------------------------------------------------------------------");
            }
        }
        if (quantidadeAlunos != alunos.size()) {
            for (Aluno aluno : alunos) {
                System.out.println("Alunos que sobraram na lista");
                System.out.println(aluno.getNome());
                System.out.println("Suas Materias são");
                for (Disciplina disciplina : aluno.getDisciplinas()) {
                    System.out.println(disciplina.getDisciplina());
                }
                System.out.println("-------------------------------------------------------------------------------");
            }
        }
    }
}