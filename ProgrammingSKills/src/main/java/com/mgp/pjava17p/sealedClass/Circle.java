package com.mgp.pjava17p.sealedClass;

public non-sealed class Circle extends Shapes {
    @Override
    public void draw() {
        System.out.println("Drawn with permission but no sides");
    }
}
