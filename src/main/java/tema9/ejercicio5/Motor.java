
package tema9.ejercicio5;

/**
 *
 * @author pcbox
 */
public class Motor {
    
    private int litrosAceite;
    private int cv;
    
    public Motor(int cv){
        this.cv=cv;
        this.litrosAceite = 0;
    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public int getCv() {
        return cv;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }
    public void añadeLitros(){
        this.litrosAceite = this.litrosAceite+10;
    }

    @Override
    public String toString() {
        return "\n Motor{" + "litrosAceite=" + litrosAceite + ", cv=" + cv + '}'+"\n";
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
    
    
    
}
