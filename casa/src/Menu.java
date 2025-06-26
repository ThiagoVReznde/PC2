import java.util.Scanner;

public class Menu{
    private
    Casa casa;

    public
    Menu(){
        Scanner scan = new Scanner(System.in);
        Boolean rodando = true;

        System.out.println("oioi qnts comodos tem essa bomba?");
        int max = scan.nextInt();
        casa = new Casa(max);
        
        while (rodando) {
            int opcao;

            System.out.println("agr escolhe a opcao");
            System.out.println("1- add comodo");
            System.out.println("2- list comodo");
            System.out.println("3- calc area");
            System.out.println("4- sair");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    String nome;
                    int area;

                    System.out.println("nome do comodo");
                    scan.nextLine();
                    nome = scan.nextLine();
                    System.out.println("area do comodo");
                    area = scan.nextInt();
                    System.out.println("");

                    casa.set_Comodo(nome, area);

                    break;
                case 2:
                    casa.listar_Comodos();

                    break;
                case 3:
                    System.out.println("Area - " + casa.Calc_Area_Total() + " m2");
                    System.out.println("");

                    break;
                case 4:
                    rodando = false;
                    System.out.println("baibaaaaaaaaaaaaaai");
                    break;
            
                default:
                    System.out.println("");
                    System.out.println("haha nn tem esssa opcao burroburroburroburroburroburroburroburro");
                    break;
            }
        }

        scan.close();
    }
}
