package modulo_10.exercicio;

import modulo_10.classe.Aluno10;
import modulo_10.classe.Diretor10;
import modulo_10.classe.Secretario10;

public class TestandoClasseFilho {

    public static void main(String[] arqs){

        Aluno10 aluno = new Aluno10();
        aluno.setNome("Alex JDev - Treinamento");
        aluno.setNomeEscola("JDev - Treinamento");
        aluno.setIdade(22);

        Diretor10 diretor = new Diretor10();
        diretor.setRegistroGeral("45sd4s5ds4d4s5d6");
        diretor.setNome("Egidio");
        diretor.setIdade(50);

        Secretario10 secretario = new Secretario10();
        secretario.setExperiencia("Administração");
        secretario.setNumeroCPF("457457457-45");
        secretario.setIdade(18);

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);

        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());

        System.out.println("Salário do Aluno é = " + aluno.salario());
        System.out.println("Salário do Diretor é = " + diretor.salario());
        System.out.println("Salário do Secretario  é = " + secretario.salario());

        /* erro provocado por criar uma classe abstrata */
//        Pessoa10 pessoa10 = new Pessoa10();
    }
}
