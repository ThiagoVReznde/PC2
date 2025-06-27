public class Departamento {
    private
    String nome;
    Funcionario[] funcionarios;
    int quantidade;
    int capacidade;

    public 
    Departamento(String nome, int capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
        quantidade = 0;
    }

    void add_funcionario(Funcionario funcionario_novo){
        if (quantidade < capacidade){
            funcionarios[quantidade++] = funcionario_novo;
        } else System.out.println("Departamento cheio!");
    }

    void list_funcionario(){
        for (int i = 0; i < quantidade; i++){
            System.out.println("- " + funcionarios[i].getNome());
        }
    }

    float media_salarial(){
        float soma = 0;
        for (int i = 0; i < quantidade; i++){
            soma += funcionarios[i].getSalario();    
        }

        return soma/capacidade;
    }
}
