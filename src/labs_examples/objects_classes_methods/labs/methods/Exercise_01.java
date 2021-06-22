package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // call methods within the main() HERE!

        multiply(3, 4);

        float divide = divide(3, 4);

        yearsInSeconds(17);

        tellAJoke();

        yearsInSeconds(17);

        int count1 = arrayLength("mother", "father");
        int count2 = arrayLength("bob", "frank", "James");
        int count3 = arrayLength("Satah", "Susie", "Martha", "Jane");
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static float divide(int a, int b) {
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    public static void tellAJoke() {
        System.out.println("Knock knock \n who is there? \n Amos \n Amos who? \n a mosquito!");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static long yearsInSeconds(long years) {
        if (years > 4) {
            int leapYears = Math.toIntExact(years / 4);
            long leapYearsSeconds = (long) leapYears * 60 * 60;
            return (leapYearsSeconds + (365 * years * 24 * 60 * 60));
        }
        return years * 24 * 3600;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int arrayLength(String... words) {
        int count = 0;
        for (String w : words) {
            count++;
        }
        return count;
    }


}
