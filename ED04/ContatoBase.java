/**
 * Classe abstrata que implementa atributos em qualquer tipo de contato.
 */
public abstract class ContatoBase implements Contato {
 private String nome;
 private String telefone;
 private String email;

 /**
  * Construtor base para inf de contato
  * @param nome Nome
  * @param telefone 
  * @param email 
  */
 public ContatoBase(String nome, String telefone, String email){
  this.nome = nome;
  this.telefone = telefone;
  this.email = email;
 }

 public String getNome(){
 return nome;
 }

 public void setNome(String nome){
  this.nome = nome;
 }

 public String getTelefone(){
 return telefone;
 }

 public void setTelefone(String telefone){
  this.telefone = telefone;
 }

 public String getEmail(){
  return email;
 }

 public void setEmail(String email){
   this.email = email;
 }
}


