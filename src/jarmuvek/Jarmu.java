package jarmuvek;

public class Jarmu{
    private boolean beinditva,uzemanyag,megerkezett;

    public Jarmu(boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        this.beinditva = beinditva;
        this.uzemanyag = uzemanyag;
        this.megerkezett = megerkezett;
    }

    public boolean isBeinditva() {
        return beinditva;
    }

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public boolean isMegerkezett() {
        return megerkezett;
    }

    public void setBeinditva(boolean beinditva) {
        this.beinditva = beinditva;
    }

    public void setUzemanyag(boolean uzemanyag) {
        this.uzemanyag = uzemanyag;
    }

    public void setMegerkezett(boolean megerkezett) {
        this.megerkezett = megerkezett;
    }

    @Override
    public String toString() {
        return "Jarmu{" + "beinditva=" + beinditva + ", uzemanyag=" + uzemanyag + ", megerkezett=" + megerkezett + '}';
    }
    
    public void beindit(){
        
    }
    public void leallit(){
        
    }
    public boolean tankol(){
        return false;
    }
    public boolean halad(){
        return false;
    }
    
}
