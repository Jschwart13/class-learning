package basics;

import java.sql.SQLOutput;

public class Strings {
    public static void main(String[] args) {
        String bookTitle;
        String wordChoice = "Ring";
        bookTitle = "The Lord of The Rings";

        if (bookTitle.contains(wordChoice)){
            System.out.println("The book contains the word Ring");
        }

        String browser = "Chrome";
        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("The browser is chrome and it doesnt matter the case");
        }

        String firstName = "Joel";
        String lastName = "Schwartz";
        String SSN = "1234567";

        System.out.println("There are " + SSN.length() + " digits in your SSN");

        // Print initials & last 4 of SSN using substring
        System.out.print(firstName.substring(0,1));
        System.out.print(lastName.substring(0,1));
        System.out.print(SSN.substring(3));
    }
}
