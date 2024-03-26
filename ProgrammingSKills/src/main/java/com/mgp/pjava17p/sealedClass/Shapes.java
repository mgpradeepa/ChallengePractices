package com.mgp.pjava17p.sealedClass;

public sealed class Shapes permits Circle, Rectangle, Triangle {
    public void draw() {
        System.out.println( "Drawn with shapes permission ");
    }
}
