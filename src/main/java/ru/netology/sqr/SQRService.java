package ru.netology.sqr;

public class SQRService {
    public int multyplyByYourself(int start, int stop) {
        int count = 0;
        int j;
        for (int i = 10; i <= 99; i++) {
            j = i * i;
            if (j >= start && j <= stop){
                count++;}
        }
        return count;
    }
}
