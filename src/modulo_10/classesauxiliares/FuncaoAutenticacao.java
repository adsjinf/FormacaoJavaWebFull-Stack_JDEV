package modulo_10.classesauxiliares;

import modulo_10.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem que tenha o contrato de interface de PermitirAcesso, e chamar o autenticar*/
public class FuncaoAutenticacao {

    public boolean autenticarCursoJava(PermitirAcesso acesso){
        return acesso.autenticar();
    }
}
