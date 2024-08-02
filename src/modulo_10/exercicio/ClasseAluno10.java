package modulo_10.exercicio;

import modulo_10.classe.Aluno10;
import modulo_10.classe.Disciplina10;
import modulo_10.classe.StatusAluno10;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClasseAluno10 {
    static List<Aluno10> alunos10 = new ArrayList<Aluno10>();
    static List<String> nomeDisciplinas = new ArrayList<String>();
    static HashMap<String, List<Aluno10>> maps = new HashMap<String, List<Aluno10>>();

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
        maps.put(StatusAluno10.APROVADO, new ArrayList<Aluno10>());
        maps.put(StatusAluno10.RECUPERACAO, new ArrayList<Aluno10>());
        maps.put(StatusAluno10.REPROVADO, new ArrayList<Aluno10>());

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
        for (Aluno10 aluno10 : alunos10) {
            if (nomeAluno.equals(aluno10.getNome())) {
                alunos10.remove(aluno10);
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

        Aluno10 aluno10 = new Aluno10();
        aluno10.setNome(nomeAluno);
        
//        aluno10.setIdade(idadeAluno);
//        aluno10.setDataNascimento(dataNascimentoAluno);
//        aluno10.setRegistroGeral(registroGeralAluno);
//        aluno10.setNumeroCpf(cpfAluno);
//        aluno10.setNomeMae(nomeMaeAluno);
//        aluno10.setNomePai(nomePaiAluno);
//        aluno10.setDataMatricula(dataMAtriculaAluno);
//        aluno10.setSerieMatriculado(serieAluno);
//        aluno10.setNomeEscola(nomeEscolaAluno);

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
//                Disciplina10 disciplina10 = new Disciplina10();
//                disciplina10.setDisciplina(nomeDisciplina[pos].toString());
//                disciplina10.setNota(notaAluno);
//                aluno10.getDisciplinas().add(disciplina10);
//            }

        for (int pos = 0; pos < nomeDisciplinas.size(); pos++) {
            double notaAluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a Nota da Disciplina " + nomeDisciplinas.get(pos).toString() + " ?"));
            Disciplina10 disciplina10 = new Disciplina10();
            disciplina10.setDisciplina(nomeDisciplinas.get(pos).toString());
            disciplina10.setNota(notaAluno);
            aluno10.getDisciplinas().add(disciplina10);
        }

        alunos10.add(aluno10);


        String status = aluno10.getAlunoAprovado2();
        if (maps.containsKey(status)) {
            maps.get(status).add(aluno10);
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
        for (Aluno10 aluno10 : alunos10) {
            if (nomeAluno.equalsIgnoreCase(aluno10.getNome())) {
                aluno10.setNome(novoNomeAluno);
                break;
            }
        }
    }

    public static void RemoverDisciplinaAluno(String nomeAluno, String nomeDisciplina) {
        for (Aluno10 aluno10 : alunos10) {
            if (nomeAluno.equalsIgnoreCase(aluno10.getNome())) {
                for (Disciplina10 disciplina10 : aluno10.getDisciplinas()) {
                    if (nomeDisciplina.equalsIgnoreCase(disciplina10.getDisciplina())) {
                        aluno10.getDisciplinas().remove(disciplina10);
                        break;
                    }
                }
                break;
            }
        }
    }

    public static void ListarAluno(String nomeAluno) {
        for (Aluno10 aluno10 : alunos10) {
            if (nomeAluno.equalsIgnoreCase(aluno10.getNome())) {
                System.out.println(aluno10.toString());
                System.out.println("Média do Aluno = " + aluno10.getMediaNota());
                for (Disciplina10 disciplina10 : aluno10.getDisciplinas()) {
                    System.out.println(disciplina10.getDisciplina() + "= " + disciplina10.getNota());
                }
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("Resultado = " + aluno10.getAlunoAprovado2());
                System.out.println("-------------------------------------------------------------------------------");
            }
        }
    }

    public static void ListarTodosAlunos() {
        for (Aluno10 aluno10 : alunos10) {
            System.out.println("Aluno = " + aluno10.getNome());
            System.out.println("Média do Aluno = " + aluno10.getMediaNota());
            System.out.println("Resultado = " + aluno10.getAlunoAprovado2());
            System.out.println("-------------------------------------------------------------------------------");
            for (Disciplina10 disciplinas : aluno10.getDisciplinas()) {
                System.out.println("Disciplina = " + disciplinas.getDisciplina() + " / Nota = " + disciplinas.getNota());
            }
            System.out.println("-------------------------------------------------------------------------------");
        }
    }

    public static void ListarTodosAlunosStatus() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Lista de " + StatusAluno10.APROVADO);
        System.out.println("-------------------------------------------------------------------------------");
        for (Aluno10 aluno9 : maps.get(StatusAluno10.APROVADO)) {
            System.out.println(aluno9.getNome() + " - Resultado = " + aluno9.getAlunoAprovado2() + " com média de = " + aluno9.getMediaNota());
        }
        System.out.println(".");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Lista de " + StatusAluno10.RECUPERACAO);
        System.out.println("-------------------------------------------------------------------------------");
        for (Aluno10 aluno10 : maps.get(StatusAluno10.RECUPERACAO)) {
            System.out.println(aluno10.getNome() + " - Resultado = " + aluno10.getAlunoAprovado2() + " com média de = " + aluno10.getMediaNota());
        }
        System.out.println(".");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Lista de " + StatusAluno10.REPROVADO);
        System.out.println("-------------------------------------------------------------------------------");
        for (Aluno10 aluno10 : maps.get(StatusAluno10.REPROVADO)) {
            System.out.println(aluno10.getNome() + " - Resultado = " + aluno10.getAlunoAprovado2() + " com média de = " + aluno10.getMediaNota());
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
}
