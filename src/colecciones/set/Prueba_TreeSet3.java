package colecciones.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Prueba_TreeSet3 {

    public static void main(String[] args) {
        TreeSet<String> ordenarPersonas = new TreeSet<>();
        ordenarPersonas.add("Sandra");
        ordenarPersonas.add("Amanda");
        ordenarPersonas.add("Diana");
        for (String s: ordenarPersonas){
            //System.out.println(s);
        }

        TreeSet<Articulo3> ordenarObjPersonas = new TreeSet<>();
        ordenarObjPersonas.add(new Articulo3(3, "Tercer colecciones.set.Articulo"));
        ordenarObjPersonas.add(new Articulo3(1, "Primer colecciones.set.Articulo"));
        ordenarObjPersonas.add(new Articulo3(2, "Segundo colecciones.set.Articulo"));
        for (Articulo3 art: ordenarObjPersonas){
            //System.out.println(art.getDescripcion());
        }

        /*colecciones.set.Articulo3 comparaArticulos = new colecciones.set.Articulo3();
        TreeSet<colecciones.set.Articulo3> ordenarObjComparador = new TreeSet<>(comparaArticulos);
        ordenarObjComparador.add(new colecciones.set.Articulo3(3, "Tercer colecciones.set.Articulo"));
        ordenarObjComparador.add(new colecciones.set.Articulo3(1, "Primer colecciones.set.Articulo"));
        ordenarObjComparador.add(new colecciones.set.Articulo3(2, "Aqui el segundo colecciones.set.Articulo"));
        for (colecciones.set.Articulo3 art: ordenarObjComparador){
            //System.out.println(art.getDescripcion());
        }*/

        ComparadorArticulos compara_art = new ComparadorArticulos();
        TreeSet<Articulo3> ordenaArticulos = new TreeSet<>(compara_art);
        ordenaArticulos.add(new Articulo3(3, "Tercer colecciones.set.Articulo"));
        ordenaArticulos.add(new Articulo3(1, "Primer colecciones.set.Articulo"));
        ordenaArticulos.add(new Articulo3(2, "Aqui el segundo colecciones.set.Articulo"));
        for (Articulo3 art: ordenaArticulos){
            System.out.println(art.getDescripcion());
        }

    }

}

class Articulo3 implements Comparable<Articulo3> {
    private int numero_articulo;
    private String descripcion;

    public Articulo3(int num, String desc){
        this.numero_articulo = num;
        this.descripcion=desc;
    }

    @Override
    public int compareTo(Articulo3 o) {
        return numero_articulo - o.numero_articulo;
    }

    public String getDescripcion(){
        return descripcion;
    }
}

class ComparadorArticulos implements Comparator<Articulo3>{

    @Override
    public int compare(Articulo3 o1, Articulo3 o2) {
        String desc1=o1.getDescripcion();
        String desc2=o2.getDescripcion();
        return desc1.compareTo(desc2);
    }
}
