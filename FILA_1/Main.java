package FILA_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Artista artista1 = new Artista("Juan Pérez", "12345678", 5);
        Artista artista2 = new Artista("María Gómez", "87654321", 8);
        Artista artista3 = new Artista("Luis Torres", "45678901", 10);

        List<Artista> artistasP1 = new ArrayList<>();
        artistasP1.add(artista1);
        artistasP1.add(artista2);

        List<Artista> artistasP2 = new ArrayList<>();
        artistasP2.add(artista3);

        Anuncio anuncio1 = new Anuncio(1, 3000.00);
        Pintura pinturaConAnuncio = new Pintura("Atardecer", "Óleo", artistasP1, anuncio1, "Paisaje");
        Pintura pinturaSinAnuncio = new Pintura("Retrato Realista", "Acrílico", artistasP2, null, "Retrato");

        Artista mejorArtista = null;
        mejorArtista = obtenerArtistaConMasExperiencia(pinturaConAnuncio.getArtistas(), mejorArtista);
        mejorArtista = obtenerArtistaConMasExperiencia(pinturaSinAnuncio.getArtistas(), mejorArtista);

        System.out.println("Artista con más experiencia: " + mejorArtista.getNombre());

        Anuncio anuncio2 = new Anuncio(2, 1800.00);
        pinturaSinAnuncio.setAnuncio(anuncio2);

        double totalVenta = pinturaConAnuncio.getAnuncio().getPrecio() + pinturaSinAnuncio.getAnuncio().getPrecio();
        System.out.println("Monto total de venta de ambas pinturas: $" + totalVenta);
    }

    private static Artista obtenerArtistaConMasExperiencia(List<Artista> lista, Artista actual) {
        for (Artista a : lista) {
            if (actual == null || a.getAñosExperiencia() > actual.getAñosExperiencia()) {
                actual = a;
            }
        }
        return actual;
    }
}
