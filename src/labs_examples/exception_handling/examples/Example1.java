package labs_examples.exception_handling.examples;

// Demonstrate exception handling.
class ExcDemo1 {
    public static void main(String args[]) {
        int nums[] = {0,3,5,7};

        try {
            System.out.println("Before exception is generated.");

            // Generate an index out-of-bounds exception.
            nums[7] = 10;
            System.out.println("this won't be displayed "+ nums[1]);
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("Index out-of-bounds!");

        }
        System.out.println("After catch statement.");


    }

}
