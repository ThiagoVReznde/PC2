package exercicios.um;
import java.util.Scanner;

public class Produto {
    private String Nome;
    private int PrecoVezes100;
    private int quantidadeEmEstoque;

    public
    void alterar_nome_produto(Scanner scanner){
        Nome = scanner.nextLine();
        scanner.nextLine();
    }
    void alterar_preco_produto(Scanner scanner){
        boolean aceitavel = true;
        
        while (aceitavel) {
            PrecoVezes100 = (int) scanner.nextFloat()*100;
            scanner.nextLine();
            if (PrecoVezes100 < 0) {
                System.out.println("Erro! Digite valores maiores ou iguais a 0.");
            } else aceitavel = false;    
        }
    }
    
    void alterar_estoque_produto(Scanner scanner){
        boolean aceitavel = true;
        
        while (aceitavel) {
            quantidadeEmEstoque = scanner.nextInt();
            scanner.nextLine();
            if (quantidadeEmEstoque < 0) {
                System.out.println("Erro! Digite valores maiores ou iguais a 0.");
            } else aceitavel = false;    
        }
    }

    void nome_produto(){
        System.out.println(Nome);
    }
    void preco_produto(){
        System.out.println("R$" + PrecoVezes100/100);
    }
    void estoque_produto(){
        System.out.println(quantidadeEmEstoque + "em estoque");
    }
}