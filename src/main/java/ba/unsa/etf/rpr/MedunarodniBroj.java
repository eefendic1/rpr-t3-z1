package ba.unsa.etf.rpr;

public class MedunarodniBroj extends TelefonskiBroj{
    private String medunarodni;
    MedunarodniBroj(String drzava, String broj){
        medunarodni=drzava+broj;
    }
    @Override
    public String ispisi() {
        return medunarodni;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
