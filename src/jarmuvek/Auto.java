package jarmuvek;

public class Auto extends Jarmu{
    private boolean defekt;

    public Auto(boolean defekt, boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        super(beinditva, uzemanyag, megerkezett);
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
        if(defekt == true){
            defekt = false;
        }
    }
    public boolean halad(){
        return false;
    }
}
