package com.cyber.Proektimiz;

import java.util.Scanner;

public class Qeydiyyat {
    public static void main(String[] args) throws InvalidMailFormatException {

        System.out.println("Mail*: ");

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        MailChecker checker = new MailChecker(s);
        checker.check();
        System.out.println("Password*: ");


//        Scanner scan1 = new Scanner(System.in);
//        String s1 = scan.nextLine();


        String prluzun;

        while (true) {
            prluzun = scan.nextLine();
            String qweer = new String(String.valueOf(new String(prluzun)));
            if (qweer.length() < 8 ) {
                System.out.println("Daxil edtiyiniz şifrə minimum 8 simvoldan ibarət olmalıdır!\nZəhmət olmasa düzgün formatda qeyd edin");
            } else {
                System.out.println("Qeydiyyat uğurla tamamlandı");
                break;
            }
        }


    }
}
