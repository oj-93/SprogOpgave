package com.company;

public class English implements Dialog{

    private String s = "English";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "presse q for quit";
    }

    @Override
    public String selectedLanguage() {
        return "the selected language is ";
    }

    @Override
    public String getCapital() {
        return "London town";
    }

    @Override
    public int getPopulation() {
        return 55980000;
    }
}
