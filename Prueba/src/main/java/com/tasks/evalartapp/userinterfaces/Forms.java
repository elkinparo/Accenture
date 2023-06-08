package com.tasks.evalartapp.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Forms
{
    public static final Target USER_NAME = Target.the("USER_NAME").located(By.xpath("//input[@name='username']"));
    public static final Target PASSWORD = Target.the("PASSWORD").located(By.xpath("//input[@name='password']"));
    public static final Target SEND = Target.the("SEND").located(By.xpath("//button[@type='submit']"));
    public static final Target EQUATION = Target.the("EQUATION").located(By.xpath("//div[@class=' flex flex-col items-center bg-white rounded-md shadow-md p-5 space-y-4 my-5 w-2/5 ']//p[@class='text-center text-xl font-bold']"));
    public static final Target RESPONSE = Target.the("RESPONSE").located(By.xpath("//select[@name='select']"));
    public static final Target RESPONSE_2 = Target.the("RESPONSE_2").located(By.xpath("//div[@class='grid grid-cols-4 gap-4 mt-4']"));
    public static final Target RESPONSE_3 = Target.the("RESPONSE_3").located(By.xpath("//div[@class='flex flex-col items-center p-4 space-y-5 bg-white rounded-md w-2/5 shadow-md my-5']//input[@name='number']"));
    public static final Target RESPONSE_4 = Target.the("RESPONSE_4").located(By.xpath("//div[@class='flex flex-col items-center p-4 space-y-5 bg-white rounded-md w-2/5 shadow-md my-5']//input[@name='date']"));
    public static final Target SEND_FORM = Target.the("SEND_FORM").located(By.xpath("//button[@type='submit']"));
    public static final Target MESSAGE = Target.the("MESSAGE").located(By.xpath("//h2[@class='text-center text-2xl']//following::div//div[@class='my-4']//p[@class='text-xl text-center text-green-500']"));
}
