package com.tasks.evalartapp.tasks;

import com.ibm.icu.impl.number.Parse;
import com.tasks.evalartapp.models.Login;
import com.tasks.evalartapp.userinterfaces.Forms;
import net.serenitybdd.core.selectors.Selectors;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.SelectedValue;
import net.serenitybdd.screenplay.ui.Select;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.devtools.v99.css.model.SelectorList;

public class Form implements Task {
    Login data;
    String option,equation;



    public Form(Login data, String option) {
        this.data = data;
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int op;
        String[ ] MathOperation = {"753222663", "196", "-17969","-34218","-6353","1692125","31340","-6114563","16617322","908"};
        String[ ] MathOperation2 = {"3010224", "271", "210","7968","-5","-21372","-10712","321","3631538","-9325"};
        String[ ] Image = {"8", "9", "13","19","8","16","14","15","15","18"};
        String[ ] Month = {"11/05/2023", "28/04/2023", "23/07/2023","21/02/2023","01/05/2023","14/08/2023","12/08/2023","14/08/2023","16/05/2023","18/08/2023"};
        actor.wasAbleTo(Enter.theValue(data.getUSER_NAME()).into(Forms.USER_NAME),
                Enter.theValue(data.getPASWORD()).into(Forms.PASSWORD),
                Click.on(Forms.SEND));
        int count = 0;
        for (int i = 0; i < Integer.parseInt(option); i++)
        {
            actor.wasAbleTo(SelectFromOptions.byValue(MathOperation[i]).from(Forms.RESPONSE));
            actor.wasAbleTo(Click.on("//div[@class='grid grid-cols-4 gap-4 mt-4']//input[@value='"+MathOperation2[i]+"']"));
            actor.wasAbleTo(Enter.theValue(Image[i]).into(Forms.RESPONSE_3));
            actor.wasAbleTo(Enter.theValue(Month[i]).into(Forms.RESPONSE_4));
            actor.wasAbleTo(Click.on(Forms.SEND_FORM));
            String o = Forms.MESSAGE.resolveFor(actor).getText();
            System.out.println(o);
            if (o=="Se encuentra en el ciclo" +(i+2)+ "de"+option)
            {
                System.out.println("El intento numero "+(i+1)+" fue exitoso");

            }
            else
            {
                System.out.println("El intento numero "+(i+1)+" no fue exitoso");
                count= count+1;
                i=0;
                if (count>2)
                {
                    System.out.println("Ha realizado el proceso "+count+" veces , se cancela el proceso");
                }
            }
        }

    }
    public static Form format(Login data, String option) {
        return Tasks.instrumented(Form.class, data,option);
    }
}
