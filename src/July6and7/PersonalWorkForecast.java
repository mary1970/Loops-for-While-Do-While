package July6and7;

public class PersonalWorkForecast {
    public static void main(String[] args) {
        //System.out.println("Day\t"+"Descrip\t"+"Precipi\t"+"Side\t"+"Wind\t"+"Humidity\t");
        System.out.printf(" %-5s\t%-13s\t%-5S%%\t%-5s%-1s\t%%%-13S\n","DAY","DESCRIPTION","PRECIPI","SIDE","WIND","HUMIDITY");
        String day =("Monday");
        String desc= ("Rainy");
        int preci= 98;
        String side=("SES");
        double wind=5.7;
        int hum=95;
        // System.out.println(day +    desc+    preci+   side+   wind+  hum+"\n");
        System.out.printf(" %5s\t%8s\t%8d\t%8s%2smph\t%5d\n",day,desc,preci,side,wind,hum);
        String day1 =("Tuesday");
        String desc1= ("Rainy");
        int preci1= 91;
        String side1=("SW");
        double wind1=7.7;
        int hum1=86;
        System.out.printf(" %5s\t%8s\t%8d\t%8s%2smph\t  %5d\n ",day1,desc1,preci1,side1,wind1,hum1);

        String day2 =("Wednesday");
        String desc2= ("Sunny");
        int preci2= 98;
        String side2=("NW");
        double wind2=5.7;
        int hum2=95;
        System.out.printf(" %5s\t%8s\t%8d\t%8s%2smph\t  %5d\n ",day2,desc2,preci2,side2,wind2,hum2);


        String day3 =("Thursday");
        String desc3= ("Rainy");
        int preci3= 98;
        String side3=("NW");
        double wind3=3.7;
        int hum3=75;

        System.out.printf(" %5s\t%8s\t%8d\t%8s%2smph\t  %5d\n ",day3,desc3,preci3,side3,wind3,hum3);


        String day4 =("Friday");
        String desc4= ("Thunderst");
        int preci4= 98;
        String side4=("SES");
        double wind4=5.7;
        int hum4=95;
        System.out.printf(" %5s\t%8s\t%8d\t%8s%2smph\t  %5d\n ",day4,desc4,preci4,side4,wind4,hum4);

    }
}

