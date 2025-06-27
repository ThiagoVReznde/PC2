import java.util.Scanner;

public class Menu {
    private
    Cliente[] clientes;
    int qnt_clientes;
    int qnt_contas;

    public
    Menu(){
        int MAX = 100;
        clientes = new Cliente[MAX];
    }

    boolean listar_clientes(){
        if(qnt_clientes > 0){
            System.out.println("Selecione o cliente:");
            for(int indice = 0; indice < qnt_clientes; indice++){
                System.out.println(indice + "- " + clientes[indice].getNome());
            }

            return true;
        } else return false;
    }

    boolean listar_clientes_sem_conta(){
        if(qnt_clientes > qnt_contas){
            System.out.println("Selecione o cliente:");
            for(int indice = 0; indice < qnt_clientes; indice++){
                if (clientes[indice].getConta() == null) {
                    System.out.println(indice + "- " + clientes[indice].getNome());
                }
            }
            return true;
        } else return false;
    }

    boolean listar_clientes_com_conta(){
        if(qnt_contas > 0){
            System.out.println("Selecione o cliente:");
            for(int indice = 0; indice < qnt_clientes; indice++){
                if (clientes[indice].getConta() != null) {
                    System.out.println(indice + "- " + clientes[indice].getNome());
                }
            }
            return true;
        } else return false;
    }

    boolean verif_conta_cliente(Cliente cliente){
        if(cliente.getConta() == null){
            return true;
        }

        return false;
    }

    boolean verif_conta_indice(int i){
        if(i < 0 || i >= qnt_clientes){
            return true;
        }

        return false;
    }

    void rodar_sistema(){
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("\n*** Bem vindo ao BancoPH ***");
        do{
            System.out.println("\n/-------------------/");
            System.out.println(" Selecione uma opção:");
            System.out.println("1- Cadastrar Cliente");
            System.out.println("2- Criar Conta");
            System.out.println("3- Depósito");
            System.out.println("4- Saque");
            System.out.println("5- Mostrar Saldo");
            System.out.println("6- Sair");
            System.out.println("/-------------------/");
            System.out.print("- ");
            opcao = scan.nextInt();
            scan.nextLine();
            System.out.print("\n");

            switch (opcao) {
                
                case 1: // cadastro cliente
                    String nome, CPF;

                    System.out.print("- Escreva seu nome completo: ");
                    nome = scan.nextLine();
                    System.out.print("- Escreva seu CPF (apenas números): ");
                    CPF = scan.nextLine();

                    Cliente novo_Cliente = new Cliente(nome, CPF);
                    clientes[qnt_clientes] = novo_Cliente;
                    qnt_clientes++;

                    System.out.println("\n-> Cliente cadastrado com sucesso.");
                    break;
                
                case 2: // criar conta
                    if (listar_clientes_sem_conta()) {
                        int indice;
                        indice = scan.nextInt();
                        if(verif_conta_indice(indice) || !verif_conta_cliente(clientes[indice])){
                            System.out.println("\n-> Erro ao criar conta");
                            break;
                        }

                        Conta nova_Conta = new Conta(clientes[indice]);
                        clientes[indice].setConta(nova_Conta);
                        qnt_contas++;
                        System.out.println("\n-> Conta criada com sucesso.");

                    } else System.out.println("\n-> Para criar uma conta primeiro é necessário ser cliente do BancoPH");

                    break;

                case 3: // deposito
                    if (listar_clientes_com_conta()) {
                        int indice;
                        indice = scan.nextInt();

                        if(verif_conta_indice(indice) || verif_conta_cliente(clientes[indice])){
                            System.out.println("\n-> Erro ao depositar");
                            break;
                        }
                        
                        double valor;
                        System.out.println("\n-> Digite o valor do deposito: ");
                        System.out.print("R$ ");
                        valor = scan.nextDouble();
                        clientes[indice].getConta().deposito(valor);

                    } else System.out.println("\n-> Para depositar dinheiro primeiro é necessário ser cliente do BancoPH");
                    
                    break;
                case 4: // saque
                    if (listar_clientes_com_conta()) {
                        int indice;
                        indice = scan.nextInt();
                        if(verif_conta_indice(indice) || verif_conta_cliente(clientes[indice])){
                            System.out.println("\n-> Erro ao sacar");
                            break;
                        }

                        double valor;
                        System.out.println("\n-> Digite o valor do saque:");
                        System.out.print("R$ ");
                        valor = scan.nextDouble();
                        clientes[indice].getConta().sacar(valor);

                    } else System.out.println("\n-> Para sacar dinheiro primeiro é necessário ser cliente do BancoPH");
                    break;
                case 5:
                if (listar_clientes_com_conta()) {
                    int indice;
                    indice = scan.nextInt();
                    if(verif_conta_indice(indice) || verif_conta_cliente(clientes[indice])){
                        System.out.println("\n-> Erro ao mostrar saldo");
                        break;
                    }

                    clientes[indice].getConta().mostrar_saldo();
                } else System.out.println("\n-> É necessário criar uma conta para efetuar essa operação");
                    
                break;

                case 6:
                System.out.println("\n*** Desligando sistema... ***\n");
                    
                break;    
            
                default:
                System.out.println("\n-> Opção Inválida");
                    break;
            }
        } while (opcao != 6);

        scan.close();
    }
}