package com.company;

import java.util.Random;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scan = new Scanner(System.in);
        int val1, val2;
        LB lb = new LB();
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        System.out.print("Введите высоту елки ");
        val1 = scan.nextInt();
        System.out.println();
        lb.tree(val1);
        System.out.println();
        System.out.println();
        System.out.println("Введите ширину массива");
        val1 = scan.nextInt();
        val2 = scan.nextInt();
        System.out.println();
        lb.mass(val1,val2);
        scan.close();
    }
}

class LB{
    static void tree(int level){
        for(int i=0; i<level;i++){
            for (int y = 0; y < level-i; y++) {
                System.out.print(" ");
            }
            for (int y = 1; y <=2* i-1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void mass(int rows, int cols){
        int[][] mas = new int[rows][cols];
        Random rand = new Random();
        int randval = rand.nextInt(20);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mas[i][j] = randval;
                System.out.print(mas[i][j] + "\t");
                randval += 3;
            }
            System.out.println(); // Перехід на новий рядок
        }
    }
}
