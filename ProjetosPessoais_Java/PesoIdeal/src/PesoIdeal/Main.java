package PesoIdeal;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Cálculo para seu peso ideal!!!");
        System.out.println("Sua Altura: ");
        float h = scan.nextFloat();

        double pesoIdeal = (72.7 * h) - 58;

        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}
