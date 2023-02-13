package teszt;

import modell.Auto;

public class JarmuTeszt {
    public static void main(String[] args) {
        new JarmuTeszt();
    }
    
    public JarmuTeszt(){
        mintaSablonTeszt();
        haladEBeinditassal();
        leallitvaTankolE();
    }
    
    private void haladAutoBeinditasNlkTeszt(){
        Auto auto = new Auto();
        boolean kapott = auto.halad();
    }
    
    public void mintaSablonTeszt(){
        int kapott = 7;
        int vart = 3;
        assert kapott == vart : "nem egyenlőek";
    }
    
    /*Saját tesztek*/
    
    private void haladEBeinditassal() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "nem tud menni beinditva";

    }
    
    private void leallitvaTankolE() {
        Auto auto = new Auto();
        auto.isBeinditva();
        boolean kapott = auto.isBeinditva();
        boolean vart = false;
        assert kapott == vart : "jár a motor -> nincs tankolás";
    }
    
    private void defektelMegy(){
        Auto auto = new Auto();
        auto.isDefekt();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "nemjó, defekttel megy";
    }
}
