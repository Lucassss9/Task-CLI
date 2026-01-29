package com.lucas.taskcli.model;

public class Task {

    private int id;
    private String descricao;
    private boolean concluida;

    public Task(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setConcluida() {
        concluida = true;
    }

    public int getId() {
        return id;
    }
}
