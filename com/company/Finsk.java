package com.company;

public class Finsk implements Dialog{
    private String s = "Finsk";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "paina q poistuaksesi";
    }

    @Override
    public String selectedLanguage() {
        return "valitsemasi kieli on";
    }

    @Override
    public String getCapital() {
        return "Helsinki";
    }

    @Override
    public int getPopulation() {
        return 10;
    }
}
