package model;

import java.util.ArrayList;

public class Stad {
    private String name;
    private ArrayList<Bewoner> bewoners;

    public Stad(String name) {
        this.name = name;
        bewoners = new ArrayList<Bewoner>(); // maakt 1 lege list.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Bewoner> getBewoners() {
        return bewoners;
    }

    public void setBewoners(ArrayList<Bewoner> bewoners) {
        this.bewoners = bewoners;
    }
}
