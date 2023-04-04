package colecciones.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Prueba_HashSet {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Antonio Banderas", "0001", 200000);
        Cliente cl2 = new Cliente("Rafael Nadal", "0002", 250000);
        Cliente cl3 = new Cliente("Penelope Cruz", "0003", 300000);
        Cliente cl4 = new Cliente("Julio Iglesias", "0004", 500000);
        Cliente cl5 = new Cliente("Antonio Banderas", "0001", 200000);
        Set<Cliente> clientesBanco = new HashSet<>();
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);
        for (Cliente cli: clientesBanco){
            System.out.println(cli.getNombre() + " " + cli.getNroCuenta() + " " + cli.getSaldo());
        }
    }
}

class Cliente {
    private String nombre;
    private String nroCuenta;
    private double saldo;

    public Cliente(String nombre, String nCuenta, double saldo){
        this.nombre = nombre;
        this.nroCuenta = nCuenta;
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nroCuenta, cliente.nroCuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nroCuenta);
    }

    public String getNombre() {
        return nombre;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

}
