package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MethodTraining {
    public static void main(String[] args) {
        double a = 3.22;
        double b = 4.22;
        double x = multiply(a, b);

        System.out.println(x);

        int d = 2021;
        int e = 20199;
        int f = 201854;
        int g = 20172;

        int z = largestNumber(d, e, f, g);

        System.out.println(z);

        String w = "rolls royce";
        consonantCount(w);

        int p = 17863;
        primeNumber(p);

        int[] smallArray = {10, 12, 18, 9, 7};
        highestSmallest(smallArray);

        int maxNum =  42000;
        int divisor1 = 6;
        int divisor2 = 4;
        buildArray(maxNum, divisor1,divisor2);
    }

    //1) Demonstrate method overloading in this class
    public static int multiply(int a, int b) {
        return a * b;
    }

    //1) Demonstrate method overloading in this class
    public static double multiply(double a, double b) {
        return a * b;
    }

    // 3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static int largestNumber(int d, int e, int f, int g) {
        int maxPair1;
        int maxPair2;

        if (d > e) {
            maxPair1 = d;
        } else {
            maxPair1 = e;
        }
        if (f > g) {
            maxPair2 = f;
        } else {
            maxPair2 = g;
        }
        if (maxPair1 > maxPair2) {
            return maxPair1;
        } else {
            return maxPair2;
        }
    }

    //4) Write a method to count all consonants (the opposite of vowels) in a String
    public static void consonantCount(String w) {

        int counter = 0;
        for (int looper = 0; looper < w.length(); looper++) {
            if ((w.charAt(looper) == 'a') || (w.charAt(looper) == 'e') || (w.charAt(looper) == 'i') || (w.charAt(looper) == 'o') || (w.charAt(looper) == ' ') || (w.charAt(looper) == 'u')){
                counter++;
            }
        }
        System.out.println("There are " + (w.length() - counter) + " consonants in the string");

    }

    //5) Write a method that will determine whether or not a number is prime
    public static void primeNumber(int p) {
        if (p % 2 > 0) {
            if (p % 3 > 0) {
                if (p % 5 > 0) {
                    System.out.println(p + " is  a Prime Number");
                } else {
                    System.out.println(p + " is not a Prime Number");
                }
            } else {
                System.out.println(p + " is not a Prime Number");
            }
        } else {
            System.out.println(p + " is not a Prime Number");
        }
    }
    // 6) Write a method that will return a small array containing the highest and lowest numbers in a given
    // numeric array, which is passed in as an argument

    public static void highestSmallest(int[] smallArray) {
        int arraySize = smallArray.length - 1;
        int indexlocation = 0;
        int biggerNumber = smallArray[indexlocation];
        int smallerNumber = smallArray[indexlocation];


        for (indexlocation = 0; indexlocation < arraySize; indexlocation++) {

            int b = smallArray[indexlocation + 1];

            if (biggerNumber >= b) {
                biggerNumber = biggerNumber;
            } else {
                biggerNumber = b;
            }


        }
        System.out.println("The biggest number is " + biggerNumber);


        for (indexlocation = 0; indexlocation < arraySize; indexlocation++) {

            int b = smallArray[indexlocation + 1];

            if (smallerNumber <= b) {
                smallerNumber = smallerNumber;
            } else {
                smallerNumber = b;
            }


        }
        System.out.println("The smallest number is " + smallerNumber);
    }

    // 7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    //        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
    //        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
    //        length of the returned list

    public static void buildArray(int maxNum, int divisor1, int divisor2) {

        int magicNumberArraysize = 0;
        ArrayList magicNumberArray = new ArrayList();

        for (maxNum = maxNum; maxNum > 0; maxNum--) {
            if ((maxNum % divisor1 == 0) && (maxNum % divisor2 ==0)) {
                magicNumberArray.add(maxNum);
            } else {
                magicNumberArraysize = magicNumberArray.size();
            }
        }
        System.out.println("Length of the array is " + magicNumberArraysize);
    }

}