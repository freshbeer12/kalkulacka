//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        menu menicko = new menu();

        for (boolean a = true; a; ) {
            menicko.menicko();
            switch (sc.nextInt()) {

                case 1:
                    sc.nextLine();
                    System.out.println("Zadej 1 řetězec");
                    String x = sc.nextLine();
                    System.out.println("Zadej 2 řetězec");
                    String y = sc.nextLine();
                    sc.nextLine();
                    System.out.println(x + y);
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Napiš řetězec");
                    String b = sc.nextLine();
                    System.out.println("Délka řetězce je " + b.length() + "znaků");
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Napiš řetězec");
                    String c = sc.nextLine();
                    System.out.println("Zvol převod na MALA/VELKA písmena");
                    String d = sc.nextLine();
                    if (d.equals("MALA")) {
                        System.out.println(c.toLowerCase());
                    } else if (d.equals("VELKA")) {
                        System.out.println(c.toUpperCase());
                    } else {
                        System.out.println("Tato možnost není dostupná");
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.println("Zadej dolní hranici intervalu");
                    int e = sc.nextInt();
                    System.out.println("Zadej horní hranici intervalu");
                    int f = sc.nextInt();
                    Random random = new Random();
                    System.out.println(random.nextInt(e, f));
                    break;

                case 5:
                    sc.nextLine();
                    System.out.println("Zadej číslo, které chceš umocnit");
                    int g = sc.nextInt();
                    System.out.println("Druhá mocnina čísla " + g + " je " + g * g);
                    break;

                case 6:
                    a = false;

                    break;

                default:
                    System.out.println("Zadej jiné číslo");
            }
        }
    }
}