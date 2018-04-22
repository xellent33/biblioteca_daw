
/**
 * Lista de libro de una biblioteca
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaLibros
{
   
    Libro primero;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros()
    {
       
        primero = null;
    }

   
    // Completar los metodos
    
    // Incluye un nuevo libro en la lista
    public void pon( Libro valor){
       if (estaVacia()) {
           primero = valor;
       } else {
           valor.siguiente = primero;
           primero = valor;
       }
    }
    
    public boolean estaVacia(){
       return ( primero == null );    
        
    }
    
    // Devuelve un libro que es eliminado de la lista o null si no exite
    public Libro quitar ( int id ) {
        Libro aux=primero;
        Libro aux2=primero.siguiente;
        if (estaVacia()) return null;
        if (primero.id==id){
            primero=null;
            return aux;
        }

        while (aux2 != null){
            if (aux2.id == id){
                aux=aux2;
                aux2=null;

            } else {
                aux2 = aux2.siguiente;
            }
        }
        return aux;
    }
   
    // Devuelve el id del libro o -1 si no esta
    public int buscarId ( String titulo ){
        int auxId = -1;
        Libro libroAux = primero;
        if (!estaVacia()){
            while (true){
                if(libroAux == null) break;
                if (libroAux.titulo.equals(titulo)) {
                    return libroAux.id;
                }
                libroAux = libroAux.siguiente;
            }

        }
    return auxId;
   }
    // Muestra los libros almacenados
    public void verCatalogo (){
    Libro libroaux = primero;
    if (!estaVacia()){
        while (libroaux != null){
            System.out.println(libroaux.titulo);
            libroaux = libroaux.siguiente;
        }
    } else {
        System.out.println("Lista vacia");
    }
    }
         
    

}
