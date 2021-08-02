package labs_examples.exception_handling.examples.JC;

public class JcExceptions {
    public static void main(String[] args) {
        arrayException();

    }

    public static void arrayException() {
        String namesArray[] = {"John", "David", "Chris", "Ann"};

        for (int i = 0; i < namesArray.length; i++) {
            try {
                System.out.println(namesArray[i]);
            } catch
            (ArrayIndexOutOfBoundsException exc) {
                // catch the exception
                System.out.println("Index out-of-bounds!");
            }

            System.out.println("This is the string at index " + i +" " + namesArray[i]);
            System.out.println("After catch statement.");

        }
    }
}


