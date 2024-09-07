public class App {
    public static void main(String[] args) throws Exception 
    {
        String creator = "Tahfiz.";
        int Number1 = 20;
        int Number2 = 10;

        int Multiplication;
        Multiplication = Number1 * Number2;

        int addition;
        addition = Number1 + Number2;

        int division;
        division = Number1 / Number2;

        int substraction;
        substraction = Number1 - Number2;

        System.out.println("Printer App");

        System.out.println("This app is made by: " + creator);

        System.out.println("The value of Number1 is " + Number1);
        System.out.println("The value of Number2 is " + Number2);

        System.out.println(Number1 + " * " + Number2 + " = " + Multiplication);
        System.out.println(Number1 + " + " + Number2 + " = " + addition);
        System.out.println(Number1 + " / " + Number2 + " = " + division);
        System.out.println(Number1 + " - " + Number2 + " = " + substraction);
    }
}
