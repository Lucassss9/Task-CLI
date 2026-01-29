package com.lucas.taskcli.ui;

import com.lucas.taskcli.model.Task;

import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("1 - Adicionar tarefa \n" +
                "2 - Listar tarefas \n" +
                "3- Concluir Tarefa \n"  +
                "0 - Sair");
    }

    public int mostrarMenuEObterEntrada() {
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

    public void concluirTask(List<Task> tasks) {
        System.out.println("Qual Task você concluiu? (Concluir por Id) \n");
        Integer id = sc.nextInt();

        for (Task list : tasks) {
            if (list.getId() == id && !list.isConcluida()) {
                list.setConcluida();
                System.out.println("Task '" + id + "' concluida.");
                return;
            } else if (list.getId() == id && list.isConcluida()) {
                System.out.println("Task '" + id + "' já está concluída.");
            }
        }

        System.out.println("Id não existe.");
    }
}
