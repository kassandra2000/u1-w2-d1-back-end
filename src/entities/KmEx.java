package entities;

import java.util.Scanner;

public class KmEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Inserisci i kilomentri");
            int km = Integer.parseInt(sc.nextLine());
            System.out.println("Inserisci i litri");
            int litri = Integer.parseInt(sc.nextLine());
            double kmLitri = km / litri;
            System.out.println(kmLitri);
        } catch (ArithmeticException a) {
            throw new RuntimeException("non è possibile dividere per 0");

        } catch (Exception e) {
            throw new RuntimeException("qualcosa è andato storto");

        } finally {
            sc.close();
        }
    }
}
