import java.util.Scanner;
import java.util.List;

/**
 * Responsável pela interação com o usuário Pelo console.
 */
public class ContatoView {
 Scanner scanner = new Scanner(System.in);

 /**
  * Exibe o menu e retorna a opção escolhida.
  * @return número da opção
  */
 public int menuPrincipal(){
  System.out.println("1 - Adicionar Contato");
  System.out.println("2 - Listar Contatos");
  System.out.println("3 - Atualizar Contato");
  System.out.println("4 - Remover Contato");
  System.out.println("0 - Sair");
  return scanner.nextInt();
 }

 /**
  * Pede os dados e cria um novo contato.
  * @return objeto Contato criado
  */
 public Contato criarContato(){
  System.out.println("1 - Pessoa Física\n2 - Pessoa Jurídica");
  int tipo = scanner.nextInt();
  scanner.nextLine();
  System.out.print("Nome: ");
  String nome = scanner.nextLine();
  System.out.print("Telefone: ");
  String telefone = scanner.nextLine();
  System.out.print("Email: ");
  String email = scanner.nextLine();

  if(tipo == 1){
   System.out.print("CPF (11 dígitos): ");
   String cpf = scanner.nextLine();
   return new PessoaFisica(nome, telefone, email, cpf);
  } else {
   System.out.print("CNPJ (14 dígitos): ");
   String cnpj = scanner.nextLine();
   return new PessoaJuridica(nome, telefone, email, cnpj);
  }
 }

 /**
  * Exibe a lista de contatos.
  * @param contatos lista de contatos
  */
 public void mostrarContatos(List<Contato> contatos){
  for(Contato c : contatos){
   System.out.println("Nome: " + c.getNome() +
   " | Tel: " + c.getTelefone() +
   " | Email: " + c.getEmail() +
   " | ID: " + c.getIdentificador());
  }
 }

 /**
  * Pede o identificador CPF OU CNPJ de um contato.
  * @return identificador informado
  */
 public String pedirIdentificador(){
  System.out.print("Digite o CPF/CNPJ do contato: ");
  return scanner.nextLine();
 }
}
