
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

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
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
}
