
import java.util.Scanner;

public class Menu {
    public
    Menu(){
        Scanner scan = new Scanner(System.in);
        Impressora impressora = new Impressora();
        Documento documento = null;
        int opcao;
        
        do {
            System.out.println("\n=== MENU IMPRESSORA ===");
            System.out.println("1. Criar documento");
            System.out.println("2. Imprimir documento");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine(); // Limpar o buffer
            
            switch (opcao) {
            case 1:
                System.out.print("Digite o título do documento: ");
                String titulo = scan.nextLine();
                System.out.print("Digite o conteúdo do documento: ");
                String conteudo = scan.nextLine();
                documento = new Documento(titulo, conteudo);
                System.out.println("Documento criado com sucesso!");
            break;
            case 2:
                if (documento == null) {
                    System.out.println("Nenhum documento criado ainda.");
                } else {
                    impressora.imprimir(documento);
                }
                break;
            case 3:
                System.out.println("Encerrando o programa.");
            break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
            }
            
            } while (opcao != 3);
            scan.close();
            
    
        }
}
