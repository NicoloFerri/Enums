package javaOOPAdvanced_V2.Enums;

public class Main {
    public static void main(String[] args) {

        char lastCharacter = ' ';

        for (Months month : Months.values()) {
            lastCharacter = month.name().charAt(month.name().length() - 1);
            if ( lastCharacter == 'Y'){
                System.out.println(month.name() + " -  ends with y");
            }else {
                System.out.println(month.name() + " - doesn't end with y");
            }

        }
    }
}
