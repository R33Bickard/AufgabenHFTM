import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie das Jahr ein: ");
        int jahr = scanner.nextInt();
        boolean isSchaltjahr = false;
        
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    isSchaltjahr = true;
                }
            } else {
                isSchaltjahr = true;
            }
        }
        
        if (isSchaltjahr) {
            System.out.println(jahr + " ist ein Schaltjahr.");
        } else {
            System.out.println(jahr + " ist kein Schaltjahr.");
     
        }
        scanner.close();
    }
}