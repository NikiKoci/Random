/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

/**
 *
 * @author Niki
 */
public class Fibonacci {
    public static int count(int n) {
        int a = 1;
        int b = 1;
        for (int i = 2; i < n; i++) {
            int temp = a;
           a=b;
           b = b+temp;
        }
        
        return b;
    }
}
