package codewithhriday.practise;

public class methodoverloading1 {
    //by changing arguments passed
    static class calculate{
        int multiply(int a, int b){
            return a*b;
        }
        int multiply(int a, int b, int c){
            return a*b*c;
        }

        public static void main(String[] args){
            calculate obj = new calculate();
            int c = obj.multiply(10, 20);
            int d = obj.multiply(10, 20, 30);
            System.out.println(c);
            System.out.println(d);
        }
    }
}


//Changing Argument Count
//Overloads the method by changing the number of inputs.
//data types remain exactly the same (int)
//but one method takes two numbers and the other takes three.