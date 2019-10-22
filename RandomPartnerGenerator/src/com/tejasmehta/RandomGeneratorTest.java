package com.tejasmehta;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomGeneratorTest {

    @Test
    void sort() {

        List<String> modifiableList = new ArrayList<>(List.of("Admed, Adnan", "Campos, Marc", "Carlyon, Nathaniel", "Daptardar, Sanay", "Dasti, Joseph",
                "Dicang, Brandon", "Ecarma, Justin", "Gomes, Frank", "Hernandez, David", "Krupp, Ryan", "McDermid, Connor", "Mehta, Tejas", "Sarkhot, Rayyan",
                "Stulak, Brendan", "Tummalapalli, Poojit"));
        RandomGenerator genTest= new RandomGenerator(modifiableList);

        String input = "add 5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        genTest.pair();
        genTest.sort();
    }
}