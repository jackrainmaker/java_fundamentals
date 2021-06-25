package labs_examples.exception_handling.examples;

class ExceptionRethrow {
    public static void exceptionRethrow() throws ArrayIndexOutOfBoundsException {
        int number[] = {12,13,22,0,11,7};
        int divider[] = {12,9,0,4,5};

        int n;
        for(n = 0; n < number.length; n++) {
            try{
                System.out.println(number[n]+" divided by "+divider[n]+" is equal to "+number[n]/divider[n]);
            }
            catch (ArithmeticException exc){
                System.out.println("Cannot divide by Zero");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("There are more numbers than dividers. Spending time with the IDE is improving my skill set. Process complete");
                throw exc;

            }

        }


    }

}

class ExceptionRethrowDemo { //If I run the class versus main exception is thrown before or after the method runs
    public static void main(String[] args) {
        ExceptionRethrow.exceptionRethrow();
    }
}
