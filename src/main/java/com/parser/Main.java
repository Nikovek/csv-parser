package com.parser;

public class Main {
    public static void main(String[] args) {
        //1
        int a1 = 10;
        int b1 = 10;
        int c1 = 10;
        int z1 = ((a1 - 3) * b1 / 2) + c1;
        System.out.println(z1);
        //2
        double a2 = 10.0;
        double b2 = 10.0;
        double c2 = 10.0;
        double sqrt2 = Math.sqrt(b2*b2 + 4*a2*c2);
        double numerator2 = b2 + sqrt2;
        double denominator2 = 2 * a2;
        double fraction2 = numerator2 / denominator2;
        double rightexpression2 = -(a2 * a2 * a2 * c2) + 1/(b2 * b2);
        double rezult2 = fraction2 + rightexpression2;
        System.out.println(rezult2);
        System.out.println(rezult2);
        //3
        double x = 60;
        double y = 60;
        double sinx = Math.sin(x);
        double siny = Math.sin(y);
        double cosx = Math.cos(x);
        double cosy = Math.cos(y);
        double tdxy = Math.tan(x * y);
        double numerator3 = sinx + cosy;
        double denominator3 = cosx - siny;
        double fraction3 = numerator3 / denominator3;
        double rezult3 = fraction3 * tdxy;
        System.out.println(rezult3);
        //4
        double R = 111.2222;
        int Rint = (int) R;
        int cout = 0;
        if (R > 0) {
            for (double i = Rint; i > 1; cout++) {
                i /= 10;
            }
        } else {
            for (double i = Rint; i < -1; cout++) {
                i /= 10;
            }
        }
        int cout2 = 0;
        for (double i = R; i % 1 != 0; cout2++) {
            i *= 10;
        }
        double Rdouble = Rint;
        int coutnumber = 1;
        int coutnumber2 = 1;
        do {
            coutnumber *= 10;
            cout--;
        } while (cout > 0);
        do {
            coutnumber2 *= 10;
            cout2--;
        } while (cout2 > 0);
        double Rdrob = Rdouble / coutnumber;
        System.out.println(Rdrob);
        double Rceloe = R * coutnumber2 - Rint * coutnumber2;
        double result4 = Rceloe + Rdrob;
        System.out.println(result4);
        //5
        int T = 3666;
        int coutm = (int) (T / 60);
        int ostatok = T % 60;
        int couth = (int) (coutm / 60);
        int ostatokm = coutm % 60;
        System.out.println(couth);
        System.out.println(ostatokm);
        System.out.println(ostatok);
        //6
        //and && or ||
        x = 4;
        y = -3;
        if (x <= 2 && x >= -2 && y <= 4 && y >= -3){
            System.out.println(true);
        } else if (x >= 2 && x <= 4 && y >= -3 && y <= 0) {
            System.out.println(true);
        } else if (x <= -2 && x >= -4 && y >= -3 && y <= 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}