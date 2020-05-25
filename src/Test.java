import java.util.InputMismatchException;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        double x = 0;
        double sum = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            do {
                sum += x;
                System.out.println("Podaj liczbę:");
                x = scanner.nextDouble();
            } while (x * x < 100);

        sum = sum % 2;
        System.out.println(sum);
        } catch (InputMismatchException e){
            System.err.println("Wprowadzona wartość nie jest liczbą");
        }
        // program wczytuje liczby od użytkownika do momentu gdy kwadret podanej liczby
        // jest większy bądź równy 100 i wyświetla resztę z dzielenia sumy podanych liczb przez 2
    }
}
