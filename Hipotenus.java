import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1.Kenarı Giriniz:");
        int kenar1 =  input.nextInt();
        System.out.println("1.Kenar:" + kenar1);

        System.out.print("2.Kenarı Giriniz:");
        int kenar2 = input.nextInt();
        System.out.println("2.Kenar:" + kenar2);

        double hipo;
        hipo = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println("Hipotenüs Değeri:" + hipo);
    }
}
