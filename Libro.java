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
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, int numeroDeVecesPrestado, boolean texto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = numeroDeVecesPrestado;
        esLibroDeTexto = texto;
    }

    public String getAutor (){
        return autor;
    }

    public String getTitulo (){
        return titulo;
    }

    public int getNumeroPaginas (){
        return numeroPaginas;
    }

    public String getnumeroReferencia (){
        return numeroReferencia;
    }

    public int getvecesPrestado (){
        return vecesPrestado;
    }

    public boolean getEsLibroDeTexto (){
        return esLibroDeTexto;
    }

    public void prestar (){
        vecesPrestado = vecesPrestado + 1;
    }

    public void setnumeroReferencia (String numeroDeReferencia){
        if (numeroDeReferencia.length()>=3){
            numeroReferencia = numeroDeReferencia;
        }
        else {
            System.out.println("Numeor de refenrencia demasiado corto");
        }
    }

    public void imprimeAutor () {
        System.out.println ("##################");
        System.out.println ("Autor: " + autor);
        System.out.println ("##################");
    }

    public void imprimeTitulo () {
        System.out.println ("##################");
        System.out.println ("Titulo: " + titulo);
        System.out.println ("##################");
    }

    public void imprimirDetalles () {
        String numeroRef = "--";
        if (numeroReferencia == ""){
            numeroReferencia = numeroRef;
        }
        else {
            numeroRef = numeroReferencia;
        }

        String libroDeTexto;
        if (esLibroDeTexto){
            libroDeTexto = "correcto";
        }
        else {
            libroDeTexto = "falso";
        }

        System.out.println ("Título: "+titulo+", Autor: "+autor+", Páginas: " +numeroPaginas+", Numero de referencia: " +numeroReferencia+", numero de veces que se a prestado: "+ vecesPrestado+", ¿Es un libro de texto? " +libroDeTexto);
    }

    public String getDetalles (){
        String devolver = "";

        String numeroRef = "--";
        if (numeroReferencia == ""){
            numeroReferencia = numeroRef;
        }
        else {
            numeroRef = numeroReferencia;
        }

        String libroDeTexto;
        if (esLibroDeTexto == true){
            libroDeTexto = "correcto";
        }
        else {
            libroDeTexto = "falso";
        }

        return  ("Título: "+titulo+", Autor: "+autor+", Páginas: " +numeroPaginas+", Numero de referencia: " +numeroRef+", numero de veces que se a prestado: "+ vecesPrestado+", ¿Es un libro de texto? " +libroDeTexto);
        
    }
}