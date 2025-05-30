package exercicios.um;
import java.util.Scanner;

public class MainApp{
    public static void main(String[] args){
        Produto teste = new Produto();
        Scanner scanner = new Scanner(System.in);

        teste.alterar_nome_produto(scanner);
        teste.alterar_preco_produto(scanner);
        teste.alterar_estoque_produto(scanner);
    
        teste.nome_produto();
        teste.preco_produto();
        teste.estoque_produto();

        return;
    }   
}