import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner imp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = imp.nextInt();
        int toplam=0, tempNumber;
        int number1 = number;
        while(number!=0){
            tempNumber= number%10;
            toplam+=tempNumber;
            number /=10;
        }
        System.out.println(number1 + " Sayısının rakamları toplamı: " + toplam);
    }
}