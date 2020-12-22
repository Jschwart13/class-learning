package basics;

import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        //This will give us suggestions on what to wear based on the temperature and sun condition
        int temperature = 65;
        String sunCondition = "overcast";

        if (temperature > 80) {
            System.out.println("it's nice so you should wear some shorts");
        }
        else if (temperature > 50 && sunCondition == "sunny") {
            System.out.println("its a bit cooler please wear jeans");
            System.out.println("wear a hat for the sun");
        }
        else if (temperature > 50 || sunCondition == "overcast"){
            System.out.println("this is a cool day - wear some warm clothes but no hat");
        }
        else {
            System.out.println("put on a jacket guy");
        }

        System.out.println("The Program is Ending");
    }
}
