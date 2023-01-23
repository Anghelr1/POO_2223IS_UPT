import java.util.ArrayList;
import java.util.Iterator;

public class telefono {

    private String marca;
    private String logo;
    private String pais;
    private String modelo;
    private String año;
    private String id;
    private String diseño;
    private String so;
    private ArrayList<String> accesorios = new ArrayList<>();
    private ArrayList<String> funciones = new ArrayList<>();
    private boolean garantia;
    private String entradaCargador;
    private String software;
    private String memoria;
    private boolean liberado;
    private int ram;
    private int camara;
    private int bateria;
    private ArrayList<String> coloresBasicos = new ArrayList<>();
    private ArrayList<String> coloresLlamativos = new ArrayList<>();
    private ArrayList<String> coloresPastel = new ArrayList<>();
    private ArrayList<String> coloresTornasol = new ArrayList<>();
    private ArrayList<String> coloresMetalico = new ArrayList<>();
    private boolean stock;
    private int vendidos;
    private String tipoCelular;

    //Constructores
    public telefono() {
    }

    public telefono(String marca, String logo, String pais, String modelo, String año, String id, String diseño, String so, ArrayList<String> accesorios, ArrayList<String> funciones, boolean garantia, String entradaCargador, String software, String memoria, boolean liberado, int ram, int camara, int bateria, ArrayList<String> coloresBasicos, ArrayList<String> coloresLlamativos, ArrayList<String> coloresPastel, ArrayList<String> coloresTornasol, ArrayList<String> coloresMetalico, boolean stock, int vendidos, String tipoCelular) {
        this.marca = marca;
        this.logo = logo;
        this.pais = pais;
        this.modelo = modelo;
        this.año = año;
        this.id = id;
        this.diseño = diseño;
        this.so = so;
        this.accesorios = accesorios;
        this.funciones = funciones;
        this.garantia = garantia;
        this.entradaCargador = entradaCargador;
        this.software = software;
        this.memoria = memoria;
        this.liberado = liberado;
        this.ram = ram;
        this.camara = camara;
        this.bateria = bateria;
        this.coloresBasicos = coloresBasicos;
        this.coloresLlamativos = coloresLlamativos;
        this.coloresPastel = coloresPastel;
        this.coloresTornasol = coloresTornasol;
        this.coloresMetalico = coloresMetalico;
        this.stock = stock;
        this.vendidos = vendidos;
        this.tipoCelular = tipoCelular;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public ArrayList<String> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(ArrayList<String> accesorios) {
        this.accesorios = accesorios;
    }

    public ArrayList<String> getFunciones() {
        return funciones;
    }

    public void setFunciones(ArrayList<String> funciones) {
        this.funciones = funciones;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    public String getEntradaCargador() {
        return entradaCargador;
    }

    public void setEntradaCargador(String entradaCargador) {
        this.entradaCargador = entradaCargador;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public boolean isLiberado() {
        return liberado;
    }

    public void setLiberado(boolean liberado) {
        this.liberado = liberado;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCamara() {
        return camara;
    }

    public void setCamara(int camara) {
        this.camara = camara;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public ArrayList<String> getColoresBasicos() {
        return coloresBasicos;
    }

    public void setColoresBasicos(ArrayList<String> coloresBasicos) {
        this.coloresBasicos = coloresBasicos;
    }

    public ArrayList<String> getColoresLlamativos() {
        return coloresLlamativos;
    }

    public void setColoresLlamativos(ArrayList<String> coloresLlamativos) {
        this.coloresLlamativos = coloresLlamativos;
    }

    public ArrayList<String> getColoresPastel() {
        return coloresPastel;
    }

    public void setColoresPastel(ArrayList<String> coloresPastel) {
        this.coloresPastel = coloresPastel;
    }

    public ArrayList<String> getColoresTornasol() {
        return coloresTornasol;
    }

    public void setColoresTornasol(ArrayList<String> coloresTornasol) {
        this.coloresTornasol = coloresTornasol;
    }

    public ArrayList<String> getColoresMetalico() {
        return coloresMetalico;
    }

    public void setColoresMetalico(ArrayList<String> coloresMetalico) {
        this.coloresMetalico = coloresMetalico;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public int getVendidos() {
        return vendidos;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }

    public String getTipoCelular() {
        return tipoCelular;
    }

    public void setTipoCelular(String tipoCelular) {
        this.tipoCelular = tipoCelular;
    }

    //Métodos

    public void marca() {
        System.out.println("La marca es: " + marca);
        System.out.println("Su logo es: " + logo);
        System.out.println("Su pais de origen es: " + pais);
    }

    public void modelo() {
        System.out.println("Su modelo es: " + modelo);
        System.out.println("El año de emisión es: " + año);
        System.out.println("Su id es: " + id);
        System.out.println("Su diseño es: " + diseño);
    }

    public void caracteristicasModelo() {
        System.out.println("El SO es: " + so);
        System.out.println("Sus accesorios son: ");
        Iterator<String> iAccesorios = accesorios.iterator();
        while (iAccesorios.hasNext()) {
            System.out.println(iAccesorios.next());
        }
        System.out.println("Sus funciones son: ");
        Iterator<String> iFunciones = funciones.iterator();
        while (iFunciones.hasNext()) {
            System.out.println(iFunciones.next());
        }
        System.out.println("Estado de garantia: " + garantia);
    }

    public void caracteristicasCelular() {
        System.out.println("El tipo es: " + entradaCargador);
        System.out.println("Su software es: " + software);
        System.out.println("Su memoria es de: " + memoria + " GB");
        System.out.println("Estado de la liberación: " + liberado);
        System.out.println("Su ram de: " + ram);
        System.out.println("Tiene " + camara + " mpx de resolución");
        System.out.println("Su bateria es de: " + bateria + " mAh");

    }

    public void colores() {
        System.out.println("Sus colores basicos son: ");
        Iterator<String> iCBasicos = coloresBasicos.iterator();
        while (iCBasicos.hasNext()) {
            System.out.println(iCBasicos.next());
        }
        System.out.println("Sus colores Llamativos son: ");
        Iterator<String> iCLlamativos = coloresLlamativos.iterator();
        while (iCLlamativos.hasNext()) {
            System.out.println(iCLlamativos.next());
        }
        System.out.println("Sus colores Pastel son: ");
        Iterator<String> iCPastel = coloresPastel.iterator();
        while (iCPastel.hasNext()) {
            System.out.println(iCPastel.next());
        }
        System.out.println("Sus colores Tornasol son: ");
        Iterator<String> iCTornasol = coloresTornasol.iterator();
        while (iCTornasol.hasNext()) {
            System.out.println(iCTornasol.next());
        }
        System.out.println("Sus colores Metalico son: ");
        Iterator<String> iCMetalico = coloresMetalico.iterator();
        while (iCMetalico.hasNext()) {
            System.out.println(iCMetalico.next());
        }
    }

    public void inventario() {
        System.out.println("Estado de stock: " + stock);
        System.out.println("Unidades vendidas: " + vendidos);
        System.out.println("El tipo es: " + tipoCelular);
    }

    public void precio() {
        int modelo = (int) (Math.random() * 30000 + 1);
        System.out.println("Su valor por modelo es: " + modelo);
        int almacenamiento = (int) (Math.random() * 30000 + 1);
        System.out.println("Su valor por almacenamiento es: " + almacenamiento);
        int color = (int) (Math.random() * 30000 + 1);
        System.out.println("Su valor por color es: " + color);
        int programa = (int) (Math.random() * 30000 + 1);
        System.out.println("Su valor por programa es: " + programa);
        int total = modelo + almacenamiento + color + programa;
        System.out.println("Su total es de: $" + total);
    }

    public void entrega() {
        int dia = (int) (Math.random() * 30 + 1);
        int mes = (int) (Math.random() * 12 + 1);
        int año = 2023;
        System.out.println("Los metodos de entrega son: \nDomicilio\nTienda\nSu fecha de entrega es en: " + dia + "/" + mes + "/" + año);
    }

    public void infoTotal() {
//        System.out.println("cls");
        marca();
        modelo();
        caracteristicasModelo();
        caracteristicasCelular();
        colores();
        inventario();
        precio();
        entrega();
    }

}
