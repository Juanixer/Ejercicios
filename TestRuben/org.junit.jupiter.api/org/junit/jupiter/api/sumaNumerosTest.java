package org.junit.jupiter.api;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;




@ExtendWith(MockitoExtension.class)
class sumaNumerosTest {

    @org.junit.jupiter.api.Test
    void sumArray() {
        int[] numeros = {2, 4, 6, 8, 10};
        int indice = 0;
        int sum = underTest.sumArray(numeros, indice);
        int media = sum/ numeros.length;
        System.out.println("La media aritmética de los números es: " + media);
    }

    @org.junit.jupiter.api.Test
    void main() {
        int[] numeros = {2, 4, 6, 8, 10};
        int indice = 0;
        int sum = underTest.sumArray(numeros, indice);
        int media = sum/ numeros.length;
        System.out.println("La media aritmética de los números es: " + media);
    }
}