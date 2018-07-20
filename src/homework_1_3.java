import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;


public class homework_1_3 {
    public static double readCallRate(BufferedReader br, int country){
        double result = 0;
        boolean invalid = false;
        while (!invalid) {
            System.out.print("Enter a call rate from Country " + country + ": " + "\n");
            try {
                result =  stringToDouble(br.readLine());
                invalid = true;
            }catch (Exception e) {
                System.out.println("bad input 'call rate from Country' " + country + ": ");
            }
        }

        return result;
    }
    public static int readCallDuration(BufferedReader br, int country){
        boolean invalid_firstCallDuration = true;
        int result = 0;
        while (invalid_firstCallDuration) {
            System.out.print("Enter a call duration from Country " + country + ": " + "\n");
            try {
                result = stringToInt(br.readLine());
                invalid_firstCallDuration = false;
            }catch (Exception e) {
                System.out.println("bad input 'call duration from Country' " + country + ": ");
            }
        }
        return result;
    }
    public static double CallCost(double rate, int duration){
        return rate * duration;
    }

    public static int stringToInt(String value) {
        return Integer.parseInt(value);
    }

    public static double stringToDouble(String value) {
        return Double.parseDouble(value);
    }

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        // Phone calls from three countries, units (for example, USD) per minute
        double callRateFromCountry1;
        double callRateFromCountry2;
        double callRateFromCountry3;
        int country = 1;

        // Call durations, minutes
        int firstCallDuration;
        int secondCallDuration;
        int thirdCallDuration;

        // Call costs and total talk cost, USD
        double firstCallCost;
        double secondCallCost;
        double thirdCallCost;
        double talkCost;

        //  - - - - - -  Enter call rates  - - - - - - - //

//        boolean invalid_callRateFromCountry1 = true;
//        while (invalid_callRateFromCountry1) {
//            System.out.println("Enter a call rate from Country1:");
//            try {
//                callRateFromCountry1 = stringToDouble(br.readLine());
//                invalid_callRateFromCountry1 = false;
//            }catch (Exception e) {
//                System.out.println("bad input 'call rate from Country1'");
//            }
//        }
//
//        boolean invalid_callRateFromCountry2 = true;
//        while (invalid_callRateFromCountry2) {
//            System.out.println("Enter a call rate from Country2:");
//            try {
//                callRateFromCountry2 = stringToDouble(br.readLine());
//                invalid_callRateFromCountry2 = false;
//            }catch (Exception e) {
//                System.out.println("bad input 'call rate from Country2'");
//            }
//        }
//
//        boolean invalid_callRateFromCountry3 = true;
//        while (invalid_callRateFromCountry3) {
//            System.out.println("Enter a call rate from Country3:");
//            try {
//                callRateFromCountry3 = stringToDouble(br.readLine());
//                invalid_callRateFromCountry3 = false;
//            }catch (Exception e) {
//                System.out.println("bad input 'call rate from Country3'");
//            }
//        }
        callRateFromCountry1 = readCallRate(br, country);
        country++;
        callRateFromCountry2 =readCallRate(br, country);
        country++;
        callRateFromCountry3 = readCallRate(br, country);
        country = 1;

        //  - - - - - -  Enter call durations  - - - - - - - //

//        boolean invalid_firstCallDuration = true;
//        while (invalid_firstCallDuration) {
//            System.out.println("Enter a call duration from Country1:");
//            try {
//                firstCallDuration = stringToInt(br.readLine());
//                invalid_firstCallDuration = false;
//            }catch (Exception e) {
//                System.out.println("bad input 'call duration from Country1'");
//            }
//        }
//
//        boolean invalid_secondCallDuration = true;
//        while (invalid_secondCallDuration) {
//            System.out.println("Enter a call duration from Country2:");
//            try {
//                secondCallDuration = stringToInt(br.readLine());
//                invalid_secondCallDuration = false;
//            }catch (Exception e) {
//                System.out.println("bad input 'call duration from Country2'");
//            }
//        }
//
//        boolean invalid_thirdCallDuration = true;
//        while (invalid_thirdCallDuration) {
//            System.out.println("Enter a call duration from Country3:");
//            try {
//                thirdCallDuration = stringToInt(br.readLine());
//                invalid_thirdCallDuration = false;
//            }catch (Exception e) {
//                System.out.println("bad input 'call duration from Country3'");
//            }
//        }
        firstCallDuration = readCallDuration(br, country);
        country++;
        secondCallDuration = readCallDuration(br, country);
        country++;
        thirdCallDuration = readCallDuration(br, country);


/*        System.out.println("Call rate from Country1: " + callRateFromCountry1 + " USD");
        System.out.println("Call rate from Country2: " + callRateFromCountry2 + " USD");
        System.out.println("Call rate from Country3: " + callRateFromCountry3 + " USD");
        System.out.println("Call duration from Country1: " + firstCallDuration + " minutes");
        System.out.println("Call duration from Country2: " + secondCallDuration + " minutes");
        System.out.println("Call duration from Country3: " + thirdCallDuration + " minutes");
*/
        firstCallCost = CallCost(callRateFromCountry1, firstCallDuration);
        secondCallCost = CallCost(callRateFromCountry2, secondCallDuration);
        thirdCallCost = CallCost(callRateFromCountry3, thirdCallDuration);
        talkCost = firstCallCost + secondCallCost + thirdCallCost;
        System.out.println(callRateFromCountry1);
        System.out.println("First call costs " + firstCallCost + " USD");
        System.out.println("Second call costs " + secondCallCost + " USD");
        System.out.println("Third call costs " + thirdCallCost + " USD");
        System.out.println("All talk costs " + talkCost + " USD");

        /*
        final int N = 4;
        double[] rates = new double[N];
        int[] durations = new int[N];
        for(int i=0; i<N;i++){
            rates[i] = readCallRate(br, country);
            durations[i] = readCallDuration(br, country);
        }
        for(int i=0; i<N;i++){
            System.out.println("First call costs " + CallCost(rates[i], durations[i]) + " USD");
        }
        */
    }
}
