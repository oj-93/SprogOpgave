package com.company;

public class Portugisisk implements Dialog {

    private String s = "Portugisisk";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "pressione q para sair";
    }

    @Override
    public String selectedLanguage() {
        return "seu idioma escolhido é";
    }

    @Override
    public String getCapital() {
        return "Lissabon";
    }

    @Override
    public int getPopulation() {
        return 10280000;
    }
}
