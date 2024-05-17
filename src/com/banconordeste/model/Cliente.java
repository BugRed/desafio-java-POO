package com.banconordeste.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
}