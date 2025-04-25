/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import model.Cliente;
import model.PessoaFisica;
import model.PessoaJuridica;
/**
 *
 * @author laispaivaportela
 */
/*
A empresa de Contabilidade XYZ precisa fazer um levantamento do faturamento de seus
clientes. A empresa XYZ trabalha tanto com pessoas jurídicas como físicas. Para os clientes
que são pessoas jurídicas tem-se, o nome, endereço, telefone, C.N.P.J., I.E. e faturamento
como atributos. Paras as pessoas físicas tem-se, nome, endereço, telefone, CPF, RG e
Salário. Também deseja-se saber quem é o cliente de ambos os tipos que possuem o maior
rendimento.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
public class Principal {
    private final List<Cliente> clientes = new ArrayList<> ();
    private final List<String> nomesDosClientes = new ArrayList<> ();
    private final List<Double> rendimentoDosClientes = new ArrayList<> ();
    private static Scanner input = new Scanner (System.in);

    public static
    void main (String[] args) {
        System.out.println ("                     XYZ Contabilidade");
        new Principal ().menu ();
    }

    public
    void menu () {
        String menu = """
                ============[menu]=============
                [1] Cadastrar cliente
                [2] Ver todos os clientes
                [3] Cliente com maior rendimento
                [4] Acessar dados de cliente
                [0] Sair
                ===============================""";
        int opcao;
        do {
            System.out.println (menu);
            System.out.println ("Digite um número: ");
            opcao = input.nextInt ();
            input.nextLine (); // consumir a quebra de linha

            switch (opcao) {
                case 1 -> cadastrarCliente ();
                case 2 -> nomesDosClientes ();
                case 3 -> rendimentoClientes ();
                case 4 -> encontrarCliente ();
                case 0 -> System.out.println ("Saindo...");
                default -> System.out.println ("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private
    void cadastrarCliente () {
        System.out.println ("\n1. Pessoa Física\n2. Pessoa Jurídica");
        System.out.print ("Escolha o tipo de cliente: ");
        int tipo = input.nextInt ();
        input.nextLine ();
        if (tipo == 1) {
            PessoaFisica clienteFisico = new PessoaFisica ();
            clienteFisico.cadastraCliente ();
            clientes.add (clienteFisico);
        } else if (tipo == 2) {
            PessoaJuridica clienteJuridico = new PessoaJuridica ();
            clienteJuridico.cadastraCliente ();
            clientes.add (clienteJuridico);
        }
    }

    private
    void nomesDosClientes () { //metodo que cria lista contendo os nome dos clientes
        if (clientes.isEmpty ()) {
            System.out.println ("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                nomesDosClientes.add (cliente.getNomeCliente ());
}
                nomesDosClientes.sort (Comparator.naturalOrder ()); //ordena os nomes em ordem alfabetica
                mostrarClientes ();
            }
        }
    

    private
    void mostrarClientes () { //metodo para mostrar os nome dos clientes
        System.out.println ("\n--- Lista de Clientes ---");
        for (String nome : nomesDosClientes) {
            System.out.println (nome);
        }
    }

    public
    void encontrarCliente () { //encontra o cliente a partir do nome e acessa as informações dele
        if (!clientes.isEmpty ()) {
            System.out.println ("digite o nome do cliente: ");
            String nomeBuscado = input.nextLine ().trim();
int posicao = -1;
            for (int i = 0; i < clientes.size (); i++) {
                if (clientes.get (i).getNomeCliente ().equalsIgnoreCase (nomeBuscado.trim ())) {
                    posicao = i;
                    break;
}
}
if (posicao >= 0){
                    Cliente clienteEncontrado = clientes.get (posicao);
                    System.out.println ("Cliente encontrado:");
                    System.out.println ("Nome: " + clienteEncontrado.getNomeCliente ());
                    System.out.println ("Endereço: " + clienteEncontrado.getEnderecoCliente ());
                    System.out.println ("Telefone: " + clienteEncontrado.getTelefoneCliente ());
}
else  {
                    System.out.println ("Cliente com nome \"" + nomeBuscado + "\" não encontrado.");
                }
            
        }
}

    private void rendimentoClientes () { //metodo que cria lista contendo os rendimentos dos clientes
        int ultimoElemento = 0;
        double maiorRendimento = 0;
        if (!clientes.isEmpty ()) {
            for (Cliente cliente : clientes) {
                rendimentoDosClientes.add (cliente.getRendimentoCliente ());
            }
                rendimentoDosClientes.sort (Comparator.naturalOrder ()); //ordena os rendimentos em ordem natural (crescente) - agora o ultimo elemento é o maior rendimento
                ultimoElemento = (rendimentoDosClientes.size () - 1); //define qual é o último elemento
                maiorRendimento = rendimentoDosClientes.get (ultimoElemento);
                maiorRendimento(maiorRendimento);
        }
    }

    public void maiorRendimento (double maiorRendimento) { //encontra o cliente a partir do rendimento e acessa as informações dele
        if (!clientes.isEmpty ()) {
            for (int posicao = 0; posicao < clientes.size (); posicao++) {
                if (clientes.get (posicao).getRendimentoCliente () == maiorRendimento) {
                    Cliente clienteEncontrado = clientes.get (posicao);
                    System.out.println ("Cliente com maior rendimento encontrado:");
                    System.out.println ("Nome: " + clienteEncontrado.getNomeCliente ());
                    System.out.printf ("Rendimento: R$%.2f\n", maiorRendimento);
                }
            }

        }
    }
}