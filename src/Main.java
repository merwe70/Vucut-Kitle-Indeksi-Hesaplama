import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz : ");
        double boy=input.nextDouble();

        System.out.println("Kilonuzu Giriniz : ");
        double kilo = input.nextDouble();

        double indeks=kilo / (boy*boy) ;
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

        }
    }
