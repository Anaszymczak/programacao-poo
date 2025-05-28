/**
 * Usuário cliente que pode se autenticar.
 */


public class Cliente extends Usuario implements Autenticavel {

 public Cliente(String login, String senha) {
        super(login, senha);
    }


    
    public boolean autenticar(String senha) {
        return senha.length() > 6 && this.senha.equals(senha);
    }
}
