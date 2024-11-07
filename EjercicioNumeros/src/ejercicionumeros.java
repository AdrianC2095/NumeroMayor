import java.util.Scanner;
public class ejercicionumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2, num3, mayor;
        System.out.print("Ingrese el primer número: ");
        num1 = teclado.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = teclado.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        num3 = teclado.nextDouble();        
        if (num1 > num2 && num1 > num3)
                {
                    mayor = num1;
                    System.out.println("El número mayor es: " + mayor);
                }
                else if (num2 > num1 && num2 > num3)
                        {
                            mayor = num2;
                            System.out.println("El número mayor es: " + mayor);
                        }
                        else System.out.println("El número mayor es: " +  num3);
    }
    
}
