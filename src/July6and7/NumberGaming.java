package July6and7;

public class NumberGaming {
    public static void main(String[] args) {
       /* int counter=100;
        do{
            double response= counter-0.5;
            System.out.println("Number:"+response);

counter--;
        }
        while (counter>88);
        System.out.println();

        */
        int year = 2019;
       /* String A = "January";
        String B = "February";
        String C = "March";
        String D = "April";
        String E = "May";
        String F = "June";
        String G = "July";
        String K = "August";
        String L = "September";
        String M = "October";
        String N = " November";
        String Z = "December";


        System.out.printf("%10s, %10s, %10s,%10s,%10s,%10s, %10s,%10s, %10s,%10s, %10s, %10s  \t", A, B, C, D, E, F, G, K, L, M, N, Z);


        */
        for (int month = 1; month <= 12; month++) {
            System.out.println("\t");
            for (int day = 1; day <= 30; day++) {
                if (month == day) {
                    System.out.println(month + "/" + day + "/" + year);
                }


                System.out.println(month + "/" + day + "/" + year);


            }

        }
    }
}


