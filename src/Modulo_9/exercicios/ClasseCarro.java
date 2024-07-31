package Modulo_9.exercicios;

import Modulo_9.classes.Carro;

public class ClasseCarro {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.cor = "Amarelo";
        carro.nome ="Merceder bens";
        carro.importado=false;
        carro.valor =230450.00;
        carro.velocidade=320;
        System.out.println("Nome.......: " + carro.nome);
        System.out.println("Cor........: " + carro.cor);
        System.out.println("Importado..: " + carro.importado);
        System.out.println("Velocidade.: " + carro.velocidade);
        System.out.println("Valor......: " + carro.valor);
    }
}
