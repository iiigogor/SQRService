package ru.netology.sqr;

public class Main {
    public static void main(String[]arqs){
        int count=0;
        int j;
        int start=600;
        int stop=800;
        for (int i=10;i<=99;i++) {
            j = i * i;
            if (j >= start && j <= stop)
                count++;}
            System.out.println(count);
    }
}
