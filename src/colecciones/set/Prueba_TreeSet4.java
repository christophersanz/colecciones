package colecciones.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Prueba_TreeSet4 {

    public static void main(String[] args) {
        TreeSet<String> ordenarPersonas = new TreeSet<>();
        ordenarPersonas.add("Sandra");
        ordenarPersonas.add("Amanda");
        ordenarPersonas.add("Diana");
        for (String s: ordenarPersonas){
            //System.out.println(s);
        }

        TreeSet<Articulo4> ordenarObjPersonas = new TreeSet<>();
        ordenarObjPersonas.add(new Articulo4(3, "Tercer colecciones.set.Articulo"));
        ordenarObjPersonas.add(new Articulo4(1, "Primer colecciones.set.Articulo"));
        ordenarObjPersonas.add(new Articulo4(2, "Segundo colecciones.set.Articulo"));
        for (Articulo4 art: ordenarObjPersonas){
            //System.out.println(art.getDescripcion());
        }

        TreeSet<Articulo4> ordenaArticulos = new TreeSet<>(new Comparator<Articulo4>() {
            public int compare(Articulo4 o1, Articulo4 o2) {
                String desc1=o1.getDescripcion();
                String desc2=o2.getDescripcion();
                return desc1.compareTo(desc2);
            }
        });
        ordenaArticulos.add(new Articulo4(3, "Tercer colecciones.set.Articulo"));
        ordenaArticulos.add(new Articulo4(1, "Primer colecciones.set.Articulo"));
        ordenaArticulos.add(new Articulo4(2, "Aqui el segundo colecciones.set.Articulo"));
        for (Articulo4 art: ordenaArticulos){
            System.out.println(art.getDescripcion());
        }

    }

}

class Articulo4 implements Comparable<Articulo4> {
    private int numero_articulo;
    private String descripcion;

    public Articulo4(int num, String desc){
        this.numero_articulo = num;
        this.descripcion=desc;
    }

    @Override
    public int compareTo(Articulo4 o) {
        return numero_articulo - o.numero_articulo;
    }

    public String getDescripcion(){
        return descripcion;
    }
}