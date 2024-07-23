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
        double nota1Aluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a 1 Nota?"));
        double nota2Aluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a 2 Nota?"));
        double nota3Aluno = Double.parseDouble(JOptionPane.showInputDialog("Qual a 3 Nota?"));
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
        System.out.println("Nome é = " + aluno1.getNome());
        System.out.println("Idade é = " + aluno1.getIdade());
        System.out.println("Nascimento é = " + aluno1.getDataNascimento());
        System.out.println("Média da nota é = " + aluno1.getMediaNota());
        System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
        System.out.println("----------------------------------------------");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Pedro");
        aluno2.setIdade(50);
        aluno2.setNota1(80);
        aluno2.setNota2(90.8);
        aluno2.setNota3(60.9);
        aluno2.setNota4(80.7);
        aluno2.setDataNascimento("10/10/1970");
        System.out.println("Aluno 2 Nome é = " + aluno2.getNome());
        System.out.println("Aluno 2 Idade é = " + aluno2.getIdade());
        System.out.println("Aluno 2 Nascimento é = " + aluno2.getDataNascimento());
        System.out.println("Média da nota é = " + aluno2.getMediaNota());
        System.out.println("Média da nota é = " + aluno2.getAlunoAprovado2());
        System.out.println("----------------------------------------------");

        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno("Maria");
        Aluno aluno5 = new Aluno("jose",50);
    }
}