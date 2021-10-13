import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        //ask the user for a temperature
        System.out.println("Enter a temperature:");
        double tempInput = scnr.nextDouble();
        scnr.nextLine();

        //ask the user for the scale of the temperature
        System.out.println("Is that Fahrenheit (F) or Celsius (C)?");
        String inputScale = scnr.nextLine();

        //convert to Celsius if given temperature was Fahrenheit
        double finalTempCelsius = (5.0 / 9.0) * (tempInput - 32);
//        System.out.println(finalTempCelsius);

        //convert to Fahrenheit if given temperature was Celsius
        double finalTempFahrenheit = 9.0 / 5.0 * tempInput + 32;
//        System.out.println(finalTempFahrenheit);


        //print the result using printf() to round both temps to 1 decimal place
        if (inputScale.equals("F")) {
            System.out.printf("%.1f degrees Fahrenheit is %.1f degrees Celsius\n", tempInput, finalTempCelsius);
        } else
            System.out.printf("%.1f degrees Celsius is %.1f degrees Fahrenheit", tempInput, finalTempFahrenheit);

    }
}
