public class Elemento<T> {
    //Se comienza por hacer a Elemento, una clase generica.
    //Atributos
    public T attrG;
    public Elemento siguiente;
    //Hacemos un constructor de Elemento
    public Elemento(T objeto){
        this.attrG = objeto;
        this.siguiente = null;
    }
            }
