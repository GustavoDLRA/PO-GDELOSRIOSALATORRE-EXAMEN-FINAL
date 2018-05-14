public class Articulo {
    //Atributos
    public String claveP;
    private String descripcion;
    private String precio;
    private String caducidad;
    //Metodos de la clase Artículo

    //Constructor Por Default
    public Articulo(){
        this.claveP="";
        this.descripcion="";
        this.precio="";
        this.caducidad="";
    }
    //Constructor con todos los parametros
    public Articulo(String cl, String de, String pr, String ca){
        this.claveP=cl;
        this.descripcion=de;
        this.precio=pr;
        this.caducidad=ca;
    }
    //Getters & Setters
    public String getClaveP(){
        return claveP;
    }
    public void setClaveP(String claveP){
        this.claveP=claveP;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public String getPrecio(){
        return precio;
    }
    public void setPrecio(String precio){
        this.precio=precio;
    }
    public String getCaducidad(){
        return caducidad;
    }
    public void setCaducidad(String caducidad){
        this.caducidad=caducidad;
    }
    //Metodo toString()
    @Override
    public String toString(){
        return "\nProducto:"+
                "\n*ClaveProducto: "+ getClaveP()+
                "\n*Descripcion: "+getDescripcion()+
                "\n*Precio: "+getPrecio()+
                "\n*Fecha de Caducidad: "+getCaducidad()+"\n";
    }
}
