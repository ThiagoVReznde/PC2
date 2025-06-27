
import java.util.Scanner;

public class Interface {
    private
    Departamento[] departamentos_empresa;
    Funcionario[] funcionarios_empresa;
    int qnt_departamentos;
    int qnt_funcionarios;

    public
    Interface(){
        Scanner scan = new Scanner(System.in);
        boolean rodando = true;
        int opcao;
        qnt_departamentos = 0;
        qnt_funcionarios = 0;

        do{
            System.out.println("\n=== Menu ===");
            System.out.println("1. Criar Departamento");
            System.out.println("2. Criar Funcionário");
            System.out.println("3. Adicionar Funcionário ao Departamento");
            System.out.println("4. Listar Funcionários do Departamento");
            System.out.println("5. Mostrar Média Salarial");
            System.out.println("6. Sair");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                System.out.print("Digite o nome do departamento: ");
                String nomeDepto = scan.nextLine();
                System.out.print("Digite a capacidade máxima de funcionários: ");
                int capacidade = scan.nextInt();
                scan.nextLine();
                departamentos_empresa[qnt_departamentos++] = new Departamento(nomeDepto, capacidade);
                System.out.println("Departamento criado com sucesso!");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (rodando);

        scan.close();
    }


}
