package cursojava.exercicios;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.StatusAluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ClasseAluno {
    static List<Aluno> alunos = new ArrayList<Aluno>();
    static List<Aluno> alunosAprovados = new ArrayList<Aluno>();
    static List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
    static List<Aluno> alunosReprovados = new ArrayList<Aluno>();
    static List<String> nomeDisciplinas = new ArrayList<String>();

    public static void main(String[] args) {
        int opcaoEscolha = 9;
        String nomeAluno = "";
        String novoNomeAluno = "";
        String nomeDisciplina="";
        String opcaoDisciplinas="";

        /* Usando List */
        nomeDisciplinas.add("Matemática");
        nomeDisciplinas.add("Geografia");
        nomeDisciplinas.add("Informática");
        nomeDisciplinas.add("Português");

        while (opcaoEscolha != 0) {
            opcaoEscolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das Opções (1-Novo Aluno, 2-Remover Aluno, 3-Alterar nome do Aluno, 4-Remover Disciplina, 5-Listar Alunos, 6-Listar todos Alunos, 7-Listar Alunos Status e 0-Sair) ?"));
            if (opcaoEscolha == 1 || opcaoEscolha == 2 || opcaoEscolha == 4 || opcaoEscolha == 5) {
                nomeAluno = JOptionPane.showInputDialog("Informe Nome do aluno ?");
            }
            if (opcaoEscolha == 1) {
                NovoAluno(nomeAluno);
            } else if (opcaoEscolha == 2) {
                RemoverAluno(nomeAluno);
            } else if (opcaoEscolha == 3) {
                nomeAluno = JOptionPane.showInputDialog("Informe Nome do aluno que será alterado?");
                novoNomeAluno = JOptionPane.showInputDialog("Informe o Novo Nome do aluno para ser alterado ?");
                AlterarNomeAluno(nomeAluno, novoNomeAluno);
            } else if (opcaoEscolha == 4) {
                for (int pos = 0; pos<4; pos++){
                    opcaoDisciplinas = opcaoDisciplinas + nomeDisciplinas.get(pos).toString() + " / ";
                }
                nomeDisciplina = JOptionPane.showInputDialog("Informe o Nome da Disciplina para ser removida (" + opcaoDisciplinas + ") ?");
                RemoverDisciplinaAluno(nomeAluno, nomeDisciplina);
            } else if (opcaoEscolha == 5) {
                ListarAluno(nomeAluno);
            } else if (opcaoEscolha == 6) {
                ListarTodosAlunos();
            } else if (opcaoEscolha == 7) {
                ListarTodosAlunosStatus();
            }
        }
    }

    public static void RemoverAluno(String nomeAluno) {
        for (Aluno aluno : alunos) {
            if (nomeAluno.equals(aluno.getNome())) {
                alunos.remove(aluno);
                break;
            }
        }
    }

    public static void NovoAluno(String nomeAluno) {
//        String nomeAluno = JOptionPane.showInputDialog("Qual o Nome do Aluno ?");
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

        for (int pos = 0; pos < nomeDisciplinas.size(); pos++) {
            double notaAluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a Nota da Disciplina " + nomeDisciplinas.get(pos).toString() + " ?"));
            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplinas.get(pos).toString());
            disciplina.setNota(notaAluno);
            aluno.getDisciplinas().add(disciplina);
        }

        alunos.add(aluno);
        if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)){
           alunosAprovados.add(aluno);
        } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)){
            alunosAprovados.add(aluno);
        } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
            alunosAprovados.add(aluno);
        }
    }

    public static void AlterarNomeAluno(String nomeAluno, String novoNomeAluno) {
        for (Aluno aluno : alunos) {
            if (nomeAluno.equalsIgnoreCase(aluno.getNome())) {
                aluno.setNome(novoNomeAluno);
                break;
            }
        }
    }

    public static void RemoverDisciplinaAluno(String nomeAluno, String nomeDisciplina) {
        for (Aluno aluno : alunos) {
            if (nomeAluno.equalsIgnoreCase(aluno.getNome())) {
                for (Disciplina disciplina : aluno.getDisciplinas()) {
                    if (nomeDisciplina.equalsIgnoreCase(disciplina.getDisciplina())) {
                        aluno.getDisciplinas().remove(disciplina);
                        break;
                    }
                }
                break;
            }
        }
    }

    public static void ListarAluno(String nomeAluno) {
        for (Aluno aluno : alunos) {
            if (nomeAluno.equalsIgnoreCase(aluno.getNome())) {
                System.out.println(aluno.toString());
                System.out.println("Média do Aluno = " + aluno.getMediaNota());
                for (Disciplina disciplina : aluno.getDisciplinas()) {
                    System.out.println(disciplina.getDisciplina() + "= " + disciplina.getNota());
                }
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("Resultado = " + aluno.getAlunoAprovado2());
                System.out.println("-------------------------------------------------------------------------------");
            }
        }
    }

    public static void ListarTodosAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Aluno = " + aluno.getNome());
            System.out.println("Média do Aluno = " + aluno.getMediaNota());
            System.out.println("Resultado = " + aluno.getAlunoAprovado2());
            System.out.println("-------------------------------------------------------------------------------");
            for (Disciplina disciplinas : aluno.getDisciplinas()) {
                System.out.println("Disciplina = " + disciplinas.getDisciplina() + " / Nota = " + disciplinas.getNota());
            }
            System.out.println("-------------------------------------------------------------------------------");
        }
    }

    public static void ListarTodosAlunosStatus() {
        for (Aluno aluno : alunosAprovados) {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Lista de " + StatusAluno.APROVADO);
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Aluno = " + aluno.getNome());
            System.out.println("Média do Aluno = " + aluno.getMediaNota());
            System.out.println("-------------------------------------------------------------------------------");
            for (Disciplina disciplinas : aluno.getDisciplinas()) {
                System.out.println("Disciplina = " + disciplinas.getDisciplina() + " / Nota = " + disciplinas.getNota());
            }
            System.out.println("-------------------------------------------------------------------------------");
        }
        for (Aluno aluno : alunosRecuperacao) {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Lista de " + StatusAluno.RECUPERACAO);
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Aluno = " + aluno.getNome());
            System.out.println("Média do Aluno = " + aluno.getMediaNota());
            System.out.println("Resultado = " + aluno.getAlunoAprovado2());
            System.out.println("-------------------------------------------------------------------------------");
            for (Disciplina disciplinas : aluno.getDisciplinas()) {
                System.out.println("Disciplina = " + disciplinas.getDisciplina() + " / Nota = " + disciplinas.getNota());
            }
            System.out.println("-------------------------------------------------------------------------------");
        }
        for (Aluno aluno : alunosReprovados) {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Lista de " + StatusAluno.REPROVADO);
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Aluno = " + aluno.getNome());
            System.out.println("Média do Aluno = " + aluno.getMediaNota());
            System.out.println("Resultado = " + aluno.getAlunoAprovado2());
            System.out.println("-------------------------------------------------------------------------------");
            for (Disciplina disciplinas : aluno.getDisciplinas()) {
                System.out.println("Disciplina = " + disciplinas.getDisciplina() + " / Nota = " + disciplinas.getNota());
            }
            System.out.println("-------------------------------------------------------------------------------");
        }

    }
}