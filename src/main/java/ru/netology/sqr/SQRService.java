package ru.netology.sqr;

public class SQRService {
    public int shouldmultyplyByYourself(int start, int stop) {
        SQRService service = new SQRService();
        int count = 0;
        int j;
        for (int i = 10; i <= 99; i++) {
            j = i * i;
            if (j >= start && j <= stop)
                count++;
        }
        return count;
    }
}
