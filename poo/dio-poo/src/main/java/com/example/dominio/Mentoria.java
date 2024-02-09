package com.example.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate date;

    public Mentoria() {

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calcXP() {
        return xp + 20d;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public String getTitle() {

        return super.getTitle();
    }

    @Override
    public void setDescription(String description) {

        super.setDescription(description);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String toString() {
        return "Mentoria [title=" + super.getTitle() + ", description=" + super.getDescription() + ", date=" + date
                + "]";
    }

}
