package principal;

import com.prog03.figuras.Rectangulo;

public class Main {
    public static void main (String[] args) {
        Rectangulo primero = new Rectangulo(7,5);
        Rectangulo segundo = new Rectangulo(100,155);
        Rectangulo tercero = new Rectangulo(10,10);

        System.out.println("Rectangulo 1");
        System.out.println(primero);
        System.out.println("Es el recangulo cuadrado? " + primero.isCuadrado());

        System.out.println("\nRectangulo 2");
        System.out.println(segundo);
        System.out.println("Es el recangulo cuadrado? " + segundo.isCuadrado());

        System.out.println("\nRectangulo 3");
        System.out.println(tercero);
        System.out.println("Es el recangulo cuadrado? " + tercero.isCuadrado());
    }

}
