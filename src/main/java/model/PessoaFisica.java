/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author laispaivaportela
 */
public class PessoaFisica extends Cliente {
    private String cpfCliente;
    private String rgCliente;
    private Double rendimentoCliente;

    public PessoaFisica () {
        this.cpfCliente = "";
        this.rgCliente = "";
        this.rendimentoCliente = 0.00;
    }

    public PessoaFisica (String nome, String endereco, String telefone, String cpfCliente, String rgCliente, Double rendimentoCliente) {
        super(nome, endereco, telefone);
        this.cpfCliente = cpfCliente;
        this.rgCliente = rgCliente;
        this.rendimentoCliente = rendimentoCliente;
    }


    public String getCpfCliente () {
        return this.cpfCliente;
    }

    public void setCpfCliente (String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getRgCliente () {
        return this.rgCliente;
    }

    public void setRgCliente (String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public Double getRendimentoCliente () {
        return this.rendimentoCliente;
    }

    public void setRendimentoCliente (Double rendimentoCliente) {
        this.rendimentoCliente = rendimentoCliente;
    }
    public void cadastraCliente(){
        super.cadastraCliente ();
        System.out.println ("cpf: ");
        setCpfCliente (input.nextLine());
        System.out.println ("rg: ");
        setRgCliente (input.nextLine());
        System.out.println ("salário: ");
        setRendimentoCliente (input.nextDouble ());
        input.nextLine ();
    }
    public String toString() {
        String toString = String.format (
                "%s\ncpf: %s\nrg: %s\nsalário: R$%s\n" ,
                super.toString (),
                this.getCpfCliente () ,
                this.getRgCliente () ,
                this.getRendimentoCliente ()
                                        );
        return toString;
    }
}