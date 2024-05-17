package com.banconordeste.contas;

import com.banconordeste.model.Banco;
import com.banconordeste.enums.AgenciasBancarias;
import com.banconordeste.model.Cliente;
import lombok.Getter;

import java.time.LocalDate;


public abstract class Conta implements IConta {

    private @Getter AgenciasBancarias agencia;

    protected @Getter int numero;
    protected @Getter double saldo;
    protected @Getter Cliente cliente;
    protected @Getter Banco banco;
    private @Getter LocalDate dataDeInscricao;
    private @Getter static int SEQUENCIAL;

    public Conta(Cliente cliente, double valorInicial, Banco banco) {
        this.banco = banco;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = valorInicial;
        this.dataDeInscricao = LocalDate.now();
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.printf("Saque não autorizado!\nValor de saldo insuficiente! Saldo atual: %.2f\n", getSaldo());
        } else {
            saldo -= valor;
            System.out.printf("Seu saque foi autorizado!\nO saldo de %s agora é: %.2f\n", this.cliente.getNome(), getSaldo());
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > saldo) {
            System.out.printf("Deposito não autorizado!\nValor de saldo insuficiente! Saldo atual: %.2f\n", getSaldo());
        } else {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.printf("Foi enviado o valor de %.2f da conta de: " + cliente.getNome() + " para a conta de: " + contaDestino.getCliente().getNome() + "\n", valor);
        }
    }

    public void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.println("Agencia: " + this.getBanco().getNome());
        System.out.printf("Numero: %d%n", this.getNumero());
        System.out.printf("Saldo: %.2f%n", this.getSaldo());
        System.out.println("Data de Inscricao: " + dataDeInscricao);
    }
}