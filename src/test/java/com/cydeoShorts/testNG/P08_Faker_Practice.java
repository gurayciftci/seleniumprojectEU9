package com.cydeoShorts.testNG;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class P08_Faker_Practice {
    @Test
    public void fakerTest(){
        Faker faker = new Faker();

        System.out.println("faker.name().nameWithMiddle() = " + faker.name().nameWithMiddle());
        System.out.println("faker.address() = " + faker.address().fullAddress());


        System.out.println("faker.number().numberBetween(0,3) = " + faker.number().numberBetween(0, 100));

        System.out.println("faker.numerify(\"###-##\") = " + faker.numerify("###-##"));

        System.out.println("faker.letterify(\"???-?????-?\") = " + faker.letterify("???-?????-?"));


    }
}