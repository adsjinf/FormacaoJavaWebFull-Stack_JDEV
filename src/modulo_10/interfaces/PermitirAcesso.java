package modulo_10.interfaces;

/* Essa interface será o nosso contrato de autenticação */
public interface PermitirAcesso {
    public boolean autenticar(String login, String senha); /* Apenas a declaração do método*/
}
