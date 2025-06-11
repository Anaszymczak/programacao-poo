/**
 * Ana P. Szymczak, Julia Fonseca, Yuri P. Britto
 */

/**
 * Classe principal para rodar o sistema de contatos.
 */
public class Main {
 public static void main(String[] args){
  ContatoController controller = new ContatoController();
  ContatoView view = new ContatoView();

  boolean executando = true;

  while(executando){
   int opcao = view.menuPrincipal();
   switch(opcao){
    case 1:
     Contato c = view.criarContato();
     if(controller.adicionar(c)){
      System.out.println("Contato adicionado!");
     } else {
      System.out.println("Erro ao adicionar contato.");
     }
     break;
    case 2:
     view.mostrarContatos(controller.listar());
     break;
    case 3:
     String idAntigo = view.pedirIdentificador();
     Contato novo = view.criarContato();
     if(controller.atualizar(idAntigo, novo)){
      System.out.println("Atualizado com sucesso.");
     } else {
      System.out.println("Erro ao atualizar.");
     }
     break;
    case 4:
     String id = view.pedirIdentificador();
     if(controller.remover(id)){
      System.out.println("Removido.");
     } else {
      System.out.println("Contato não encontrado.");
     }
     break;
    case 0:
     executando = false;
     break;
    default:
     System.out.println("Opção inválida.");
   }
  }
 }
}
