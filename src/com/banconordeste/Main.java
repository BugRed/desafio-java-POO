package com.banconordeste;


import com.banconordeste.model.Banco;
import com.banconordeste.contas.Conta;
import com.banconordeste.contas.ContaCorrente;
import com.banconordeste.contas.ContaPoupanca;
import com.banconordeste.model.Cliente;


public class Main {

    public static void main(String[] args) {

        //Criando clientes
        Cliente c1 = new Cliente("Skull");
        Cliente c2 = new Cliente("Venancio");

        //Instanciando bancos enquuando instancio as contas
        Conta ccC1 = new ContaCorrente(c1,5000, new Banco("Bradesco"));
        Conta ccC2 = new ContaCorrente(c2,1200, new Banco("Caixa"));

        Conta cpC1 = new ContaPoupanca(c1, 60000, new Banco("Caixa"));
        Conta cpC2 = new ContaPoupanca(c2, 10000, new Banco("Caixa"));

        //Imprimindo contas
        ccC1.imprimirInfosComuns();
        System.out.println("-----------------------");
        cpC1.imprimirInfosComuns();
        System.out.println("-----------------------");
        ccC2.imprimirInfosComuns();
        System.out.println("-----------------------");
        cpC2.imprimirInfosComuns();

        //O primeiro da certo o segundo não
        ccC1.sacar(1000);
        ccC2.sacar(5000);
        System.out.println("-----------------------");

        //Deposito
        cpC1.depositar(10);
        cpC2.depositar(105);
        System.out.println("-----------------------");

        //Novamente um erro e um acerto
        ccC1.transferir(5000, ccC2);
        ccC2.transferir(200, cpC2);
        System.out.println("-----------------------");


        ccC1.imprimirInfosComuns();
        System.out.println("-----------------------");
        cpC1.imprimirInfosComuns();
        System.out.println("-----------------------");
        ccC2.imprimirInfosComuns();
        System.out.println("-----------------------");
        cpC2.imprimirInfosComuns();




    }

}