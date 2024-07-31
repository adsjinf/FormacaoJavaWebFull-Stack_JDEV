package Modulo_9.principio.responsabilidade;

public class TesteConta9 {

    public static void main(String[] arqs) {
        ContaBancaria9 bancaria = new ContaBancaria9();
        bancaria.setDescicao("Conta do José");
        System.out.println(bancaria);
        bancaria.dimui100Reais();
        bancaria.dimui100Reais();
        System.out.println(bancaria);
        bancaria.sacarDinheiro(400);
        System.out.println(bancaria);
        bancaria.depositoDinheiro(1000);
        System.out.println(bancaria);
        bancaria.soma100Reais();
        System.out.println(bancaria);

    }
}
