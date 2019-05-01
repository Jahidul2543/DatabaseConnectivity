package exception;

public final class ExceptionDemo {

    private static int division;

    public static void main(String[] args){

    divide(4,0);

    }

    public static int  divide(int x, int y){

        try {
            /**
             * This area of code may have exception which may crash the application
             * That's why it needs to be handled
             * */
           
            int division = x / y;
            System.out.println("Result: " + division);
           
        }

        /**
         * If there is any exception in try block only then catch block will be executed
         *
         * */

        catch ( ArithmeticException e){

            /**
             * You can get more details information about the exception
             * You can provide a customized message to the users
             * */

             e.printStackTrace();

            System.out.println("You are providing invalid number");

        }

        /**
         * Whatever happens finally block will be executed
         * */
        finally {

            System.out.println("Thank you for using my App");
        }


        return division;

    }

    public void finalDemo(){

        final  int x =4;

    }

}
