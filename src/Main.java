import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//Comenzamos por crear los objetos de tipo Artículo.
        Articulo c1 = new Articulo("Manzana","Fruto rojo, amarillo o verde con semillas","$25 k","18/05/2018");
        Articulo c2 = new Articulo("Leche","Bebida pasteurizada que viene de las vacas","$20 el litro","23/05/2018");
        Articulo c3 = new Articulo("Pasta","Especial para hacer Lasagna","$10 el paquete","20/01/2019");
//Asignamos sus respectivas existencias:
        int cManzanas=25;
        int cLeche = 10;
        int cPasta = 0;
//Agregamos los valores de costos.
        int TotMan = 0;
        int TotLec = 0;
        int TotPast= 0;
//Agregamos los valores unitarios.
        int TotUnMan=TotMan/25;
        int TotUnLec=TotLec/20;
        int TotUnPast=TotPast/10;
        //Ahora Adaptamos estos objetos, para ingresarlos dentro de un objeto generico de tipo Elemento<T>
        Elemento<Articulo> primero = new Elemento<>(c1);
        Elemento<Articulo> segundo = new Elemento<>(c2);
        Elemento<Articulo> tercero = new Elemento<>(c3);
        //Una vez que ya están adaptados dentro de sus respectivos objetos, implementamos la lista.
        Lista<Articulo> ListaArticulos = new Lista<>(primero);
        ListaArticulos.insertar(segundo);
        ListaArticulos.insertar(tercero);
        System.out.println(ListaArticulos.nelementos); //Muestra el número de elementos en la lista.
        System.out.println(ListaArticulos.recorrer()); //Muestra los elementos presentes hasta el momento en la lista.
        ListaArticulos.eliminar(); //La función eliminar, elimina el primer elemento de la lista.
        System.out.println(ListaArticulos.nelementos+"\n"+ListaArticulos.recorrer()); //Muestra la lista tras la función eliminar.

        //Implementación de la función buscar.
        System.out.println("Introduzca la clave del producto: ");
        Scanner leeCodigo = new Scanner(System.in);
        String claves= leeCodigo.next();
        ListaArticulos.buscar(claves);
        //Comparación del resultado de la lista con inventario.
        if (claves.equals("Manzana")){//Hacer que me sume lo presente en un solo int.
            TotMan=ListaArticulos.verificaManzanas(cManzanas);
            //System.out.println("Total Manzanas: "+TotMan);
        }
        if (claves.equals("Leche")){
            TotLec=ListaArticulos.verificaLeche(cLeche);
            //System.out.println("Total Leche: "+TotLec);
        }
        if (claves.equals("Pasta")){
            TotPast=ListaArticulos.verificaPasta(cPasta);
            //System.out.println("Total Pasta: "+TotPast);

        }
        System.out.println("¿Desea comprar algo más? Inroducir SI o NO");
        Scanner leeRespuesta = new Scanner(System.in);
        String r1= leeRespuesta.next();
        for ( int j=0;j<5;j++){
        if (r1.equals("SI")) {
            System.out.println("Introduzca la clave del producto: ");
            Scanner lee2 = new Scanner(System.in);
            String leelo = leeCodigo.next();
            ListaArticulos.buscar(leelo);
            if (leelo.equals("Manzana")) {//Hacer que me sume lo presente en un solo int.
                TotMan += ListaArticulos.verificaManzanas(cManzanas);
                //System.out.println("Total Manzanas: "+TotMan);
            }
            if (leelo.equals("Leche")) {
                TotLec += ListaArticulos.verificaLeche(cLeche);
                //System.out.println("Total Leche: "+TotLec);
            }
            if (leelo.equals("Pasta")) {
                TotPast += ListaArticulos.verificaPasta(cPasta);
                //System.out.println("Total Pasta: "+TotPast);

            }
        }
        }
        System.out.println("\n*TICKET DE COMPRA*\n");
        System.out.println("TOTAL PAGADO DE MANZANAS: "+TotMan+"\n");
        System.out.println("TOTAL DE KILOS COMPRADOS:"+(TotMan/25)+"\n" );
        System.out.println("MANZANAS RESTANTES EN INVENTARIO: "+(cManzanas-(TotMan/25)));
        System.out.println("TOTAL PAGADO DE LECHE: "+TotLec+"\n");
        System.out.println("TOTAL DE LITROS COMPRADOS: "+(TotLec/20)+"\n");
        System.out.println("LECHE RESTANTE EN INVENTARIO: "+(cLeche-(TotLec/20)));
        System.out.println("TOTAL PAGADO DE PASTA :"+TotPast+"\n");
        System.out.println("TOTAL DE PAQUETES COMPRADOS: "+(TotPast/10)+"\n");
        System.out.println("TOTAL RESTANTE EN INVENTARIO: "+(cPasta-(TotPast/10)));
        System.out.println("TOTAL DE VENTA: "+(TotMan+TotLec+TotPast));
        System.out.println("*GRACIAS POR SU COMPRA*");

    }
}
