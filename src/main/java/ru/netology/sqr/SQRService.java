package ru.netology.sqr;

public class SQRService {
    public int getCubesCount(int min, int max) {
        int rightCubes = 0;
        for (int i = 10; i < 100; i++) {
            int cube = i * i;
            if (cube >= min && cube <= max) {
                rightCubes++;
            }
        }
        return rightCubes;
    }
}
