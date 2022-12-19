
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, String numeroDeReferencia)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas= numeroDePaginas;
        numeroReferencia= numeroDeReferencia;
    }

    public String getAutor(){
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void imprimirTitulo(){
        System.out.println("##################");
        System.out.println("Titulo: " + titulo);
        System.out.println("##################");
    }

    public void imprimirAutor(){
        System.out.println("##################");
        System.out.println("Autor: " + autor);
        System.out.println("##################");
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void imprimirDetalles(){
        if (numeroReferencia == ""){
            System.out.println("--");
        }
        else {
            System.out.println("Titulo: "+titulo+" Autor: "+autor+" Paginas: "+numeroPaginas +" Numero de referencia: "+numeroReferencia);        
        }
    }

    public String getDetalles(){
        String numeroRef = numeroReferencia;
        if (numeroRef == ""){
            numeroRef= ("--");
        }
        else {
            numeroRef = ("Titulo: "+titulo+" Autor: "+autor+" Paginas: "+numeroPaginas +" Numero de referencia: "+numeroReferencia);      
        }
        return numeroRef;
    }

    public String getReferencia(){
        if (numeroReferencia.length()>=3) {
            System.out.println("ERROR numero de referencia inválido");
        }
        return numeroReferencia;
    }

    public void setNumeroReferencia(String numeroDeReferencia){
        numeroReferencia = numeroDeReferencia;
    }
}

