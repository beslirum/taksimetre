package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double tutar = 0;
    double km =0;
    double kmTutari = 2.20;
    double acilisTutari = 10;
        Scanner input=new Scanner(System.in);

        System.out.println("Gidilecek mesafeyi KM turunden giriniz: ");
        km=input.nextDouble();

        tutar = acilisTutari + (km*kmTutari);

        if(tutar <20){
            tutar = 20;
        }
            System.out.println("Toplam tutariniz: " +tutar);
    }
}
