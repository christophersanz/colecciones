package colecciones.set;

import java.util.*;

public class Prueba_TreeSet {

    public static void main(String[] args) {
        TreeSet<String> ordenarPersonas = new TreeSet<>();
        ordenarPersonas.add("Sandra");
        ordenarPersonas.add("Amanda");
        ordenarPersonas.add("Diana");
        for (String s: ordenarPersonas){
            System.out.println(s);
        }

        TreeSet<Articulo> ordenarObjPersonas = new TreeSet<>();
        ordenarObjPersonas.add(new Articulo(3, "Tercer colecciones.set.Articulo"));
        ordenarObjPersonas.add(new Articulo(1, "Primer colecciones.set.Articulo"));
        ordenarObjPersonas.add(new Articulo(2, "Segundo colecciones.set.Articulo"));
        for (Articulo art: ordenarObjPersonas){
            System.out.println(art.getDescripcion());
        }
    }

}

class Articulo implements Comparable<Articulo> {
    private int numero_articulo;
    private String descripcion;

    public Articulo(int num, String desc){
        this.numero_articulo = num;
        this.descripcion=desc;
    }

    @Override
    public int compareTo(Articulo o) {
        return numero_articulo - o.numero_articulo;
    }

    public String getDescripcion(){
        return descripcion;
    }
}
