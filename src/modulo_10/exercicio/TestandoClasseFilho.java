package modulo_10.exercicio;

import modulo_10.classe.Aluno10;
import modulo_10.classe.Diretor10;
import modulo_10.classe.Secretario10;

public class TestandoClasseFilho {

    public static void main(String[] arqs){

        Aluno10 aluno = new Aluno10();
        aluno.setNome("Alex JDev - Treinamento");
        aluno.setNomeEscola("JDev - Treinamento");

        Diretor10 diretor = new Diretor10();
        diretor.setRegistroGeral("45sd4s5ds4d4s5d6");
        diretor.setNome("Egidio");

        Secretario10 secretario = new Secretario10();
        secretario.setExperiencia("Administração");
        secretario.setNumeroCPF("457457457-45");

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);
    }
}
