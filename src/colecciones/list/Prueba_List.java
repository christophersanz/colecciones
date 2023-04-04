package colecciones.list;

import java.util.*;

public class Prueba_List {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Antonio Banderas", "0001", 200000);
        Cliente cl2 = new Cliente("Rafael Nadal", "0002", 250000);
        Cliente cl5 = new Cliente("Antonio Banderas", "0001", 200000);
        List<Cliente> clientesBanco = new ArrayList<>();
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl5);
        ListIterator<Cliente> it = clientesBanco.listIterator();
        while(it.hasNext()){
            Cliente cli = (Cliente) it.next();
            System.out.println(cli.getNombre() + " " + cli.getNroCuenta() + " " + cli.getSaldo());
        }
    }
}

class Cliente {
    private String nombre;
    private String nroCuenta;
    private double saldo;

    public Cliente(String nombre, String nroCuenta, double saldo) {
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
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

    public String getNombre(){
        return this.nombre;
    }

    public String getNroCuenta(){
        return this.nroCuenta;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
