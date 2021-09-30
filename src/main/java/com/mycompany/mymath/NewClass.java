package com.mycompany.mymath;

public class NewClass implements MyMath {

    public int getCube(int a) {
        int b = a * a * a;
        return b;
    }
    
    public static void main(String[] args) {
    NewClass nc = new NewClass();
    int test = 3;
    System.out.println("The cube of 3 is: " + nc.getCube(test));
    }
    
}
