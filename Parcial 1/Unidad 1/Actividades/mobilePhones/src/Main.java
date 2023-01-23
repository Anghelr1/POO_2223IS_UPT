import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> coloresBasicos = new ArrayList<>();
        coloresBasicos.add("Rojo");
        coloresBasicos.add("Azul");
        coloresBasicos.add("Verde");
        coloresBasicos.add("Morado");
        ArrayList<String> coloresLlamativos = new ArrayList<>();
        coloresLlamativos.add("Rojo");
        coloresLlamativos.add("Azul");
        coloresLlamativos.add("Verde");
        coloresLlamativos.add("Morado");
        ArrayList<String> coloresPasteles = new ArrayList<>();
        coloresPasteles.add("Rojo");
        coloresPasteles.add("Azul");
        coloresPasteles.add("Verde");
        coloresPasteles.add("Morado");
        ArrayList<String> coloresTornasol = new ArrayList<>();
        coloresTornasol.add("Rojo");
        coloresTornasol.add("Azul");
        coloresTornasol.add("Verde");
        coloresTornasol.add("Morado");
        ArrayList<String> coloresMetalico = new ArrayList<>();
        coloresMetalico.add("Rojo");
        coloresMetalico.add("Azul");
        coloresMetalico.add("Verde");
        coloresMetalico.add("Morado");
        ArrayList<String> Accesorios = new ArrayList<>();
        for (int i = 0; i < (int)(Math.random()*15+1); i++) {
            Accesorios.add(String.valueOf((int)(Math.random()*10000000+1)));
        }
        ArrayList<String> Funciones = new ArrayList<>();
        for (int i = 0; i < (int)(Math.random()*15+1); i++) {
            Funciones.add(String.valueOf((int)(Math.random()*10000000+1)));
        }

        telefono tel1 = new telefono("Apple","Manzana","Mexico","13","2022","1322134126","normal","IOS",Accesorios,Funciones,false,"lightning","Apple store","512",true,4,54,4500,coloresBasicos,coloresLlamativos,coloresPasteles,coloresTornasol,coloresMetalico,true,nRandom(),"Gama Alta");

        telefono tel2 = new telefono("Samsung","Samsung","Mexico","A12","2022","1322134126","normal","Android",Accesorios,Funciones,true,"c","PlayStore","128",true,6,64,5500,coloresBasicos,coloresLlamativos,coloresPasteles,coloresTornasol,coloresMetalico,true,nRandom(),"Gama media");






        tel1.infoTotal();
        tel2.infoTotal();

    }
    public static int nRandom(){
        return (int)(Math.random()*1000000000+1);
    }
}
