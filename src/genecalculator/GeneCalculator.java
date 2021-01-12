package genecalculator;

import java.util.Random;
import java.util.Scanner;

public class GeneCalculator {

    public static void main(String[] args) {
        
        calculation();
    }

    public static int[] father(int[] fatherList) {
        Scanner input = new Scanner(System.in);

        int a = -100;
        int b = -100;
        System.out.println("Enter 1 if father is homozygous dominant (FF)");
        System.out.println("Enter 2 if father is heterozygous (Ff)");
        System.out.println("Enter 3 if father is homozygous recessive (ff)");
        int type = input.nextInt();
        switch (type) {
            case 1:
                a = 1;
                b = 1;
                break;
            case 2:
                a = 1;
                b = 0;
                break;
            case 3:
                a = 0;
                b = 0;
                break;
        }
        fatherList[0] = a;
        fatherList[1] = b;
        
        return fatherList;

    }

    public static int[] mother(int[] motherList) {
        Scanner input = new Scanner(System.in);

        int a = -100;
        int b = -100;
        System.out.println("Enter 1 if mother is homozygous dominant (FF)");
        System.out.println("Enter 2 if mother is heterozygous (Ff)");
        System.out.println("Enter 3 if mother is homozygous recessive (ff)");
        int type = input.nextInt();
        switch (type) {
            case 1:
                a = 1;
                b = 1;
                break;
            case 2:
                a = 1;
                b = 0;
                break;
            case 3:
                a = 0;
                b = 0;
                break;
        }
        motherList[0] = a;
        motherList[1] = b;
        
        return motherList;

    }

    public static void calculation() {
        Scanner input = new Scanner(System.in);
        int[] motherList = new int[2];
        int[] fatherList = new int[2];
        
        father(fatherList);
        mother(motherList);
        
        System.out.println("How many children are there?");
        int children = input.nextInt();
        Random rand = new Random();
        int count = 1;
        for (int i = 0; i < children; i++) {

            int mum = motherList[rand.nextInt((2 - 1) + 1)];
            int dad = fatherList[rand.nextInt((2 - 1) + 1)];
            int offspring = mum + dad;
            
            if (offspring == 0) {
                System.out.println("Child "+count+" is homozygous recessive (ff)");
            }
            if (offspring == 1) {
                System.out.println("Child "+count+" is heterozygous (Ff)");
            }
            if (offspring == 2) {
                System.out.println("Child "+count+" is homozygous dominant(FF)");
            }
            count++;

        }
    }
}
