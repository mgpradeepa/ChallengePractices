package com.mgp.pjava8p.funcint;

import java.util.Optional;

public class FuncIntfTester {
    public static void main(String[] args) {
        DataMapper dm = new DataMapper();
        dm.dataLoader();
        dm.whatToWhat(Optional.of("B"));

    }
}
