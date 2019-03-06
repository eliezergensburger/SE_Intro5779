package com.kuku.purim;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {

    HourlyEmployee emp = new HourlyEmployee("kuku","jojo",123,10,5689.78);
    @org.junit.jupiter.api.Test
    void toStringTest() {
        assertEquals("Employee{firstName='kuku', lastName='jojo', id=123}\n" +
                "HourlyEmployee{hours=10, wage=5689.78}",emp.toString());
    }
}