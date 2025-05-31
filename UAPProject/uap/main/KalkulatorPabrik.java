package uap.main;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP : Muhammad Haidar Ramzy Akbar");
        System.out.println("NIM : 245150707111069");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double radiusBesar = input.nextDouble(); 
        System.out.print("Isikan radius   : ");
        double radiusKecil = input.nextDouble();

        Torus torus = new Torus(radiusBesar, radiusKecil);
        System.out.println("=============================================");
        torus.printInfo();
        System.out.println("=============================================");

        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = input.nextDouble(); 

        Sphere sphere = new Sphere(radius);
        System.out.println("=============================================");
        sphere.printInfo();
        System.out.println("=============================================");

        input.close();
    }
}
