/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package birthdaycakecandles;

import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(int[] candles) {
        int tallest = 1;
        int numOfTallest = 0;
        //find tallest
        for (int i = 0; i < candles.length; i++) {
            if (candles[i] > tallest) {
                tallest = candles[i];
            }
        }
        //find number of tallest
        for (int i = 0; i < candles.length; i++) {
            if (candles[i] == tallest) {
                numOfTallest++;
            }
        }
        return numOfTallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candles = new int[n];
        for (int i = 0; i < n; i++) {
            candles[i] = sc.nextInt();
        }
        System.out.println(birthdayCakeCandles(candles));
    }

}
