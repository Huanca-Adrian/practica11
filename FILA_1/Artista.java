package FILA_1;

public class Artista {
    private String nombre;
    private String ci;
    private int añosExperiencia;

    public Artista(String nombre, String ci, int añosExperiencia) {
        this.nombre = nombre;
        this.ci = ci;
        this.añosExperiencia = añosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
}