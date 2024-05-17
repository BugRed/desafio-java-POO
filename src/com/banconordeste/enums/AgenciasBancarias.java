package com.banconordeste.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AgenciasBancarias {
    BRADESCO("Bradesco"),
    ITAU("Itaú"),
    CAIXA_ECONOMICA("Caixa Econômica Federal"),
    BANCO_DO_BRASIL("Banco do Brasil"),
    SANTANDER("Santander"),
    BRADESCO_PRIME("Bradesco Prime"),
    BRADESCO_EMPRESAS("Bradesco Empresas"),
    ITAU_PERSONNALITE("Itaú Personnalité"),
    CAIXA_AQUI("Caixa Aqui"),
    BRADESCO_EXPRESSO("Bradesco Expresso");

    private final String nome;


}