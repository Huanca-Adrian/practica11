package FILA_1;

import java.util.List;

public class Pintura extends Obra {
    private String genero;

    public Pintura(String titulo, String material, List<Artista> artistas, Anuncio anuncio, String genero) {
        super(titulo, material, artistas, anuncio);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
