
public class Figura {
    private String codigo;
    private double precio;
    private Dimension dimesion;
    private SuperHeroe heroe;

    public Figura(String codigo, double precio, Dimension dimesion, SuperHeroe heroe) {
        this.codigo = codigo;
        this.precio = precio;
        this.dimesion = dimesion;
        this.heroe = heroe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    Dimension getDimesion() {
        return dimesion;
    }

    private void setDimesion(Dimension dimesion) {
        this.dimesion = dimesion;
    }

    public SuperHeroe getHeroe() {
        return heroe;
    }

    public void setHeroe(SuperHeroe heroe) {
        this.heroe = heroe;
    }

    public void figuraInfo(){
        System.out.println("El nombre de la figura es: " + getHeroe().getNombre());
        System.out.println("Descripcion de la figura: " + getHeroe().getDescripcion());
        System.out.println("La figura tiene capa ? " + getHeroe().isCapa());
        System.out.println("El codigo de la figura es: " + getCodigo());
        System.out.println("El precio de la figura es: " + getPrecio());
        System.out.println("La figura mide " + getDimesion().getAlto() + " de alto, " + getDimesion().getAncho() + " de ancho y " + getDimesion().getProfundidad() + " de profundidad");
        System.out.println("La dimension de la figura es: " + getDimesion().getVolumen());
    }

    public void subirPrecio(double cantidad){
        setPrecio(getPrecio() + cantidad);

        System.out.println("El precio nuevo de la figura es: " + getPrecio());
    }



}
