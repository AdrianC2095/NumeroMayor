import java.util.Scanner;
public class ejercicionumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2, num3;
        System.out.print("Ingrese el primer número: ");
        num1 = teclado.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = teclado.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        num3 = teclado.nextDouble();        
        if (num1 > num2 && num1 > num3)
                System.out.println("El número mayor es: " + num1);
                else if (num2 > num1 && num2 > num3)
                    System.out.println("El número mayor es: " + num2);
                    else System.out.println("El número mayor es: " +  num3);
    }
    
}
