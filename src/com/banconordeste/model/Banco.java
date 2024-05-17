package com.banconordeste.model;

import com.banconordeste.enums.AgenciasBancarias;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
public class Banco {
    private @Setter String nome;
    private final List<AgenciasBancarias> agencias;


    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
        if(nome.equalsIgnoreCase("Itaú")){
            agencias.add(AgenciasBancarias.ITAU_PERSONNALITE);
            agencias.add(AgenciasBancarias.ITAU);
        } else if (nome.equalsIgnoreCase("Bradesco")) {
            agencias.add(AgenciasBancarias.BRADESCO_EMPRESAS);
            agencias.add(AgenciasBancarias.BRADESCO_EXPRESSO);
            agencias.add(AgenciasBancarias.BRADESCO_PRIME);
            agencias.add(AgenciasBancarias.BRADESCO);
        } else if (nome.equalsIgnoreCase("Caixa")) {
            agencias.add(AgenciasBancarias.CAIXA_AQUI);
            agencias.add(AgenciasBancarias.CAIXA_ECONOMICA);
        }else{
            System.out.println("Digite um dos três bancos existentes: Itaú, Bradesco ou Caixa");
        }
    }

    public void adicionarAgencia(AgenciasBancarias agencia) {
        agencias.add(agencia);
    }

    public String getAgencias(String agencia) {
        List<AgenciasBancarias> agenciasAchadas = agencias.stream().filter(a -> a.getNome().startsWith(agencia)).toList();
        return agenciasAchadas.getFirst().toString();
    }

    public void exibirAgenciasDoBanco() {
        if (!agencias.isEmpty()) {
            agencias.forEach(System.out::println);
        } else {
            System.out.println("A lista de agencias desse banco está vazia!");
        }
    }
}
