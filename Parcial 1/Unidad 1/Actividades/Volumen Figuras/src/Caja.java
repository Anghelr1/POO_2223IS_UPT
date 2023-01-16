public class Caja {
    private float base;
    private float altura;
    private float profundidad;

    //Constructor
    public Caja() {
    }

    public Caja(float base, float altura, float profundidad) {
        this.base = base;
        this.altura = altura;
        this.profundidad = profundidad;
    }

    //Getter  y setters

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(float profundidad) {
        this.profundidad = profundidad;
    }


    //Metodos

    public void volumen(){
        float resultado = base * altura * profundidad;
        System.out.println("El volumen de tu caja con datos: \nAltura: " + altura + "\nBase: " + base + "\nProfundidad: " + profundidad + "\nVolumen es: " + resultado);
    }
}
