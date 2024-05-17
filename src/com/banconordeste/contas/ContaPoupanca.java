package com.banconordeste.contas;

import com.banconordeste.model.Banco;
import com.banconordeste.model.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, double valorInicial, Banco agencia) {
        super(cliente, valorInicial, agencia);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}