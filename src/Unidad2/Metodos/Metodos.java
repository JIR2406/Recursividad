package Unidad2.Metodos;

public class Metodos {

    public static int factorial(int n) {
        if (n != 1) {
            System.out.print(n + "*");
        }
        if (n == 1) {//
            System.out.print(n);
            return n;
        } else if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int potencia(int a, int b) {
        if (b == 1) {
            return a;
        } else if (b == 0) {
            return 1;
        }
        return a * potencia(a, b - 1);
    }

    public static int suma(int n) {
        if (n == 0) {
            return n;
        }
        return n + suma(n - 1);
    }

    public static int sumaArray(int i, int a[]) {
        if (i == 0) {
            return a[i];
        } else {
            return sumaArray(i - 1, a) + a[i];
        }
    }

    public static int sumaArrayPar(int i, int a[]) {
        if (i == 0 && a[i] % 2 == 0) {
            return a[i];
        } else if (a[i] % 2 == 0) {
            return sumaArrayPar(i - 1, a) + a[i];
        } else if (i == 0 && a[i] % 2 != 0) {
            return 0;
        }
        return sumaArrayPar(i - 1, a);
    }

    public static String busqueda(int i, int a[], int dato) {
        if (a[i] == dato) {
            return "El dato " + dato + " esta en el arreglo en la posicion:\t" + i;
        } else if (i == 0 && a[i] != dato) {
            return "El dato " + dato + " no esta en el arreglo";
        }
        return busqueda(i - 1, a, dato);
    }

    public static int Fibonacci(int pos) {
        if (pos == 1) {
            return 0;
        } else if (pos == 2) {
            return 1;
        }
        return Fibonacci(pos - 1) + Fibonacci(pos - 2);
    }

    public static int residuoSuma(int a, int b) {
        if (a >= b) {
            return residuoSuma(a - b, b) + 1;
        } else {
            return 0;
        }
    }

    public static int residuoMultiplicacion(int a, int b) { 
        if (a >= b) {
            return residuoMultiplicacion(a - b, b) + 1;
        } else {
            return 0;
        }
    }

    public static int ConteoArrayPar(int i, int a[]) {
        if (i == 0 && a[i] % 2 == 0) {
            return 1;
        } else if (a[i] % 2 == 0) {
            return ConteoArrayPar(i - 1, a)+1;
        } else if (i == 0 && a[i] % 2 != 0) {
            return 0;
        }else{
        return ConteoArrayPar(i - 1, a);
    }
    }
}
