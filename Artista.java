package evf.javadoc.original;

public class Artista {
    //Comentario para el 2.b
    String nombreArtista;

    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
	//Esto es un comentario
    }
}


