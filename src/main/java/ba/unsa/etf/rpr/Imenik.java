package ba.unsa.etf.rpr;

import java.util.*;

public class Imenik {
    private HashMap<String,TelefonskiBroj> imenik;
    void dodaj(String ime, TelefonskiBroj broj){
       imenik.put(ime,broj);
    }
    Imenik(){
        imenik=new HashMap<>();
    }
    String dajBroj(String ime) throws ElementNijePronadjen {
        if(imenik.containsKey(ime)) {
            return imenik.get(ime).ispisi();
        }
        else throw new ElementNijePronadjen("Element nije pronadjen");
    }
    String dajIme(TelefonskiBroj broj) throws ElementNijePronadjen{
        if(imenik.containsValue(broj)) {
            for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
                if (entry.getValue().equals(broj)) return entry.getKey();
            }
        }
        else throw new ElementNijePronadjen("Element nije pronadjen");
        return null;
    }
    String naSlovo(char s){
        String rez=null;
        for(Map.Entry<String ,TelefonskiBroj> entry : imenik.entrySet()){
            if(entry.getKey().charAt(0)==s) rez= entry.getKey() + "-" +entry.getValue().ispisi()+"\n";
        }
        return rez;
    }
    Set<String> izGrada(Grad g){
        TreeSet<String> rez= new TreeSet<>();
        for(Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet()){
            String pom=entry.getValue().ispisi();
            if(pom.startsWith(g.toString())) rez.add(entry.getKey());
        }
        return rez;
    }
    Set<String> izGradaBrojevi(Grad g){
        TreeSet<String> rez= new TreeSet<>();
        for(Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet()){
            String pom=entry.getValue().ispisi();
            if(pom.startsWith(g.toString())) rez.add(entry.getValue().ispisi());
        }
        return rez;
    }
}
