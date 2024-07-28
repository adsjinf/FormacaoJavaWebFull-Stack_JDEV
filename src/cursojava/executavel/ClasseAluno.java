package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ClasseAluno {
    List<Aluno> alunos = new ArrayList<Aluno>();

    public static void removerAluno(String nomeAluno, List<Aluno> alunos) {
        Aluno alunoParaRemover = null;
        for (Aluno aluno : alunos) {
            if (nomeAluno.equals(aluno.getNome())) {
                alunoParaRemover = aluno;
                break;
            }
            if (alunoParaRemover != null) {
                alunos.remove(alunoParaRemover);
            }
        }
    }

    public static void novoAluno(){
        String nomeAluno = JOptionPane.showInputDialog("Qual o Nome do Aluno ?");
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

        /* Usando Array */
//            String[] nomeDisciplina = new String[4];
//            nomeDisciplina[0]="Matemática";
//            nomeDisciplina[1]="Geografia";
//            nomeDisciplina[2]="Informática";
//            nomeDisciplina[3]="Português";
//
//            for (int pos=0; pos < 4;pos++) {
//                //String nomeDisciplina = JOptionPane.showInputDialog("Qual o Nome da Disciplina " + pos + " / 4 ?");
//                double notaAluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a Nota da Disciplina " + nomeDisciplina[pos].toString() + " ?"));
//
//                Disciplina disciplina = new Disciplina();
//                disciplina.setDisciplina(nomeDisciplina[pos].toString());
//                disciplina.setNota(notaAluno);
//                aluno.getDisciplinas().add(disciplina);
//            }

        /* Usando List */
        List<String> nomeDisciplinas = new ArrayList<String>();
        nomeDisciplinas.add("Matemática");
        nomeDisciplinas.add("Geografia");
        nomeDisciplinas.add("Informática");
        nomeDisciplinas.add("Português");

        for (int pos = 0; pos < nomeDisciplinas.size(); pos++) {
            //String nomeDisciplina = JOptionPane.showInputDialog("Qual o Nome da Disciplina " + pos + " / 4 ?");
            double notaAluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a Nota da Disciplina " + nomeDisciplinas.get(pos).toString() + " ?"));

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplinas.get(pos).toString());
            disciplina.setNota(notaAluno);
            aluno.getDisciplinas().add(disciplina);
        }
    }

    public static void removerAluno() {

    }

        public static void main(String[] args) {
        int opcaoEscolha=9;
        while (opcaoEscolha != 0){
            opcaoEscolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das Opções (1-Novo Aluno, 2-Remover Aluno, 3-Alterar Aluno, 4-Remover Disciplina, 5-Listar Alunos e 0-Sair) ?"));
            if (opcaoEscolha == 1) {
                novoAluno();
            } else if (opcaoEscolha == 2) {

            }
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
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover algum Aluno?");

        if (escolha == JOptionPane.YES_OPTION) {
            String nomeAluno = JOptionPane.showInputDialog("Qual o Nome do aluno que deseja deseja remover dados " + nomeAlunos + " ?");
            removerAluno(nomeAluno, alunos);
        }

        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
            System.out.println("Média do Aluno = " + aluno.getMediaNota());
            for (Disciplina disciplina : aluno.getDisciplinas()) {
                System.out.println(disciplina.getDisciplina() + "= " + disciplina.getNota());
            }
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Resultado = " + aluno.getAlunoAprovado2());
            System.out.println("-------------------------------------------------------------------------------");
        }
        for (int pos = 0; pos < alunos.size(); pos++) {
            Aluno aluno = alunos.get(pos);
            String nomeAluno = JOptionPane.showInputDialog("Qual o Nome do aluno deseja Trocar nome " + nomeAlunos + " ?");
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                Aluno trocar = new Aluno();
                trocar.setNome("Nome do aluno foir trocado");
                Disciplina disciplina = new Disciplina();
                trocar.getDisciplinas().add(disciplina);
                alunos.set(pos, trocar);
                System.out.println("Aluno = " + aluno.getNome());
                System.out.println("Média do Aluno = " + aluno.getMediaNota());
                System.out.println("Resultado = " + aluno.getAlunoAprovado2());
                System.out.println("-------------------------------------------------------------------------------");
                for (Disciplina disciplinas : aluno.getDisciplinas()) {
                    System.out.println("Disciplina = " + disciplinas.getDisciplina() + " / Nota = " + disciplinas.getNota());
                }
                System.out.println("-------------------------------------------------------------------------------");
                break;
            }
        }
    }
}