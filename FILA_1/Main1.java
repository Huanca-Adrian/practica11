package FILA_1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        Artista artista1 = new Artista("Carlos Soto", "11111111", 7);
        Artista artista2 = new Artista("Ana Ruiz", "22222222", 10);
        Artista artista3 = new Artista("Luis Vargas", "33333333", 5);
        Artista artista4 = new Artista("Carlos Soto", "44444444", 8); 

        List<Artista> artistasP1 = new ArrayList<>();
        artistasP1.add(artista1);
        artistasP1.add(artista2);

        List<Artista> artistasP2 = new ArrayList<>();
        artistasP2.add(artista3);
        artistasP2.add(artista4);

        Anuncio anuncio1 = new Anuncio(1, 3200.00);
        Anuncio anuncio2 = new Anuncio(2, 2800.00);

        Pintura pintura1 = new Pintura("Mar", "Óleo", artistasP1, anuncio1, "Paisaje");
        Pintura pintura2 = new Pintura("Ciudad", "Acrílico", artistasP2, anuncio2, "Urbano");

        int sumaAños = 0;
        int totalArtistas = 0;

        for (Artista a : pintura1.getArtistas()) {
            sumaAños += a.getAñosExperiencia();
            totalArtistas++;
        }

        for (Artista a : pintura2.getArtistas()) {
            sumaAños += a.getAñosExperiencia();
            totalArtistas++;
        }

        double promedio = (double) sumaAños / totalArtistas;
        System.out.println("Promedio de años de experiencia: " + promedio);

        String nombreBuscado = "Carlos Soto";
        double incremento = 500.00;

        if (contieneArtistaConNombre(pintura1, nombreBuscado)) {
            double nuevoPrecio = pintura1.getAnuncio().getPrecio() + incremento;
            pintura1.getAnuncio().setPrecio(nuevoPrecio);
        }

        if (contieneArtistaConNombre(pintura2, nombreBuscado)) {
            double nuevoPrecio = pintura2.getAnuncio().getPrecio() + incremento;
            pintura2.getAnuncio().setPrecio(nuevoPrecio);
        }

        System.out.println("Nuevo precio pintura 1: " + pintura1.getAnuncio().getPrecio());
        System.out.println("Nuevo precio pintura 2: " + pintura2.getAnuncio().getPrecio());
    }

    private static boolean contieneArtistaConNombre(Pintura pintura, String nombre) {
        for (Artista a : pintura.getArtistas()) {
            if (a.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
}
