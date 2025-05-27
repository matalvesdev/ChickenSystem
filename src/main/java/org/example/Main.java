package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Galinheiro GaloDeOuro = new Galinheiro("Galo de Ouro", 32, 7);
        Galinheiro GalinhaFeliz = new Galinheiro("Galinha Feliz", 25, 5);
        Galinheiro GalinhaDourada = new Galinheiro("Galinha Dourada", 20, 6);
        Galinheiro GalinhaPreta = new Galinheiro("Galinha Preta", 15, 4);

        GaloDeOuro.mostrarInfo();
        GalinhaFeliz.mostrarInfo();
        GalinhaDourada.mostrarInfo();
        GalinhaPreta.mostrarInfo();
    }
}