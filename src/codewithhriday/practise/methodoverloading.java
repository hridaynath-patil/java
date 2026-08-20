package codewithhriday.practise;

public class methodoverloading {
    // by changing the return type

    static class calculate{
        int multiply(int a, int b){
            return a*b;
        }
        double multiply(double a, double b){
            return a*b;
        }

    public static void main(String[] args) {
            calculate obj  = new calculate();
            int c = obj.multiply(5,4);
            double d =  obj.multiply(9.1,10.2);
            System.out.println("Return Intger : " + c);
            System.out.println("Return Double : " + d);
        }
    }
}

// Changing Argument Types
//Overloads the method by changing the data types of the inputs
//one takes integers (int) and the other takes decimals (double).
