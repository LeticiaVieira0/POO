import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        List<String> jogos = new ArrayList<>();

        Scanner sc = new Scannner(System.in);
        int opcao;
        do{
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar jogo");
            System.out.println("2 - Listar jogos");
            System.out.println("3 - Atualizar jogo");
            System.out.println("4 - Renomear jogo");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do jogo para adicionar: ");
                    String jogo = scanner.next String;
                    if (jogo nao estiver em jogos){
                        jogos.add(jogo)
                    }
                    break;
                
                case 2:

                    break;
            
                default:
                    break;
            }

        } while (opcao != 0);
    }
}
