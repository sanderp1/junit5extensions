package com.cegeka.guild.model;

import com.cegeka.guild.extension.PrintLijnExtensie;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(PrintLijnExtensie.class)
class ModelTest {

    @Test
    public void test1() {
        System.out.println("test 1");
    }

    @Test
    public void test2() {
        System.out.println("test 2");
    }

}