package modulo_10.classe;

import modulo_10.interfaces.PermitirAcesso;

import java.util.Objects;

public class Secretario10 extends Pessoa10 implements PermitirAcesso {
    private String registro;
    private String nivelCargo;
    private String experiencia;

    private String login;
    private String senha;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public double salario() {
        return 1800.80 * 0.9;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Secretario10 that = (Secretario10) o;
        return Objects.equals(registro, that.registro) && Objects.equals(nivelCargo, that.nivelCargo) && Objects.equals(experiencia, that.experiencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), registro, nivelCargo, experiencia);
    }

    @Override
    public String toString() {
        return "Secretario10{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCPF='" + numeroCPF + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", registro='" + registro + '\'' +
                ", nivelCargo='" + nivelCargo + '\'' +
                ", experiencia='" + experiencia + '\'' +
                '}';
    }

    /* Esse é o metodo do contrato de autenticação */
    @Override
    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin"); /* Retorna true caso login e senha seja admin senão false */
    }
}
