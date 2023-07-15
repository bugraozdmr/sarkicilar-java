import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        sarkicilar sarkici=new sarkicilar();

        String y;

        System.out.println("Şarkıcı işlemler\n-----\n1.Şarkıcı ekle\n2.Şarkıcı sil\n3.Şarkıcıları yaz\n4.Şarkıcı değiştir\n5.Şarkıcı ara\n6.Çıkış");
        while (true){
            System.out.print("işlem :");
            int u=scanner.nextInt();

            //dump olarak boşluğu çekecek
            scanner.nextLine();
            switch (u){
                case 1:
                    System.out.print("Eklenecek şarkıcı ismi :");
                    y=scanner.nextLine();
                    sarkici.sarkici_ekle(y);
                    break;
                case 2:
                    System.out.print("Silinecek şarkıcı ismi :");
                    y=scanner.nextLine();
                    sarkici.sarkici_sil(y);
                    break;
                case 3:
                    sarkici.sarkici_yaz();
                    break;
                case 4:
                    System.out.print("Değişecek şarkıcı ismi :");
                    y=scanner.nextLine();
                    //ifadeleri doğru sırala ...
                    if (sarkici.kontrol(y)!=1) break;
                    System.out.print("Yeni şarkıcı :");
                    String o=scanner.nextLine();
                    sarkici.sarkici_duzenle(y,o);
                    break;
                case 5:
                    System.out.print("Aranan şarkıcı :");
                    y=scanner.nextLine();
                    sarkici.sarkıcı_ara(y);
                    break;
                case 6:
                    System.out.println("Çıkılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("geçersiz işlem ...");
                    break;
            }
        }
    }
}
