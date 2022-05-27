import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Ch3 {
    public static void main(String[] args) {

        //Question4();
        //Question11();
        //Question17();
        //Question18();
        //Question19();
        //Question22();

    }

    public static void Question4() {
        Scanner input = new Scanner(System.in);
        int randomInt = 1+(int)(Math.random() * 12);
        System.out.println(randomInt);
        if (randomInt == 1){
            System.out.println("January");
        }
        else if (randomInt == 2){
            System.out.println("February");
        }
        else if (randomInt == 3){
            System.out.println("March");
        }
        else if (randomInt == 4){
            System.out.println("April");
        }
        else if (randomInt == 5){
            System.out.println("May");
        }
        else if (randomInt == 6){
            System.out.println("June");
        }
        else if (randomInt == 7){
            System.out.println("July");
        }
        else if (randomInt == 8){
            System.out.println("August");
        }
        else if (randomInt == 9){
            System.out.println("September");
        }
        else if (randomInt == 10){
            System.out.println("October");
        }
        else if (randomInt == 11){
            System.out.println("November");
        }
        else if (randomInt == 12){
            System.out.println("December");
        }

    }

    public static void Question11() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year ");
        int inputYear = input.nextInt();
        System.out.println("Enter month 1-12 ");
        int inputMonth = input.nextInt();

        int janDays = 31;
        int febDays = 28;
        int febLeap = 29;
        int marchDays = 31;
        int aprilDays = 30;
        int mayDays = 31;
        int juneDays = 30;
        int julyDays = 31;
        int augustDays = 31;
        int septDays = 30;
        int octDays = 31;
        int novDays = 30;
        int decDays = 31;

        if (inputMonth == 1){
            System.out.println(janDays);
        }
        else if ((inputMonth == 2) && (inputYear % 4 == 0) && (inputYear % 100 != 0)) {
            System.out.println(febLeap);
        }
            else if (inputMonth == 2) {
            System.out.println(febDays);
            }

        else if (inputMonth == 3){
            System.out.println(marchDays);
        }
        else if (inputMonth == 4){
            System.out.println(aprilDays);
        }
        else if (inputMonth == 5){
            System.out.println(mayDays);
        }
        else if (inputMonth == 6){
            System.out.println(juneDays);
        }
        else if (inputMonth == 7){
            System.out.println(julyDays);
        }
        else if (inputMonth == 8){
            System.out.println(augustDays);
        }
        else if (inputMonth == 9){
            System.out.println(septDays);
        }
        else if (inputMonth == 10){
            System.out.println(octDays);
        }
        else if (inputMonth == 11){
            System.out.println(novDays);
        }
        else if (inputMonth == 12){
            System.out.println(decDays);
        }

    }

    public static void Question17() {

        Scanner input = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2): ");

        int playerDraws = input.nextInt();
        int computerDraws = 1+(int)(Math.random() * 3);

        String playerRPS = "null";
        String compRPS = "null";

        if (playerDraws == 0) {
            playerRPS = "scissor";
        } else if (playerDraws == 1) {
            playerRPS = "rock";
        } else if (playerDraws == 2) {
            playerRPS = "paper";
        }

        if (computerDraws == 1){
            compRPS = "scissor";
        } else if (computerDraws == 2) {
            compRPS = "rock";
        } else if (computerDraws == 3) {
            compRPS = "paper";
        }

        //Scenarios

        if ( playerRPS == compRPS){
            System.out.println("The computer is " + compRPS + ". You are " + playerRPS + " too. It is a draw");
        } else if (playerDraws==0 && computerDraws==2){
            System.out.println("The computer is " + compRPS + ". You are " + playerRPS + ". Computer wins");
        } else if (playerDraws==0 && computerDraws==3){
            System.out.println("The computer is " + compRPS + ". You are " + playerRPS + ". You win!");
        } else if (playerDraws==1 && computerDraws==1){
            System.out.println("The computer is " + compRPS + ". You are " + playerRPS + ". You win!");
        } else if (playerDraws==1 && computerDraws==3){
            System.out.println("The computer is " + compRPS + ". You are " + playerRPS + ". Computer wins");
        } else if (playerDraws==2 && computerDraws==1){
            System.out.println("The computer is " + compRPS + ". You are " + playerRPS + ". Computer wins");
        } else if (playerDraws==2 && computerDraws==2){
            System.out.println("The computer is " + compRPS + ". You are " + playerRPS + ". You win!");
        }

    }

    public static void Question18() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight: ");
        int shippingWeight = input.nextInt();
        if (shippingWeight < 1) {
            System.out.println("Cost is $3.50");
        } else if (shippingWeight > 1 && shippingWeight <= 3) {
            System.out.println("Cost is $5.50");
        } else if (shippingWeight > 3 && shippingWeight <= 10) {
            System.out.println("Cost is $8.50");
        } else if (shippingWeight > 10 && shippingWeight <= 20) {
            System.out.println("Cost is $10.50");
        } else if (shippingWeight > 20 && shippingWeight < 50) {
            System.out.println("cost is $21.00");
        } else if (shippingWeight >= 50) {
            System.out.println("The package cannot be shipped. Too heavy!");
        }

    }

    public static void Question19() {

        Scanner input = new Scanner(System.in);

        int edge1 = 1+(int)(Math.random() * 999);
        int edge2 = 1+(int)(Math.random() * 999);
        int edge3 = 1+(int)(Math.random() * 999);

        System.out.println(edge1);
        System.out.println(edge2);
        System.out.println(edge3);

        if ( ((edge1 + edge2) >= edge3)  && ((edge1 + edge3) >= edge2) && ((edge2 + edge3) >= edge1) ) {
            System.out.println("Triangle is VALID");
        } else {
            System.out.println("Triangle is INVALID");
        }

    }

    public static void Question22() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with 2 coordinates (x and y): ");
        double pointX = input.nextDouble();
        double pointY = input.nextDouble();


        // calculate the distance from user input to 9,9

        if (Math.sqrt( ( Math.pow((pointX-0),2) + Math.pow((pointY-0),2) ),2) <= 10) {
            System.out.println("The point is in the circle!");
        } else {
            System.out.println("The point is NOT in the circle!");
        }



    }

}
