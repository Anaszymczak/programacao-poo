/**
 * Representa um contato do tipo Pessoa Física, com CPF.
 */
public class PessoaFisica extends ContatoBase{
 private String cpf;

 /**
  * Construtor da Pessoa Física.
  * */
  @param nome 
 @param telefone 
 @param email 
  @param cpf 
  
 public PessoaFisica(String nome, String telefone, String email, String cpf){
  super(nome, telefone, email);
  this.cpf = cpf;
 }

 public String getCpf(){
  return cpf;
 }

 public void setCpf(String cpf){
  this.cpf = cpf;
 }

 /**
  * Retorna o CPF como identificador.
  */
 public String getIdentificador(){
 return cpf;
 }
}
