package povrsinageotela;

import java.util.Scanner;

public class PovrsinaGeoTela {

    static void povrsinaKvadrata() {
        Scanner input = new Scanner(System.in);
        System.out.println("a = ");
        int a = input.nextInt();
        System.out.println("P = " + (a * a));

    }

    static void obimKruga() {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite poluprecnik r= ");
        double r = input.nextDouble();
        System.out.println("O = " + (2 * r * 3.1415));
    }

    static void min() {
        Scanner input = new Scanner(System.in);
        System.out.println("a = ");
        int a = input.nextInt();
        System.out.println("b = ");
        int b = input.nextInt();
        if (a < b) {
            System.out.println("Min je " + a);
        } else {
            System.out.println("Min je: " + b);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Izaberite jednu od opcija: ");
            System.out.println("1 - izracunavanje min dva broja");
            System.out.println("2 - izracunavanje obima kruga");
            System.out.println("3 - izracunavanje povrsine kvadrata");
            System.out.println("Kraj programa");
            System.out.println("Izaberite opciju: ");
            int broj = input.nextInt();

            switch (broj) {
                case 1:
                    min();
                    break;
                case 2:
                    povrsinaKvadrata();
                    break;
                case 3:
                    obimKruga();
                    break;
                case 4:
                    System.out.println("Kraj programa!!!");
                    break;
                default:
                    System.out.println(""
                            + "Izabrali ste pogresan unos");
                    break;

            }

            System.out.println("Da li zelite da nastavite (da ili ne)");
            String sc = input.next();
            if (sc.equalsIgnoreCase("da")) {
                continue;
            } else {
                break;
            }

        }
        System.out.println("Kraj programa");

    }

}
