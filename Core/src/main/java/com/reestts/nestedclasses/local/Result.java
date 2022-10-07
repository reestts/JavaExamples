package com.reestts.nestedclasses.local;

public class Result {

    public void getResult() {
        class Summa {
            private int a;
            private int b;

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }

            public int getB() {
                return b;
            }

            public void setB(int b) {
                this.b = b;
            }

            public int result() {
                return a + b;
            }
        }
        Summa summa = new Summa();
        summa.setA(5);
        summa.setB(4);
        System.out.println(summa.result());
    }
}
