package com.lucas.taskcli;

import com.lucas.taskcli.model.Task;
import com.lucas.taskcli.ui.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int nextId = 1;

    public static void main(String[] args) {
        System.out.println("Task CLI Iniciado... \n ");

        List<Task> tasks = new ArrayList<>();

        Menu menu = new Menu();

        boolean running = true;

        while (running) {

            menu.menu();

            int escolha = menu.mostrarMenuEObterEntrada();

            switch (escolha) {
                case 0:
                    System.out.println("Encerrando...");
                    running = false;
                    break;
                case 1:
                    String descricao = menu.lerMensagem();

                    Task task = new Task(nextId, descricao);

                    tasks.add(task);

                    System.out.println("Criada tarefa #" + nextId);
                    System.out.println(" ");
                    nextId++;
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada...");
                        break;
                    }
                    for (Task list : tasks) {
                        String status = list.isConcluida() ? "CONCLUÍDA" : "PENDENTE";

                        System.out.println("[#" + list.getId() + "] " + list.getDescricao() + " - " + status);
                    }
                    break;
                case 3:
                    menu.concluirTask(tasks);
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
