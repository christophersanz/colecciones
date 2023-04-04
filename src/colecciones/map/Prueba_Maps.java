package colecciones.map;

import java.util.*;

public class Prueba_Maps {
    public static void main(String[] args) {
        HashMap<String, Empleado> personal = new HashMap<>();
        personal.put("145", new Empleado("Juan"));
        personal.put("146", new Empleado("Ana"));
        personal.put("147", new Empleado("Antonio"));
        personal.put("148", new Empleado("Sandra"));
        System.out.println(personal);
        personal.remove("147");
        System.out.println(personal);
        personal.put("148", new Empleado("Natalia"));
        System.out.println(personal);

        for (Map.Entry<String, Empleado> entrada: personal.entrySet()){
            String clave = entrada.getKey();
            Empleado valor = entrada.getValue();
            System.out.println("Clave="+clave+", Valor=" + valor);
        }
    }
}


class Empleado {

    private String nombre;
    private double sueldo;

    public Empleado (String nombre){
        this.nombre = nombre;
        this.sueldo = 2000;
    }

    @Override
    public String toString() {
        return "colecciones.map.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}