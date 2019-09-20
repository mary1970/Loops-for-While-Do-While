package July17;

public class WriteYourName {
    public static void writeMyName() {
        System.out.println(" Sabire Kaya");
    }

    public static void writeMyName(String name) {
        name = "Sabire Kaya";
        System.out.println(name);
    }

    public static String writeMyLastName(String name) {
       // String word = "Kaya";

        return name;
    }
    public static String mylastName(){
             String lastname= "kaya";
             return lastname;
    }



    public static void main(String[] args) {
        WriteYourName.writeMyName();
        WriteYourName.writeMyName("name");
        System.out.println(WriteYourName.writeMyLastName("Kaya"));
        System.out.println(WriteYourName.mylastName());
    }


}



