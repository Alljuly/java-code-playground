package com.example.dominio;

public abstract class Conteudo {
    private String title;
    private String description;
    protected static final double xp = 10d;

    public Conteudo() {

    }

    public abstract double calcXP();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
