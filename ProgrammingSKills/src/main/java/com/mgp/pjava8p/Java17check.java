package com.mgp.pjava8p;

public class Java17check {

record FootBaller(String a ) {}
    FootBaller f = new FootBaller("Asdf");
    public static void main(String[] args) {
       Java17check j17 = new Java17check();
       j17.validateFootBaller();


    }

    private  void validateFootBaller() {

        System.out.println(f.a);

    }
}
