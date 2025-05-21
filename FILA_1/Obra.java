package FILA_1;
import java.util.List;

public class Obra {
    private String titulo;
    private String material;
    private List<Artista> artistas;
    private Anuncio b;

    public Obra(String titulo, String material, List<Artista> artistas, Anuncio b) {
        this.titulo = titulo;
        this.material = material;
        this.artistas = artistas;
        this.b = b;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    public Anuncio getAnuncio() {
        return b;
    }

    public void setAnuncio(Anuncio b) {
        this.b = b;
    }
}

