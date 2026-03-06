import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> jogos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar jogo");
            System.out.println("2 - Listar jogos");
            System.out.println("3 - Atualizar jogo");
            System.out.println("4 - Remover jogo");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do jogo para adicionar: ");
                    String jogo = sc.next();

                    if(jogos.size() <= 0){
                        jogos.add(jogo);
                    }else{
                        for(int i=0;i<jogos.size();i++){
                        if (jogo.equals(jogos.get(i))){
                            System.out.println("Este jogo ja esta na lista");
                        }else{
                            System.out.println("Jogo adicionado com sucesso");
                            jogos.add(jogo);
                        }
                    }
                    }
                    System.out.println();
                    break;
                    
                case 2:
                    for(String joguinhos : jogos){
                        System.out.println(joguinhos);
                    }
                    System.out.println();
                    break;
                    
                case 3:
                    //Listando jogos pra poder atualizar eles
                    for(String joguinhos : jogos){
                        System.out.println(joguinhos);
                    }
                    System.out.println();

                    System.out.println("Qual deles deseja atualizar? (digite a posição)");
                    int escolha = sc.nextInt();
                    System.out.println("Agora digite pro que atualizar");
                    String jogo1 = sc.next();

                    jogos.set(escolha-1, jogo1);
                    System.out.println();
                    break;

                case 4:
                    break;
                case 0:
                    System.out.println("Saindo...");
                    System.out.println();
                    break;

                default:
                    System.out.println("Opção invalida");
                    System.out.println();
                            break;
                        }
            

        }while(opcao!=0);
    }
}
