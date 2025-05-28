/**
 * Usuário administrador do sistema.
 */


public class Administrador extends Usuario implements Autenticavel, Gerenciavel, Logavel {


    public Administrador(String login, String senha) {
        super(login, senha);
    }


    
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    public void bloquearUsuario() {
        System.out.println("Usuário bloqueado com sucesso.");
    }

    public void registrarLog(String operacao) {
        System.out.println("Log registrado: " + operacao);
    }
}
