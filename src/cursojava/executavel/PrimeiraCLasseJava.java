package cursojava.executavel;

import cursojava.classes.Aluno;

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

        Aluno aluno1 = new Aluno();
        aluno1.setNome("João da Silva");
        aluno1.setIdade(50);
        aluno1.setDataNascimento("18/10/1987");
        aluno1.setRegistroGeral("44554.4544.545");
        aluno1.setNumeroCpf("54544.545454.5454");
        aluno1.setNomeMae("Shirlei");
        aluno1.setNomePai("Antonio");
        aluno1.setDataMatricula("10/10/2017");
        aluno1.setSerieMatriculado("5");
        aluno1.setNomeEscola("Escola DEV treinamento");
        aluno1.setNota1(90);
        aluno1.setNota2(80.8);
        aluno1.setNota3(70.9);
        aluno1.setNota4(90.7);
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