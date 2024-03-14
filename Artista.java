package evf.javadoc.original;

public class Artista {
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

    public boolean nombreMayor(int len){
	//Victor Manuel Solsona Fuentes

	boolean esMayor = false;

	if(nombreArtisa.length() > len){
		esMayor = true;	
	}

	return esMayor;
    }
}


