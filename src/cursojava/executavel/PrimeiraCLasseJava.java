package cursojava.executavel;

import cursojava.classes.Aluno;

import javax.swing.*;

public class PrimeiraCLasseJava {
    public static void main(String[] args) {
//        Carro carro = new Carro();
//        carro.cor = "Amarelo";
//        carro.nome ="Merceder bens";
//        carro.importado=false;
//        carro.valor =230450.00;
//        carro.velocidade=320;
//        System.out.println("Nome.......: " + carro.nome);
//        System.out.println("Cor........: " + carro.cor);
//        System.out.println("Importado..: " + carro.importado);
//        System.out.println("Velocidade.: " + carro.velocidade);
//        System.out.println("Valor......: " + carro.valor);
//        Aluno aluno1 = new Aluno();
//        aluno1.nome = "João";
//        aluno1.idade=50;
//        System.out.println("Nome do aluno 1 é = " + aluno1.nome);
//        System.out.println("Idade do aluno 1 é = " + aluno1.idade);

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
        String nomeDisciplina1 = JOptionPane.showInputDialog("Qual o Nome da Disciplina 1?");
        double nota1Aluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a 1 Nota?"));
        String nomeDisciplina2 = JOptionPane.showInputDialog("Qual o Nome da Disciplina 2?");
        double nota2Aluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a 2 Nota?"));
        String nomeDisciplina3 = JOptionPane.showInputDialog("Qual o Nome da Disciplina 3?");
        double nota3Aluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a 3 Nota?"));
        String nomeDisciplina4 = JOptionPane.showInputDialog("Qual o Nome da Disciplina 4?");
        double nota4Aluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a 4 Nota?"));

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
        aluno1.setNota1(nota1Aluno);
        aluno1.setNota2(nota2Aluno);
        aluno1.setNota3(nota3Aluno);
        aluno1.setNota4(nota4Aluno);
        aluno1.setDisciplina1(nomeDisciplina1);
        aluno1.setDisciplina2(nomeDisciplina2);
        aluno1.setDisciplina3(nomeDisciplina3);
        aluno1.setDisciplina4(nomeDisciplina4);

        System.out.println(aluno1.toString());
        System.out.println("Média do Aluno = " + aluno1.getMediaNota());
        System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aluno Aprovado" : "Aluno Reprovado"));

        /* Equal e Hashcode (Diferenciar e comparar objetos) */
//        Aluno aluno1 = new Aluno();
//        aluno1.setNome("Alex");
//        aluno1.setNumeroCpf("123");
//
//        Aluno aluno2 = new Aluno();
//        aluno2.setNome("Alex");
//        aluno2.setNumeroCpf("1234");
//
//        if (aluno1.equals(aluno2)) {
//            System.out.println("Aluno são iguais");
//        } else {
//            System.out.println("Aluno não são iguais");
//        }

    }
}