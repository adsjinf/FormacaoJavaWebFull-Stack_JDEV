package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;
import java.util.List;

public class CLasseAluno {
    public static void main(String[] args) {


        String nomeAluno = JOptionPane.showInputDialog("Qual o Nome do Aluno?");
//        int idadeAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual o Idade?"));
//        String dataNascimentoAluno = JOptionPane.showInputDialog("Qual a Data de Nascimento?");
//        String registroGeralAluno = JOptionPane.showInputDialog("Qual o Registro Geral?");
//        String cpfAluno = JOptionPane.showInputDialog("Qual o CPF do Aluno?");
//        String nomeMaeAluno = JOptionPane.showInputDialog("Qual o Nome da Mãe?");
//        String nomePaiAluno = JOptionPane.showInputDialog("Qual o Nome do Pai?");
//        String dataMAtriculaAluno = JOptionPane.showInputDialog("Qual a Data da Matricula?");
//        String serieAluno = JOptionPane.showInputDialog("Qual a Serie?");
//        String nomeEscolaAluno = JOptionPane.showInputDialog("Qual o Nome da Escola?");

        Aluno aluno1 = new Aluno();
        aluno1.setNome(nomeAluno);
//        aluno1.setIdade(idadeAluno);
//        aluno1.setDataNascimento(dataNascimentoAluno);
//        aluno1.setRegistroGeral(registroGeralAluno);
//        aluno1.setNumeroCpf(cpfAluno);
//        aluno1.setNomeMae(nomeMaeAluno);
//        aluno1.setNomePai(nomePaiAluno);
//        aluno1.setDataMatricula(dataMAtriculaAluno);
//        aluno1.setSerieMatriculado(serieAluno);
//        aluno1.setNomeEscola(nomeEscolaAluno);

        for (int pos=1; pos <= 4; pos++) {
            String nomeDisciplina = JOptionPane.showInputDialog("Qual o Nome da Disciplina " + pos + " / 4 ?");
            double notaAluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a Nota da Disciplina " + nomeDisciplina + " ?"));

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(notaAluno);
            aluno1.getDisciplinas().add(disciplina);
        }

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

        if (escolha==0){
            int continuarRemover = 0;
            while (continuarRemover == 0) {

                int disciplinaRemover = Integer.parseInt(JOptionPane.showInputDialog("Qual o Número da Disciplina para ser removida " + aluno1.getListaDisciplinas() + " ?"));
                if (disciplinaRemover <= aluno1.getDisciplinas().size()) {
                    aluno1.getDisciplinas().remove(disciplinaRemover - 1);
                } else {
                    JOptionPane.showInternalMessageDialog(null,"Disciplina informada não incontrada");
                }
                if (aluno1.getDisciplinas().size()>0){
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo disciplina ?");
                }else {
                    continuarRemover=1;
                }
            }
        }

        System.out.println(aluno1.toString());
        System.out.println("Média do Aluno = " + aluno1.getMediaNota());
        System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aluno Aprovado" : "Aluno Reprovado"));

    }
}