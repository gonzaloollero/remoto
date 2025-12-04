import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("¿Cuántos popochos tienes en casa? ");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("¡Deberías conseguir un popocho!");
            } else if (n == 1) {
                System.out.println("Ese popocho está muy mimado.");
            } else if (n <= 3) {
                System.out.println("La familia de popochos es equilibrada.");
            } else {
                System.out.println("¡Demasiados popochos! No quedará espacio en la cama.");
            }

            for (int i = 0; i < n; i++) {
                System.out.println("Zzz...");

                System.out.println("Acontinuacion te pondra el mensaje final");

                System.out.println("Todos los popochitos estan durmiendo");
        }
    }
}