package colecciones.set;

public class Prueba_HasSet2 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("P en Java", "Juan",25);
        Libro libro2 = new Libro("P en Java", "Juan",25);
        if (libro1.equals(libro2)){
            System.out.println("Es el mismo libro");
        }else{
            System.out.println("No es el mismo libro");
        }
    }
}

class Libro {
    private String titulo;
    private String autor;
    private int ISBN;

    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public boolean equals(Object obj){
        if(obj instanceof Libro){
            Libro otro = (Libro)obj;
            if(this.ISBN==otro.ISBN){
                return true;
            }
            return false;
        }
        return false;
    }

    public String getDatos(){
        return "El titulo es: " +  titulo + " El autor es: " + autor + " Y el ISBN es: " + ISBN;
    }
}
