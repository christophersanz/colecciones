package colecciones.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Prueba_TreeSet2 {

    public static void main(String[] args) {
        TreeSet<String> ordenarPersonas = new TreeSet<>();
        ordenarPersonas.add("Sandra");
        ordenarPersonas.add("Amanda");
        ordenarPersonas.add("Diana");
        for (String s: ordenarPersonas){
            //System.out.println(s);
        }

        TreeSet<Articulo2> ordenarObjPersonas = new TreeSet<>();
        ordenarObjPersonas.add(new Articulo2(3, "Tercer colecciones.set.Articulo"));
        ordenarObjPersonas.add(new Articulo2(1, "Primer colecciones.set.Articulo"));
        ordenarObjPersonas.add(new Articulo2(2, "Segundo colecciones.set.Articulo"));
        for (Articulo2 art: ordenarObjPersonas){
            //System.out.println(art.getDescripcion());
        }

        Articulo2 comparaArticulos = new Articulo2();
        TreeSet<Articulo2> ordenarObjComparador = new TreeSet<>(comparaArticulos);
        ordenarObjComparador.add(new Articulo2(3, "Tercer colecciones.set.Articulo"));
        ordenarObjComparador.add(new Articulo2(1, "Primer colecciones.set.Articulo"));
        ordenarObjComparador.add(new Articulo2(2, "Aqui el segundo colecciones.set.Articulo"));
        for (Articulo2 art: ordenarObjComparador){
            System.out.println(art.getDescripcion());
        }
    }

}

class Articulo2 implements Comparable<Articulo2>, Comparator<Articulo2> {
    private int numero_articulo;
    private String descripcion;

    public Articulo2(){}

    public Articulo2(int num, String desc){
        this.numero_articulo = num;
        this.descripcion=desc;
    }

    @Override
    public int compareTo(Articulo2 o) {
        return numero_articulo - o.numero_articulo;
    }

    @Override
    public int compare(Articulo2 o1, Articulo2 o2) {
        String descripcionA=o1.getDescripcion();
        String descripcionB=o2.getDescripcion();
        return descripcionA.compareTo(descripcionB);
    }

    public String getDescripcion(){
        return descripcion;
    }
}
