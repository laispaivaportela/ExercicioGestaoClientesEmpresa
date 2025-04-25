/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author laispaivaportela
 */
public
class PessoaJuridica extends Cliente {
    private String cnpjCliente;
    private String ieCliente;
    private Double rendimentoCliente;

    public PessoaJuridica () {
        this.cnpjCliente = "";
        this.ieCliente = "";
        this.rendimentoCliente = 0.00;
    }

    public PessoaJuridica (String nome , String endereco , String telefone , String cnpjCliente , String ieCliente , Double rendimentoCliente) {
        super (nome , endereco , telefone);
        this.cnpjCliente = cnpjCliente;
        this.ieCliente = ieCliente;
        this.rendimentoCliente = rendimentoCliente;
    }

    public
    String getCnpjCliente () {
        return this.cnpjCliente;
    }

    public
    void setCnpjCliente (String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

    public
    String getIeCliente () {
        return this.ieCliente;
    }

    public
    void setIeCliente (String ieCliente) {
        this.ieCliente = ieCliente;
    }

    public
    Double getRendimentoCliente () {
        return this.rendimentoCliente;
    }

    public
    void setRendimentoCliente (Double rendimentoCliente) {
        this.rendimentoCliente = rendimentoCliente;
    }

    public
    void cadastraCliente () {
        super.cadastraCliente ();
        System.out.println ("cnpj: ");
        setCnpjCliente (input.nextLine ());
        System.out.println ("i.e: ");
        setIeCliente (input.nextLine ());
        System.out.println ("faturamento: ");
        setRendimentoCliente (input.nextDouble ());
        input.nextLine ();
    }

    public
    String toString () {
        String toString = String.format (
                "%s\ncnpj: %s\ni.e: %s\nfaturamento: R$%s\n" ,
                super.toString () ,
                this.getCnpjCliente () ,
                this.getIeCliente () ,
                this.getRendimentoCliente ()
                                        );
        return toString;
    }
}
