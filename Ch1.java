public class Ch1 {
    public static void main(String[] args) {
        //Question1();
        //Question2();
        //Question3();
        //Question4();
        //Question5();
        //Question6();
        //Question7();
        //Question8();
        //Question9();
        //Question10();
        //Question11();
        //Question12();
        //Question13();
    }

    public static void Question1() {
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun.");
    }

    public static void Question2() {
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
    }

    public static void Question3() {
        System.out.println("    J    A    V     V   A");
        System.out.println("    J   A A    V   V   A A");
        System.out.println("J   J  AAAAA    V V   AAAAA");
        System.out.println(" J J  A     A    V   A     A ");
    }

    public static void Question4() {
        System.out.println("a       a^2       a^3");
        System.out.println("1       1         1");
        System.out.println("2       4         8");
        System.out.println("3       9         27");
        System.out.println("4       16        64");
    }

    public static void Question5() {
        double compute1 = ((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
        System.out.println(compute1);
    }

    public static void Question6() {
        System.out.println("The sum is " + (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9));
    }

    public static void Question7() {
        double pi1 = (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        double pi2 = (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13));
        System.out.println(4 * pi1);
        System.out.println(4 * pi2);
    }

    public static void Question8() {
        double radius = (5.5);
        double perimeter = (2 * radius * Math.PI);
        double area = (radius * radius * Math.PI);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }

    public static void Question9() {
        double width = (4.5);
        double height = (7.9);
        double area = (width * height);
        double perimeter = (height*2 + width*2);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void Question10() {
        double kilometres = (14);
        double miles = (14/1.6);
        double minutes = (45.5);
        double hours = (45.5/60);
        System.out.println(miles);
        System.out.println(hours);
        System.out.println("Average Speed: "+ miles/hours + " MPH" );
    }

    public static void Question11() {
        //86400 = seconds per year
        double birthsPerYear = (86400/7.0);
        double deathsPerYear = (86400/13.0);
        double immigrantsPerYear = (86400/45.0);
        double currentPopulation = (312032486);
        System.out.println("Population Projections");
        System.out.println("Year 1:     "+ Math.round( (currentPopulation + birthsPerYear + immigrantsPerYear - deathsPerYear)) );
        System.out.println("Year 2:     "+ Math.round( (currentPopulation + 2*(birthsPerYear + immigrantsPerYear - deathsPerYear))) );
        System.out.println("Year 3:     "+ Math.round( (currentPopulation + 3*(birthsPerYear + immigrantsPerYear - deathsPerYear))) );
        System.out.println("Year 4:     "+ Math.round( (currentPopulation + 4*(birthsPerYear + immigrantsPerYear - deathsPerYear))) );
        System.out.println("Year 5:     "+ Math.round( (currentPopulation + 5*(birthsPerYear + immigrantsPerYear - deathsPerYear))) );
    }

    public static void Question12() {
        double miles = (24);
        double kilometres = (24*1.6);
        double secondsRan = ((60*60)+(40*60)+35);
        double hoursRan = (secondsRan/3600);
        System.out.println("Average speed: "+ (kilometres/hoursRan)+ " KPH");
    }

    public static void Question13() {
        double a = (3.4);
        double b = (50.2);
        double e = (44.5);
        double c = (2.1);
        double d = (0.55);
        double f = (5.9);
        double x = ( ((e*d) - (b*f)) / ((a*d) - (b*c)) );
        double y = ( ((a*f) - (e*c)) / ((a*d) - (b*c)) );
        System.out.println("X = "+(x) + "  Y = " +(y) );
    }
}