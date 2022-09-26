package Unidad2;

import Unidad2.Metodos.Metodos;
import java.util.Scanner;

public class metodosRecursivos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = -1, pot = 1;
        char op;
        Metodos met = new Metodos();
        do {
            System.out.println(""
                    + "1) Calculo del factorial\n"
                    + "2) Potencia de un numero\n"
                    + "3) Suma de secuencia de 1 a N\n"
                    + "4) Suma Array\n"
                    + "5) Busqueda de dato\n"
                    + "6) Suma Array Par\n"
                    + "7) Fibonacci\n"
                    + "8) Residuo division con suma\n"
                    + "9) Residuo division con multiplicacion\n"
                    + "A) Cantidad numeros pares Array\n"
                    + "s) Salir");
            System.out.print("Ingresa una opcion:\t");
            op = s.nextLine().charAt(0);
            switch (op) {
                case '1':
                    do {
                        System.out.println("Ingresa el numero del factorial:\t");
                        n = s.nextInt();
                        s.nextLine();
                    } while (n < 0);
                    System.out.print(n + "!= ");
                    System.out.println("= " + met.factorial(n));
                    break;
                case '2':
                    do {
                        System.out.print("Ingresa el numero entero:\t");
                        n = s.nextInt();
                        s.nextLine();
                    } while (n < 0);
                    do {
                        System.out.print("Ingresa la potencia positiva:\t");
                        pot = s.nextInt();
                        s.nextLine();
                    } while (pot < 0);
                    System.out.println("El numero " + n + " elevado a la " + pot + " es: " + met.potencia(n, pot));
                    break;
                case '3':
                    do {
                        System.out.print("Ingresa el numero positivo a sumar mayor a cero:\t");
                        n = s.nextInt();
                        s.nextLine();
                    } while (n <= 0);
                    System.out.println("La suma en secuencia de 1 a " + n + " es: " + met.suma(n));
                    break;
                case '4':
                    int a[] = {5, 2, 3, 8, 6};
                    System.out.println("El resultado de la suma es: " + met.sumaArray(a.length - 1, a));
                    break;
                case '5':
                    int b[] = {5, 2, 3, 8, 6};
                    System.out.println("Ingresa el numero a buscar:\t");
                    n = s.nextInt();
                    s.nextLine();
                    System.out.println(Metodos.busqueda(b.length - 1, b, n));
                    break;
                case '6':
                    int c[] = {5, 2, 3, 8, 6};
                    System.out.println("El resultado de la suma de numeros pares es es: " + met.sumaArrayPar(c.length - 1, c));
                    break;
                case '7':
                    int pos = 0;
                    do {
                        System.out.print("Ingresa la posicion a buscar:\t");
                        pos = s.nextInt();
                        s.nextLine();
                    } while (pos <= 0);
                    System.out.println("El numero en la posicion " + pos + " es: " + met.Fibonacci(pos));
                    for (int i = 1; i <= pos; i++) {
                        if (i == 1) {
                            System.out.print(0);
                        } else {
                            System.out.print(" , ");
                            System.out.print(met.Fibonacci(i));
                        }
                    }
                    System.out.println("");
                    break;
                case '8':
                    System.out.println("El cociente de 3/20 = " + Metodos.residuoSuma(20, 3));

                    break;
                case '9':
                    System.out.println("El cociente de 3/20 = " + Metodos.residuoMultiplicacion(20, 3));
                    break;
                case 'A': case'a':
                    int d[] = {2, 4, 6, 5, 7};
                    System.out.println("La cantidad de numeros pares en el arreglo es de: " + met.ConteoArrayPar(d.length - 1, d));
                    break;
                case 's':
                case 'S':
                    System.out.println("Cerrando Programa");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA - VUELVA A INGRESAR");
            }
        } while (!(op == 's' || op == 'S'));
    }
}
