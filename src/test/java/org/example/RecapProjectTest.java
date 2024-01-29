package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecapProjectTest {

    @Test
    void checkPasswordLength() {
        String password="ayse";
        int expected=password.length();
        int actual=RecapProject.checkPasswordLength(password);
        assertEquals(expected,actual);
    }

    @Test
    void checkCotainsUpperundLowerCase(){
        String password="Ayse";
        boolean expected=true;
        boolean actual= RecapProject.containsUpperundLowerCase(password);
        assertEquals(expected,actual);

    }
    @Test
    void checkWeakPassword(){
        String password="aysE1";
        boolean expected=true;
        boolean actual=RecapProject.checkWeakPassword(password);
        assertEquals(expected,actual);
    }
}