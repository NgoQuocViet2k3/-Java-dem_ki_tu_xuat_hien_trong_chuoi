package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập vào một chuỗi: ");
            String s = sc.nextLine();
            System.out.print("Nhập vào ký tự cần đếm: ");
            char ch = sc.next().charAt(0);

            int count = occurences(s, ch);
            System.out.printf("Số lần xuất hiện của '%c' trong \"%s\" là %d", ch, s, count);
        }


    public static int occurences(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}