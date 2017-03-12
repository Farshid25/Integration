package services;

import model.Bewoner;
import model.Stad;

import java.util.ArrayList;
import java.util.List;

public class BewonerController {

    private void addBewoners(Stad s, int aantalBewoners ) {
        for (int i = 0; i < aantalBewoners; i++) {
            if (i <= 13) {
                s.getBewoners().add(new Bewoner("Test", i, s.getName(), true));
            } else {
                s.getBewoners().add(new Bewoner("Test",i, s.getName(), false));
            }
        }
    }
    public List<Stad> getCities() {
        List<Stad> steden = new ArrayList<Stad>();
        Stad stad1 = new Stad("Utrecht");
        this.addBewoners(stad1, 49 );  // er meot natuurlijk 4 nullen erbij in het echt, maar dit is om het klein te houden.
        Stad stad2 = new Stad("Amsterdam");
        this.addBewoners(stad2, 37 );  // er meot natuurlijk 4 nullen erbij in het echt, maar dit is om het klein te houden.
        steden.add(stad1);  // dit werkt niet optimaal(hij leest de eerste stad altijd en kan niet bepalen!!!)
        steden.add(stad2);
        return steden;    }

    public int geefAantalWerklozenPerStad(String stad) {
        for (Stad s : this.getCities()) {
              //for (Bewoner bewoner : s.getBewoners()) {
            if (stad.toUpperCase().equals("UTRECHT") || stad.toUpperCase().equals("AMSTERDAM")) {
                return this.getAantalWerklozen(s);}
                else if(!stad.toUpperCase().equals("UTRECHT") || !stad.toUpperCase().toUpperCase().equals("AMSTERDAM")){
                return 0;}
            }return 0;
    }

    public int getAantalWerklozen(Stad stad) {
        int aantal = 0;
        for (Bewoner bewoner : stad.getBewoners()) {
            if (bewoner.isWerkloos()) {
                aantal++;
            }
        }
        return aantal;
    }
    public int geefAantalArbeidersPerStad(String stad) {
        for (Stad s : this.getCities()) {
            //for (Bewoner bewoner : s.getBewoners()) {
            if (stad.toUpperCase().equals("UTRECHT") || s.getName().toUpperCase().equals("AMSTERDAM")) {
                return this.getAantalArbeiders(s);}
           // else{return 0;}
        }return 0;
    }
    public int getAantalArbeiders(Stad stad){
        int aantal=0;
        for(Bewoner bewoner: stad.getBewoners()){
            if(bewoner.isWerkloos()==false){
            aantal++;
        }}return aantal;
    }


    public int getAantalBewonersPerStad(Stad stad){int aantal=0;
        for(Bewoner b: stad.getBewoners()){
            aantal++;
        }return  aantal;
    }

    public int geefAantalBewonersPerStad(String stad){ //int aantal=0;
    for(Stad s: this.getCities()){
        if(stad.toUpperCase().equals("UTRECHT")|| stad.toUpperCase().equals("AMSTERDAM")) {
            return this.getAantalBewonersPerStad(s);   //s.getBewoners().size();
        }//else{return 0;}

    }return 0;
    }



}