package Modulo_9.exercicios;

import Modulo_9.classes.Aluno9;
import Modulo_9.classes.Disciplina9;
import Modulo_9.classes.StatusAluno9;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClasseAluno9 {
    static List<Aluno9> aluno9s = new ArrayList<Aluno9>();
    static List<String> nomeDisciplinas = new ArrayList<String>();
    static HashMap<String, List<Aluno9>> maps = new HashMap<String, List<Aluno9>>();

    @SuppressWarnings("rawtypes")
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

        /* Usando HashMap */
        maps.put(StatusAluno9.APROVADO, new ArrayList<Aluno9>());
        maps.put(StatusAluno9.RECUPERACAO, new ArrayList<Aluno9>());
        maps.put(StatusAluno9.REPROVADO, new ArrayList<Aluno9>());

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
        for (Aluno9 aluno9 : aluno9s) {
            if (nomeAluno.equals(aluno9.getNome())) {
                aluno9s.remove(aluno9);
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

        Aluno9 aluno9 = new Aluno9();
        aluno9.setNome(nomeAluno);
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
            Disciplina9 disciplina9 = new Disciplina9();
            disciplina9.setDisciplina(nomeDisciplinas.get(pos).toString());
            disciplina9.setNota(notaAluno);
            aluno9.getDisciplinas().add(disciplina9);
        }

        aluno9s.add(aluno9);


        String status = aluno9.getAlunoAprovado2();
        if (maps.containsKey(status)) {
            maps.get(status).add(aluno9);
        }

//        if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)){
//            maps.get(StatusAluno.APROVADO).add(aluno);
//        } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)){
//            maps.get(StatusAluno.RECUPERACAO).add(aluno);
//        } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
//            maps.get(StatusAluno.REPROVADO).add(aluno);
//        }
    }

    public static void AlterarNomeAluno(String nomeAluno, String novoNomeAluno) {
        for (Aluno9 aluno9 : aluno9s) {
            if (nomeAluno.equalsIgnoreCase(aluno9.getNome())) {
                aluno9.setNome(novoNomeAluno);
                break;
            }
        }
    }

    public static void RemoverDisciplinaAluno(String nomeAluno, String nomeDisciplina) {
        for (Aluno9 aluno9 : aluno9s) {
            if (nomeAluno.equalsIgnoreCase(aluno9.getNome())) {
                for (Disciplina9 disciplina9 : aluno9.getDisciplinas()) {
                    if (nomeDisciplina.equalsIgnoreCase(disciplina9.getDisciplina())) {
                        aluno9.getDisciplinas().remove(disciplina9);
                        break;
                    }
                }
                break;
            }
        }
    }

    public static void ListarAluno(String nomeAluno) {
        for (Aluno9 aluno9 : aluno9s) {
            if (nomeAluno.equalsIgnoreCase(aluno9.getNome())) {
                System.out.println(aluno9.toString());
                System.out.println("Média do Aluno = " + aluno9.getMediaNota());
                for (Disciplina9 disciplina9 : aluno9.getDisciplinas()) {
                    System.out.println(disciplina9.getDisciplina() + "= " + disciplina9.getNota());
                }
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("Resultado = " + aluno9.getAlunoAprovado2());
                System.out.println("-------------------------------------------------------------------------------");
            }
        }
    }

    public static void ListarTodosAlunos() {
        for (Aluno9 aluno9 : aluno9s) {
            System.out.println("Aluno = " + aluno9.getNome());
            System.out.println("Média do Aluno = " + aluno9.getMediaNota());
            System.out.println("Resultado = " + aluno9.getAlunoAprovado2());
            System.out.println("-------------------------------------------------------------------------------");
            for (Disciplina9 disciplinas : aluno9.getDisciplinas()) {
                System.out.println("Disciplina = " + disciplinas.getDisciplina() + " / Nota = " + disciplinas.getNota());
            }
            System.out.println("-------------------------------------------------------------------------------");
        }
    }

    public static void ListarTodosAlunosStatus() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Lista de " + StatusAluno9.APROVADO);
        System.out.println("-------------------------------------------------------------------------------");
        for (Aluno9 aluno9 : maps.get(StatusAluno9.APROVADO)) {
            System.out.println(aluno9.getNome() + " - Resultado = " + aluno9.getAlunoAprovado2() + " com média de = " + aluno9.getMediaNota());
        }
        System.out.println(".");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Lista de " + StatusAluno9.RECUPERACAO);
        System.out.println("-------------------------------------------------------------------------------");
        for (Aluno9 aluno9 : maps.get(StatusAluno9.RECUPERACAO)) {
            System.out.println(aluno9.getNome() + " - Resultado = " + aluno9.getAlunoAprovado2() + " com média de = " + aluno9.getMediaNota());
        }
        System.out.println(".");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Lista de " + StatusAluno9.REPROVADO);
        System.out.println("-------------------------------------------------------------------------------");
        for (Aluno9 aluno9 : maps.get(StatusAluno9.REPROVADO)) {
            System.out.println(aluno9.getNome() + " - Resultado = " + aluno9.getAlunoAprovado2() + " com média de = " + aluno9.getMediaNota());
        }
        System.out.println("-------------------------------------------------------------------------------");

    }
}