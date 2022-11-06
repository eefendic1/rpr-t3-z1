package ba.unsa.etf.rpr;

public class MobilniBroj extends TelefonskiBroj{
    private String mobilni;
    MobilniBroj(int mobilnaMreza, String broj){
      mobilni="0"+ String.valueOf(mobilnaMreza)+ "/" +broj;
    }
    @Override
    public String ispisi() {
        return mobilni;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
