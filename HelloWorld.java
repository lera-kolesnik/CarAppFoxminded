public class HelloWorld {
    public static void main(String[] args) {
        double i = 6;
        double j = 7;
        double answer = j / i;

        String message = "Hello World!";

        String stringAnswer = message + "\n" + answer; 

        boolean isMoreThanOne = answer >1 ? true : false;
       
        System.out.println(stringAnswer + " " + isMoreThanOne);
    }
}
