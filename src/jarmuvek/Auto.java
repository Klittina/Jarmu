package jarmuvek;

public class Auto{
    private boolean defekt;

    public Auto(boolean defekt) {
        this.defekt = defekt;
    }

    public boolean isDefekt() {
        return defekt;
    }

    public void setDefekt(boolean defekt) {
        this.defekt = defekt;
    }

    @Override
    public String toString() {
        return "Auto{" + "defekt=" + defekt + '}';
    }
    
    public void kereketCserel(){
        
    }
    public boolean halad(){
        return false;
    }
}
