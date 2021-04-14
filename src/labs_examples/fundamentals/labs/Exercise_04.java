package labs_examples.fundamentals.labs;

public class Exercise_04 {

    public static void main(String[] args) {

        // please declare one or more variables of each primitive data type and print out their values

        // example:
        int i = 10;
        byte monthOfBirth = 11;

        short yearOfBirth = 1957;
        short monthsInYear = 12;
        double monthOfBirthYearFraction = monthOfBirth / monthsInYear;
        byte currentMonth = 4;
        double currentMonthYearFraction = currentMonth / monthsInYear;
        short currentYear = 2021;
        boolean matchMonth = currentMonth == yearOfBirth;
        int myAge = currentYear - yearOfBirth;
        long ageUniverse = 13800000000l * 365;
        long earthAge = 4543000000l * 365;
        int daysOld = 365 * (currentYear - yearOfBirth);
        //my life as a fraction of earth life days
        float myLifeFractionOfEarth = ((daysOld * 1.0f) / earthAge) * 100;
        double leapYears = myAge / 4;
        double trueDaysOld = daysOld + leapYears;
        double doubleExample = 12.22;
        float floatExample = 0.0000014097563540476f;
        //is i equal to year of birth
        // in the line below we are "concatenating" the value of the int variable "i"
        // to the the message that will print to the console. So it will print "i = 10"
        System.out.println("i = " + i);
        System.out.println("My year of Birth is " + yearOfBirth);
        System.out.println("I was born " + monthOfBirth + " months into the year of " + yearOfBirth);
        System.out.println("This means I am " + daysOld + " days old or " + myAge + " years old. There are " + leapYears + " leap years");
        System.out.println("which means I will actualy be " + trueDaysOld + " days old");
        System.out.println("while the Universe is " + ageUniverse + " earth days old without acounting for leap years. The Earth is " + earthAge + " earth days old, which is " + myLifeFractionOfEarth + " of my life. My birth month is the same as the current month, this statement is " + matchMonth);
        System.out.println("Example of a double " + doubleExample);
        System.out.println("This is a float example my life as a percentage of Eath's life span " + floatExample);


        // now your turn :)

    }
}