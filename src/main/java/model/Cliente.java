/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author laispaivaportela
 */
import java.util.Scanner;

public
class Cliente {
    static Scanner input = new Scanner (System.in);
    private String nomeCliente;
    private String enderecoCliente;
    private String telefoneCliente;
    private Double rendimentoCliente;

    public Cliente () {
        this.nomeCliente = "";
        this.enderecoCliente = "";
        this.telefoneCliente = "";
    }

    public Cliente (String nomeCliente , String enderecoCliente , String telefoneCliente) {
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
    }
            public String getNomeCliente () {
                return this.nomeCliente;
            }

            public void setNomeCliente (String nomeCliente) {
                this.nomeCliente = nomeCliente;
            }

            public String getTelefoneCliente () {
                return this.telefoneCliente;
            }

            public void setTelefoneCliente (String telefoneCliente) {
                this.telefoneCliente = telefoneCliente;
            }

            public String getEnderecoCliente () {
                return this.enderecoCliente;
            }

            public void setEnderecoCliente (String enderecoCliente) {
                this.enderecoCliente = enderecoCliente;
            }
    public Double getRendimentoCliente () {
        return this.rendimentoCliente;
    }

    public void setRendimentoCliente (Double rendimentoCliente) {
        this.rendimentoCliente = rendimentoCliente;
    }
            public void cadastraCliente(){
                System.out.println ("cadastro cliente");
                System.out.println ("nome: ");
                setNomeCliente (input.nextLine ().trim());
                System.out.println ("endereço: ");
                setEnderecoCliente (input.nextLine ());
                System.out.println ("telefone: ");
                setTelefoneCliente (input.nextLine ());
            }
    public String toString() {
        String toString = String.format (
                "nome: %s\nendereco %s\ntelefone: %s\n" ,
                super.toString (),
                this.getNomeCliente () ,
                this.getEnderecoCliente () ,
                this.getTelefoneCliente ()
                                        );
        return toString;
    }

        }