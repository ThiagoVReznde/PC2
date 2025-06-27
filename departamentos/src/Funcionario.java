public class Funcionario {
    private
    String nome;
    int salario;

    public 
    Funcionario(String nome, int salario){
        this.nome = nome;
        this.salario = salario;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setSalario(int salario){
        this.salario = salario;
    }

    String getNome() {
        return nome;
    }

    int getSalario() {
        return salario;
    }
}
