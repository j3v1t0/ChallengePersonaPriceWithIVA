import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static double iva = 0.0;

    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);

        do {
            Menu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    calcularPrecioConIva();
                    break;
                case 2:
                    setIva();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Elige una opcion correcta.");
            }
        } while (option != 3);
    }

    static void Menu() {

        System.out.println("--------Precios con IVA----------");
        System.out.println("---------------------------------");
        System.out.println("1 - Precio");
        System.out.println("2 - Configurar % del IVA");
        System.out.println("3 - Salir");
    }

    static void setIva() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nuevo valor del IVA (%): ");
        double nuevoIva = scanner.nextDouble();
        iva = nuevoIva;
        System.out.println("IVA configurado correctamente.");
    }

    static double calcularPrecioConIva() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        double porcientoIva = iva / 100;
        double montoIva = precio * porcientoIva;
        double montoTotal = precio + montoIva;

        System.out.println("Precio     : " + decimalFormat.format(precio));
        System.out.println("IVA " + iva + "%  : " + decimalFormat.format(montoIva));
        System.out.println("Total      : " + decimalFormat.format(montoTotal));

        return precio;
    }
}