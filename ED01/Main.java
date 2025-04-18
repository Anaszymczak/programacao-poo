import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Placar placar = new Placar();
        
        boolean jogarNovamente = true;
        
        System.out.println("=== JOGO DE ADIVINHAÇÃO ===");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100!");
        
        while (jogarNovamente) {
            System.out.print("\nDigite seu nome: ");
            String nome = teclado.nextLine();
            
           
            Jogador jogador = new Jogador(nome);
            Jogo jogo = new Jogo(jogador);
            
            boolean acertou = false;
            
            System.out.println("\nBem-vindo, " + jogador.getNome() + "!");
            System.out.println("Um número entre 1 e 100 foi sorteado. Tente adivinhar!");
            
            
            while (!acertou) {
                System.out.print("\nTentativa " + (jogador.getTentativas() + 1) + ": ");
                
                
                int tentativa;
                try {
                    tentativa = Integer.parseInt(teclado.nextLine());
                    if (tentativa < 1 || tentativa > 100) {
                        System.out.println("Por favor, digite um número entre 1 e 100.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, digite um número válido.");
                    continue;
                }
                
                
                String resultado = jogo.jogar(tentativa);
                System.out.println(resultado);
                
                
                if (resultado.contains("ACERTOU")) {
                    acertou = true;
                }
            }
            
            
            System.out.println("\n=== RESUMO DA RODADA ===");
            System.out.println("Jogador: " + jogador.getNome());
            System.out.println("Tentativas: " + jogador.getTentativas());
            System.out.println("Pontuação: " + jogador.getPontuacao());
            
           
            placar.adicionarJogador(jogador);
            
            
            placar.mostrarRanking();
            
            
            System.out.print("\nDeseja jogar novamente? (S/N): ");
            String resposta = teclado.nextLine().trim().toUpperCase();
            jogarNovamente = resposta.equals("S") || resposta.equals("SIM");
        }
        
        System.out.println("\nObrigado por jogar! Até a próxima!");
        teclado.close();
    }
}