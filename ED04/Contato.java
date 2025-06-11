/**
 * Interface que define os métodos obrigatóriOs para um contato.
 */
public interface Contato {
 /**
  * Retorna o iD (CPF ou CNPJ)
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
