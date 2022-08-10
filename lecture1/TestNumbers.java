import java.util.Scanner;

public class TestNumbers {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int result = a + b;
        System.out.println("Sum of 3 and 5 = " + result);

        double c = 8.5;
        double d = 5.3;
        double result1 = c - d;
        System.out.println("Result of subtraction of 8.5 and 5.3 = " + result1);

        System.out.println(electronicWatch(86400));
        System.out.println(electronicWatch(86399));

        System.out.println(electronicWatch(70));




// OOP_HT1_practiceFor
     //   Scanner scanner = new Scanner(System.in);
      //  String name = scanner.nextLine();
    //    System.out.println("Hello" + " " + name);

        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int secondsPerDay = 86400;
        int secondsPerHour = 3600;
        int secondsPerMinute = 60;

        int remainingsOf1Day = seconds % secondsPerDay;
        int remainingsOf1Hr = remainingsOf1Day % 3600;
        int h = remainingsOf1Day / 3600;
        int m = remainingsOf1Hr / 60;
        int s = remainingsOf1Hr % 60;

        System.out.println( String.format("%02d", h) + ":" + String.format("%02d", m) + ":" + String.format("%02d", s));




    }

    public static String electronicWatch (int seconds) {


        int secondsPerDay = 86400;
        int secondsPerHour = 3600;
        int secondsPerMinute = 60;

        int remainingsOf1Day = seconds % secondsPerDay;
        int remainingsOf1Hr = remainingsOf1Day % 3600;
        int h = remainingsOf1Day / 3600;
        int m = remainingsOf1Hr / 60;
        int s = remainingsOf1Hr % 60;


        return  String.format("%02d", h) + ":" + String.format("%02d", m) + ":" + String.format("%02d", s);

             //   (m<10 && s<10)? (h + ":0" + m + ":0" + s) : (h + ":" + m + ":" + s);

    }

}