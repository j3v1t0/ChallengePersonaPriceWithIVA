import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);

        do{
            Menu();
            option = scanner.nextInt();
        }while (option != 3);
    }
    static void Menu(){

        System.out.println("--------Precios con IVA----------");
        System.out.println("---------------------------------");
        System.out.println("1 - Precio");
        System.out.println("2 - Configurar % del IVA");
        System.out.println("3 - Salir");
    }
}