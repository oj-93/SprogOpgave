package com.company;

public class Svensk implements Dialog{

    private String s = "svensk";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "du musta trykka q for at quitte";
    }

    @Override
    public String selectedLanguage() {
        return "dit valgte sprog er desværre";
    }

    @Override
    public String getCapital() {
        return "skraldespand";
    }

    @Override
    public int getPopulation() {
        return 10230000;
    }
}
