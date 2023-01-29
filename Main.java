import  java.util.Scanner;
public class Main {
    public static void main(String[] args)
    { double r,alfa,pi,alan;
      pi = 3.14;
        Scanner input=new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz=");
        r=input.nextDouble();

        System.out.println("Alfa açısını giriniz=");
        alfa=input.nextDouble();

        alan = (pi * (r*r)*alfa )/360;
        System.out.println("Alfa Açısının Alanı="+alan);
    }
}