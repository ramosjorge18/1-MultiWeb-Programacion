
package tema9.ejercicio6;

/**
 *
 * @author pcbox
 */
public class Alumno {
    private int nExpediente;
    private String nombre;
    private Asignatura[] asignaturas;

    public Alumno(int nExpediente, String nombre) {
        setnExpediente(nExpediente);
        setNombre(nombre);
        asignaturas = new Asignatura[3]; // Maximo de asignatura por alumno 
    }
    
    public Alumno(int nExpediente){
        this(nExpediente, "Nombre");
    }

    public int getnExpediente() {
        return nExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setnExpediente(int nExpediente) {
        this.nExpediente = nExpediente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsignatura1 (Asignatura asignatura) {
        this.asignaturas[0] = asignatura;
    }
    public void setAsignatura2 (Asignatura asignatura) {
        this.asignaturas[1] = asignatura;
    }
    public void setAsignatura3 (Asignatura asignatura) {
        this.asignaturas[2] = asignatura;
    }
    
    
    
    
}
