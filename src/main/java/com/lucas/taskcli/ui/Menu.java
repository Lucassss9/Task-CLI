package com.lucas.taskcli.ui;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("1 - Adicionar tarefa \n" +
                "2 - Listar tarefas \n" +
                "0 - Sair");
    }

    public int mostrarMenuEObterEntrada () {
        System.out.println("Escolha uma opção: ");
        int escolha = sc.nextInt();
        sc.nextLine();
        return escolha;
    }

    public String lerMensagem() {
        System.out.println("Digite a descrição: ");
        String descricao = sc.nextLine();
        return descricao;
    }
}
