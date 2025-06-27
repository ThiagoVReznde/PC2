public class Cliente {
    private
    String nome;
    String CPF;
    Conta conta;

    public
    Cliente(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
        this.conta = null;
    }

    void setCPF(String CPF) {
        this.CPF = CPF;
    }
    void setNome(String nome) {
        this.nome = nome;
    }
    void setConta(Conta conta) {
        this.conta = conta;
    }

    String getCPF() {
        return CPF;
    }
    String getNome() {
        return nome;
    }
    Conta getConta() {
        return conta;
    }
}