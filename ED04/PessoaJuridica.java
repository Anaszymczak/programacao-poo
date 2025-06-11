/**
 * Representa um contato do tipo Pessoa Jurídica, com CNPJ.
 */
public class PessoaJuridica extends ContatoBase{
 private String cnpj;

 /**
  * Construtor da Pessoa Jurídica.
   */
    @param nome Nome
   @param telefone Telefone
   @param email Email
   @param cnpj CNPJ com 14 dígitos
 
 public PessoaJuridica(String nome, String telefone, String email, String cnpj){
  super(nome, telefone, email);
  this.cnpj = cnpj;
 }

 public String getCnpj(){
  return cnpj;
 }

 public void setCnpj(String cnpj){
  this.cnpj = cnpj;
 }

 /**
  * Retorna o CNPJ como identificador.
  */
 public String getIdentificador(){
 return cnpj;
 }
}
