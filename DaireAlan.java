
import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args){
        //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
         //Alan Formülü : π * r * r;
        //Çevre Formülü : 2 * π * r;
        double r, pi = 3.14;
        Scanner yeni = new Scanner(System.in);
        System.out.print("Yaricapi giriniz : ");
        r = yeni.nextDouble();
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Cevresi : " + cevre );

        // Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //𝜋 sayısını = 3.14 alınız.
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        double alfa, acilialan;
        System.out.println("Dairenin merkez aci olcusunu giriniz : ");
        alfa = yeni.nextDouble();

        acilialan = (pi * (r*r) * alfa) / 360;
        System.out.println("Dairenin alani : " + acilialan);




    }
}
