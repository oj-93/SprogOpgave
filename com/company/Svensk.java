package com.company;

public class Svensk implements Dialog{

    private String s = "svensk";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "svensk snak";
    }

    @Override
    public String selectedLanguage() {
        return "mere svensk lort";
    }
}
