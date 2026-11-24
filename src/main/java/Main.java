
import java.util.Scanner;

public class Main {

    public static void main() {

        do {
            HesapMakinesi();

        } while (tekrar.tekrarCls() == false);

        HesapMakinesi();

    }

    public static void HesapMakinesi() {

        Scanner girdi = new Scanner(System.in);

        String islem;

        System.out.println("Merhaba. Hesap makinesine hos geldin.");
        System.out.println("Hangi islemi yapmak istersen o islemin numarasini yaz.");
        System.out.println("(+) Toplama (-) Cikarma (*) Carpma (/) Bolme (√) Karekok Alma (^) Us Alma (D) Diger Islemler (E) Cikis");

        System.out.print("Hangi islemi yapmak istiyorsun: ");
        islem = girdi.nextLine().toLowerCase();

        double sayi1;
        double sayi2;
        double sonuc;

        switch (islem) {
            case "+" -> {
                System.out.println("Toplama islemi secildi.");
                System.out.print("Lutfen toplamak istedigin ilk sayiyi gir: ");
                sayi1 = girdi.nextDouble();

                System.out.print("Tamamdir, kaydettim. 2. sayiyi da girer misin: ");
                sayi2 = girdi.nextDouble();

                sonuc = sayi1 + sayi2;

                System.out.println("Islemin: " + sayi1 + "+" + sayi2);
                System.out.println("Sonuc: " + sonuc);

                break;
            }

            case "-" -> {
                System.out.println("Cikarma islemi secildi.");
                System.out.print("Lutfen cikartilan sayiyi gir: ");
                sayi1 = girdi.nextDouble();

                System.out.print("Tamamdir, kaydettim. cikan sayiyi da girer misin: ");
                sayi2 = girdi.nextDouble();

                sonuc = sayi1 - sayi2;

                System.out.println("Islemin: " + sayi1 + "-" + sayi2);
                System.out.println("Sonuc: " + sonuc);

                break;
            }

            case "*" -> {
                System.out.println("Carpma islemi secildi.");
                System.out.print("Lutfen carpmak istedigin ilk sayiyi gir: ");
                sayi1 = girdi.nextDouble();

                System.out.print("Tamamdir, kaydettim. 2. sayiyi da girer misin: ");
                sayi2 = girdi.nextDouble();

                sonuc = sayi1 * sayi2;

                System.out.println("Islemin: " + sayi1 + "x" + sayi2);
                System.out.println("Sonuc: " + sonuc);

                break;
            }

            case "/" -> {
                System.out.println("Bolme islemi secildi.");
                System.out.print("Lutfen bolunen sayiyi gir: ");
                sayi1 = girdi.nextDouble();

                System.out.print("Tamamdir, kaydettim. bolen sayiyi da girer misin: ");
                sayi2 = girdi.nextDouble();

                sonuc = sayi1 / sayi2;

                System.out.println("Islemin: " + sayi1 + "/" + sayi2);
                System.out.println("Sonuc: " + sonuc);

                break;
            }

            case "√" -> {
                System.out.println("Karekok Alma islemi secildi.");
                System.out.print("Lutfen karekoku alinancak sayiyi gir: ");
                sayi1 = girdi.nextDouble();

                sonuc = Math.sqrt(sayi1);

                System.out.println("Islemin: √" + sayi1);
                System.out.println("Sonuc: " + sonuc);

                break;
            }

            case "^" -> {
                System.out.println("Us Alma islemi secildi.");
                System.out.print("Lutfen ussu alinancak sayiyi (taban) gir: ");
                sayi1 = girdi.nextDouble();

                System.out.print("Tamamdir, kaydettim. ussu de girer misin: ");
                sayi2 = girdi.nextDouble();

                sonuc = Math.pow(sayi1, sayi2);

                System.out.println("Islemin: " + sayi1 + "^" + sayi2);
                System.out.println("Sonuc: " + sonuc);

                break;
            }

            case "d" -> {
                System.out.println("Diger Islemler menusu aciliyor..");
                System.out.println("Diger islemler menusune hos geldin. Iste yapabilecegin islemler...");

                System.out.println("(!) Faktoriyel Alma (E) Cikis");
                String dislem = girdi.nextLine().toLowerCase();

                switch (dislem) {
                    case "!" -> {

                        System.out.print("Tamamdir. Faktoriyelini almak istedigin sayiyi gir: ");
                        sayi1 = girdi.nextDouble();

                        sonuc = 1;

                        for (int i = 1; i < sayi1 + 1; i++) {
                            sonuc = sonuc * i;

                        }

                        System.out.println("Islemin: !" + sayi1);
                        System.out.println("Sonuc: " + sonuc);

                        break;

                    }

                    case "e" -> {
                        System.out.println("Tamamdir, sistem kapatiliyor.");
                        System.exit(0);

                    }

                    default -> {
                        System.out.println("Gecerli bir sayi girmediginden dolayi program sonlandirildi.");
                        System.exit(1);
                    }

                }

            }

            case "e" -> {
                System.out.println("Tamamdir, sistem kapatiliyor.");
                System.exit(0);
            }

            default -> {
                System.out.println("Gecerli bir sayi girmediginden dolayi program sonlandirildi.");
                System.exit(1);
            }

        }

    }

}
