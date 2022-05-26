import java.util.Scanner;

public class Ch2 {
    public static void main(String[] args) {

        //Question4();
        //Question5();
        //Question6();
        //Question7();
        //Question8();
        //Question13();
        //Question14();
    }

    public static void Question4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input pounds:");
        float pounds = input.nextFloat();
        double kilos = (pounds * 0.454);
        System.out.println(pounds + " pounds is " + (kilos) + "kilograms");
    }

    public static void Question5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and gratuity: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        System.out.println("The gratuity is $" + (gratuity / 100) * subtotal + " and the total is $" + (((gratuity / 100) * subtotal) + subtotal));
    }

    public static void Question6() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number between 0 and 1000: ");
        int number = input.nextInt();
        int remainder1 = (number%10);
        int numberDiv1 = (number/10);
        int remainder2 = (numberDiv1%10);
        int numberDiv2 = (numberDiv1/10);
        int remainder3 = (numberDiv2%10);
        System.out.println(remainder1 + remainder2 + remainder3);
    }

    public static void Question7() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int minutes = input.nextInt();
        int years = (minutes/525600);
        int days = ((minutes%525600)/1440);
        System.out.println(minutes + " minutes is " + years + " Years and " + days + " Days");
    }

    public static void Question8() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT:");
        int offset = input.nextInt();
        long totalMilliseconds = ( (System.currentTimeMillis()) + (offset*3600000) );
        long totalSeconds = totalMilliseconds/1000;
        long currentSecond = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinute = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHour = totalHours%24;
        System.out.println("Current time is "+currentHour+ ":"+currentMinute+":"+currentSecond+"GMT");
    }

    public static void Question13() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the interest rate:");
        float monthlyInterestRate = ( (input.nextFloat() / 100) / 12);
        System.out.println("Enter the monthly savings amount:");
        float monthlySaving = input.nextFloat();
        float monthOneSavings = monthlyInterestRate * monthlySaving + monthlySaving;
        float monthTwoSavings = ((monthOneSavings + monthlySaving) * monthlyInterestRate) + monthOneSavings + monthlySaving;
        float monthThreeSavings = ((monthTwoSavings + monthlySaving) * monthlyInterestRate) + monthTwoSavings+ monthlySaving;
        float monthFourSavings = ((monthThreeSavings + monthlySaving) * monthlyInterestRate) + monthThreeSavings + monthlySaving;
        float monthFiveSavings = ((monthFourSavings + monthlySaving) * monthlyInterestRate) + monthFourSavings + monthlySaving;
        float monthSixSavings = ((monthFiveSavings + monthlySaving) * monthlyInterestRate) + monthFiveSavings + monthlySaving;

        System.out.println("After the sixth month, the savings will be: " + monthSixSavings + "$");

    }

    public static void Question14() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        float pounds = input.nextLong();
        System.out.println("Enter height in inches: ");
        float heightInInches = input.nextFloat();
        float kilograms = (float) (pounds * 0.45359237);
        float  heightInMetres = (float) (heightInInches * 0.0254);
        float heightSquared = (float) Math.pow(heightInMetres, 2);
        System.out.println("BMI is " + kilograms / heightSquared);

    }

}
