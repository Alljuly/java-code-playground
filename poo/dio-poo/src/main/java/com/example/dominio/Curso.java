package com.example.dominio;

public class Curso extends Conteudo {

    private int hours;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Curso() {

    }

    @Override
    public String toString() {
        return "Curso [title=" + super.getTitle() + ", description=" + super.getDescription() + ", hours=" + hours
                + "]";
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
    public double calcXP() {
        return xp * hours;
    }

}
