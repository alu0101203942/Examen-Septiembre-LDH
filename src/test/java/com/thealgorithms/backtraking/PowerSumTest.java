package com.thealgorithms.backtraking;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class PowerSumTest {

    @Test
    void TestFor1(){
        int N = 100;
        int X = 3;

        PowerSum ps = new PowerSum();

        assertEquals(ps.Sum(100,3),"1^3+2^3+3^3+4^3");

    }

}
