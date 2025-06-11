import java.util.ArrayList;
import java.util.List;

/**
 * Controlador que gerencia os contatos
 */
public class ContatoController {
 private List<Contato> contatos = new ArrayList<>();

 /**
  * Adiciona um novo contato, se for valido.
  * @param c contato
  * @return true se adicionou, false se não foi add
  */
 public boolean adicionar(Contato c){
  if(!validar(c)) return false;

  for(Contato contato : contatos){
   if(contato.getIdentificador().equals(c.getIdentificador())){
    return false;
   }
  }
  contatos.add(c);
  return true;
 }

 /**
  * Retorna a lista de contatos.
  * @return lista
  */
 public List<Contato> listar(){
  return contatos;
 }

 /**
  * Remove um contato pelo id
  * @param id CPF ou CNPJ
  * @return true se removeu
  */
 public boolean remover(String id){
  for(Contato c : contatos){
   if(c.getIdentificador().equals(id)){
    contatos.remove(c);
    return true;
   }
  }
  return false;
 }

 /**
  * Atualiza um contato existente.
  * @param id CPF/CNPJ antigo
  * @param novo novo objeto
  * @return true se atualizou
  */
 public boolean atualizar(String id, Contato novo){
  for(int i=0; i<contatos.size(); i++){
   if(contatos.get(i).getIdentificador().equals(id)){
    if(!validar(novo)) return false;
    contatos.set(i, novo);
    return true;
   }
  }
  return false;
 }

 /**
  * Valida nome e CPF/CNPJ.
  * @param c contato
  * @return true se for válido
  */
 private boolean validar(Contato c){
  if(c.getNome() == null || c.getNome().length() < 3) return false;

  String id = c.getIdentificador();
  if(c instanceof PessoaFisica){
   return id.matches("\\d{11}");
  } else if(c instanceof PessoaJuridica){
   return id.matches("\\d{14}");
  }
  return false;
 }
}
