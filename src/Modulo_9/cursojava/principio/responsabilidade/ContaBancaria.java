package Modulo_9.cursojava.principio.responsabilidade;

public class ContaBancaria {

    private String descicao;
    private double saldo = 8000;

    public void soma100Reais() {
        saldo += 100;
    }

    public void dimui100Reais(){
        saldo -= 100;
    }

    public void sacarDinheiro(double saque){
        saldo -= saque;
    }

    public void depositoDinheiro(double deposito){
        saldo += deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public String getDescicao() {
        return descicao;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "descicao='" + descicao + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
