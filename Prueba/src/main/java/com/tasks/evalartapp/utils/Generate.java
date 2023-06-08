package com.tasks.evalartapp.utils;

import com.github.javafaker.Faker;
import com.tasks.evalartapp.models.Login;

public class Generate
{
    private static final Faker FAKER = new Faker();

    public static Login dates()
    {
        return new Login(FAKER.bothify("621070"),
                FAKER.bothify("10df2f32286b7120Mi00LTA3MDEyNg==30e0c83e6c29f1c3")
        );
    }
}
