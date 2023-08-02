package fila;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adicionar("e");
        fila.adicionar("a");
        fila.adicionar("b");
        fila.adicionar("h");
        fila.adicionar("g");


        System.out.println("Primeiro da fila: " + fila.get());
        fila.remover();
        System.out.println("Proximo primeiro da fila: " + fila.get());
        fila.remover();
        System.out.println("Proximo primeiro da fila: " + fila.get());
    }
}
