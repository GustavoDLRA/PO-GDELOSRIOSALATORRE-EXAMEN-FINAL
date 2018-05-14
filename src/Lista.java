import java.util.Scanner;

public class Lista<T> {
    Elemento<T> inicio, pivote;
    int nelementos; //Número de elementos en la lista.
    int cantLeche;
    int cantManzanas;
    int cantPasta;

    //Constructor por Default
    public Lista(){
        inicio = pivote = null;
        nelementos = 0;
    }
    //Constructor de Lista considerando el primer objeto como existente.
    public Lista(Elemento<T> objeto){
        inicio = pivote = objeto;
        nelementos=1;
    }
    public void insertar(Elemento<T> objeto){
        if (nelementos == 0){
            inicio=pivote=objeto;
        }else{
            objeto.siguiente = inicio;
            inicio = pivote = objeto;
        }
        nelementos++;
        //Si en un if, encontramos las mismas las mismas líneas de código,
        //estas se tienen que poner afuera.
    }
    //Función para recorrer la lista.
    //Desplaza el pivote y guarda en un String la información de
    //Cada uno de los objetos que recorre.
    public String recorrer(){
        String datos = "";
        pivote = inicio;
        for (int i = 0;i<nelementos;i++){
            datos += pivote.attrG.toString();
            pivote = pivote.siguiente;
        }
        return datos;
    }
    //Función para eliminar el primer elemento de la lista.
    //Recordar que estos se marcan por el orden en el que fueron
    //Ingresados a la misma.
    public void eliminar(){
        inicio = inicio.siguiente;
        nelementos--;
        if (nelementos == 0){
            inicio=pivote=null;
        }
    }
    public void buscar(String claves){
        //El usuario únicamente puede ingresar un codigo para buscar
        //productos existentes en un catálogo, que se le mostrará en la consola.
        //Por lo tanto, la función buscar, únicamente comparará el input
        //del usuario con las claves de producto registradas en el catalogo.
        if (claves.equals("Manzana")||claves.equals("manzana")){
            Articulo c1 = new Articulo("Manzana","Fruto rojo, amarillo o verde con semillas","$25 k","18/05/2018");
            System.out.println(c1.toString()+"\n");
        }
        else if (claves.equals("Leche")){
            Articulo c1 = new Articulo("Leche","Bebida pasteurizada que viene de las vacas","$20 el litro","23/05/2018");
            System.out.println(c1.toString()+"\n");
        }
        else if (claves.equals("Pasta")){
            Articulo c1 = new Articulo("Pasta","Especial para hacer Lasagna","$10 el paquete","20/01/2019");
            System.out.println(c1.toString()+"\n");
        }else{
            System.out.println("El código no coincide con ningún artículo, verifique de nuevo el catalogo");
        }
    }
    public int verificaManzanas(int cantManz){
        int totalManzanas;
        if (cantManz>0){
            System.out.println("El producto sí se encuentra en existencia.\n");
            System.out.println("Ingrese la cantidad de kilos que le gustaría llevar.");
            Scanner cantidadArt = new Scanner(System.in);
            int cantArtic  = cantidadArt.nextInt();
            totalManzanas=cantArtic*25;
        }else{
            System.out.println("Este producto no se encuentra en existencia");
            totalManzanas=0;
        }
        return totalManzanas;
    }
    public int verificaLeche(int cantLeche){
        int totalLeche;
        int totalManzanas;
        int totalPasta;
        if (cantLeche>0){
            System.out.println("El producto sí se encuentra en existencia.\n");
            System.out.println("Ingrese la cantidad de unidades que le gustaría llevar.");
            Scanner cantidadArt = new Scanner(System.in);
            int cantArtic  = cantidadArt.nextInt();
            totalLeche=cantArtic*20;
        }else{
            System.out.println("Este producto no se encuentra en existencia.");
            totalLeche=0;
        }
        return totalLeche;
    }
    public int verificaPasta(int cantPasta){
        int totalPasta;
        //Agregar el nombre del artículo por cada funcion verificar existencia
        if (cantPasta>0){
            System.out.println("El producto sí se encuentra en existencia.\n");
            System.out.println("Ingrese la cantidad de paquetes que le gustaría llevar.");
            Scanner cantidadArt = new Scanner(System.in);
            int cantArtic = cantidadArt.nextInt();
            totalPasta=cantArtic*10;
        }else{
            System.out.println("Este producto no se encuentra en existencia.");
            totalPasta=0;
        }
        return totalPasta;
    }
    public void algoMas(String clave2){
        if (clave2.equals("SI")){

        }

    }

}
