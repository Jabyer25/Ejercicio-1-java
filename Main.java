import java.util.Scanner;
//codigo hecho por Javier Bonilla u.u

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecciona el ejercicio que deseas ejecutar:");
            System.out.println("1. Determinar si eres mayor de edad.");
            System.out.println("2. Determinar el mayor de dos números.");
            System.out.println("3. Determinar si un número es par o impar.");
            System.out.println("4. Calcular el factorial de un número.");
            System.out.println("5. Mostrar números impares usando for.");
            System.out.println("6. Mostrar números impares usando while.");
            System.out.println("7. Mostrar día de la semana.");
            System.out.println("8. Salir.");
            System.out.print("Introduce tu opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste Determinar si eres mayor de edad: \n");
                    ejecutarMayorDeEdad(scanner);
                    break;
                case 2:
                    System.out.println("Seleccionaste Determinar el mayor de dos numeros: \n");
                    ejecutarMayorDeDosNumeros(scanner);
                    break;
                case 3:
                    System.out.println("Seleccionaste Determinar si el numero es par o impar: \n");
                    ejecutarParImpar(scanner);
                    break;
                case 4:
                    System.out.println("Seleccionaste Calcular el factorial de un numero: \n");
                    ejecutarFactorial(scanner);
                    break;
                case 5:
                    System.out.println("Seleccionaste Mostrar numeros impares usando for: \n");
                    ejecutarImparesFor(scanner);
                    break;
                case 6:
                    System.out.println("Seleccionaste Mostrar numeros impares usando while: \n");
                    ejecutarImparesWhile(scanner);
                    break;
                case 7:
                    System.out.println("Seleccionaste Mostrar dia de la semana: \n");
                    ejecutarDiaDeLaSemana(scanner);
                    break;
                case 8:
                    System.out.println("Gracias por usar el programa ᕙ(`▿´)ᕗ");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }

    public static void ejecutarMayorDeEdad(Scanner scanner) {
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        Persona persona = new Persona(edad);
        if (persona.esMayorDeEdad()) {
            System.out.println("Eres mayor de edad.\n");
        } else {
            System.out.println("No eres mayor de edad.\n");
        }
    }

    public static void ejecutarMayorDeDosNumeros(Scanner scanner) {
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();
        ComparadorNumeros comparador = new ComparadorNumeros(numero1, numero2);
        int mayor = comparador.determinarMayor();
        if (mayor != 0) {
            System.out.println("El mayor es: \n" + mayor);
        } else {
            System.out.println("Ambos números son iguales.\n");
        }
    }

    public static void ejecutarParImpar(Scanner scanner) {
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        Numero num = new Numero(numero);
        if (num.esPar()) {
            System.out.println("El número es par.\n");
        } else {
            System.out.println("El número es impar.\n");
        }
    }

    public static void ejecutarFactorial(Scanner scanner) {
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        Factorial factorial = new Factorial(numero);
        int resultado = factorial.calcular();
        System.out.println("El factorial de " + numero + " es " + resultado);
    }

    public static void ejecutarImparesFor(Scanner scanner) {
        System.out.print("Introduce un número mayor a 10 y menor que 30: ");
        int numero = scanner.nextInt();
        if (numero > 10 && numero < 30) {
            NumerosImparesFor impares = new NumerosImparesFor(numero);
            impares.mostrarImpares();
        } else {
            System.out.println("El número no está en el rango especificado.\n");
        }
    }

    public static void ejecutarImparesWhile(Scanner scanner) {
        System.out.print("Introduce un número mayor a 10 y menor que 30: ");
        int numero = scanner.nextInt();
        if (numero > 10 && numero < 30) {
            NumerosImparesWhile impares = new NumerosImparesWhile(numero);
            impares.mostrarImpares();
        } else {
            System.out.println("El número no está en el rango especificado.\n");
        }
    }

    public static void ejecutarDiaDeLaSemana(Scanner scanner) {
        System.out.print("Introduce un número del 1 al 5: ");
        int numero = scanner.nextInt();
        DiaDeLaSemana diaDeLaSemana = new DiaDeLaSemana(numero);
        diaDeLaSemana.mostrarDia();
    }
}
