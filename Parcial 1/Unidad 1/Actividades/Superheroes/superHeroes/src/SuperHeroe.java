public class SuperHeroe {

    private String nombre;
    private String descripcion;
    private boolean capa;

    public SuperHeroe(String nombre) {
        this.nombre = nombre;
        this.capa = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    public void superHeroeInfo(){
        System.out.println("El nombre del heroe es: " + getNombre());
        System.out.println("La descripcion del heroe es: " + getDescripcion());
        System.out.println("El heroe tiene capa? " + isCapa());
    }

}
