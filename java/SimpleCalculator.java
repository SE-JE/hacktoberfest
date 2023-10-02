package java;

import java.util.Scanner;

/**
 * SimpleCalculator
 */
public class SimpleCalculator {
     public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        double angka1 , angka2, hasil;
        char operator;

        System.out.print("Masukan Angka Pertama : ");
        angka1 = input00.nextDouble();
        System.out.print("Masukan Angka Kedua : ");
        angka2 = input00.nextDouble();
        System.out.print("Masukan Operator (+ - * /) : ");
        operator = input00.next().charAt(0);

        switch(operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;

            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;

            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;

            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
            
            default:
            System.out.println("Operaor yang anda masukan salah");
        }
    }

    
}