/**
 * Interface que define os métodos obrigatórios para um contato.
 */
public interface Contato {
 /**
  * Retorna o identificador único (CPF ou CNPJ).
  * @return identificador do contato
  */
 public String getIdentificador();

 public String getNome();
 public void setNome(String nome);
 public String getTelefone();
 public void setTelefone(String telefone);
 public String getEmail();
 public void setEmail(String email);
}
