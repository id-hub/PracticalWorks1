package com.ab.work12;

import java.util.Scanner;

public class Task112 {
    public static void main(String[] args) {
        System.out.println("Enter name: ");
//**1**        System.out.println(doPrint());
//**2**        System.out.println(doPrint());        doPrint();
// ================================

        Task112_sub.doStaticPrint();

        Task112_sub task = new Task112_sub();
        task.doPrint();
    }

//**1**    public static String doPrint () {
//        return new Scanner(System.in).nextLine();
//    }

//**2**    public static void doPrint () {
//        System.out.println(new Scanner(System.in).nextLine());
//    }
}
