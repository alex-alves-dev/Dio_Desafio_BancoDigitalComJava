public class main {

    public static void main(String[] args) {
        Banco bancoInicial = new Banco(); //instancia novo banco

        bancoInicial.setNome("Banco PoligonoCubico"); //insere nome do banco

        Cliente alex = new Cliente("Alex", bancoInicial);  //criado novo cliente Alex
        alex.setNome("Alex Alves"); //insere o nome do cliente

        Conta ccorrente = new ContaCorrente(alex); //instanciada nova conta corrente

        ccorrente.depositar(100); //criado um deposito em conta corrente

        Cliente carmem = new Cliente("Carmem", bancoInicial);  //instancia novo cliente
        Conta cpoupanca = new ContaPoupanca(carmem);  //instanciada nova conta poupanca

        ccorrente.imprimirExtrato();  //imprime extrato de ccorrente Alex
        cpoupanca.imprimirExtrato();  //imprime estrato de cpoupanca Carmem

        ccorrente.transferir(48, cpoupanca);  //faz tranferencia de ccorrente Alex pra cpoupanca Carmem

        ccorrente.imprimirExtrato(); //imprime extrato atualizado de ccorrente Alex
        cpoupanca.imprimirExtrato(); //imprime extrato atualizado de cpoupanca Carmem
        bancoInicial.mostrarClientes(); //mostra lista de clientes

        Cliente marcos = new Cliente("Marcos", bancoInicial);  //instancia novo cliente Marcos
        Conta ccorrente2 = new ContaCorrente(marcos); //instancia nova ccorrente2 de Marcos
        ccorrente2.imprimirExtrato();  //imprime  ccorrente2 de Marcos
        bancoInicial.mostrarClientes(); //mostra lista atualizada de clientes do banco
    }

}
