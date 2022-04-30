package com.company;

import org.jetbrains.annotations.NotNull;

import javax.print.DocFlavor;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n *** Please enter a String : *** \n");
        Scanner scanner = new Scanner(System. in);
        String s = scanner.nextLine();

        System.out.println("\nThe Reverse of this is : "+ reverseString(s));



    }
    public static String reverseString(@NotNull String  s)
    {
        char[] letters = new char[s.length()];

        int letterIndex=0;
        for(int i=s.length()-1; i>=0; i--){
            letters[letterIndex] = s.charAt(i);
            letterIndex ++;
        }

        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            reverse = reverse + letters[i];

        }

        return reverse;
    }
}
