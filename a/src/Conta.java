public class Conta {
    private
    Cliente cliente;
    String senha;
    double saldo;

    public
    Conta(Cliente cliente){
        this.cliente = cliente;
        this.senha = new String("PH" + cliente.getCPF().substring(0, 5));
        this.saldo = 0;
    }

    void deposito(double valor){
        if (valor > 0) {
            System.out.println("\n-> Depósito efetuado com sucesso");
            saldo += valor;
        } else System.out.println("\n-> Erro ao efetuar o depósito");
    }

    void sacar(double valor){
        if (valor < saldo && valor > 0) {
            System.out.println("\n-> Saque efetuado com sucesso");
            saldo -= valor;
        } else System.out.println("\n-> Erro ao efetuar saque");
    }

    void mostrar_saldo(){
        System.out.println("--------------------------------------");
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("CPF do cliente: " + cliente.getCPF());
        System.out.println("Numero da Conta: " + senha);
        System.out.println("Saldo: " + saldo);
        System.out.println("--------------------------------------");
    }
}