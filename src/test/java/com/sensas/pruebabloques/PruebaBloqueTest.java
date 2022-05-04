package com.sensas.pruebabloques;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class PruebaBloqueTest {


    @Test
    public void validateOnelyrics() {
        boolean val = PruebaBloque.testGetWord("A");
        Assertions.assertTrue( val);
    }

    @Test
    public void validateWordCaseLibro() {
        boolean val = PruebaBloque.testGetWord("LIBRO");
        Assertions.assertTrue( val);
    }


    @Test
    public void validateWordCaseLibroMin() {
        boolean val = PruebaBloque.testGetWord("libro");
        Assertions.assertTrue( val);
    }

    @Test
    public void validateWordBozo() {
        boolean val = PruebaBloque.testGetWord("BOZO");
        Assertions.assertFalse(val);
    }
    @Test
    public void validateWordTraje() {
        boolean val = PruebaBloque.testGetWord("TRAJE");
        Assertions.assertTrue(val);
    }
    @Test
    public void validateWordComun() {
        boolean val = PruebaBloque.testGetWord("COMUN");
        Assertions.assertTrue(val);
    }
    @Test
    public void validateWordcampana() {
        boolean val = PruebaBloque.testGetWord("CAMPANA");
        Assertions.assertFalse(val);
    }
    @Test
    public void validateWordDorito() {
        boolean val = PruebaBloque.testGetWord("DORITO");
        Assertions.assertTrue( val);
    }

    @Test
    public void validateWordArlequin() {
        boolean val = PruebaBloque.testGetWord("ARLEQUIN");
        Assertions.assertTrue(val);
    }

}