import java.util.Scanner;

public class sumarestaproductomedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, d;

            System.out.println("Voy a darte la suma, resta, producto y media de los cuatro números que tú elijas.");
            System.out.print("Dime un número: ");
            a = scanner.nextInt();

            System.out.print("Dime otro número: ");
            b = scanner.nextInt();
            
            System.out.print("Dime otro número: ");
            c = scanner.nextInt();
            
            System.out.print("Dime otro número: ");
            d = scanner.nextInt();
            
            int suma = a + b + c + d;
            System.out.println("El resultado de la suma es " + suma);

            int resta = a - b - c - d;
            System.out.println("El resultado de la resta es " + resta);

            int producto = a * b * c * d;
            System.out.println("El resultado del producto es " + producto);

            int media = (suma)/4;
            System.out.println("El resultado de la media es " + media);

        scanner.close();
    
}
}