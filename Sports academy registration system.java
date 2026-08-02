import java.util.Scanner;

interface Player {
    void displayPlayer();
}

interface Coach {
    void displayCoach();
}

public class Main implements Player, Coach {

    String playerName, gender;
    int age;
    String coachName, sportName;

    float registrationFee, discount, finalFee;

    Main(String playerName, int age, String gender,
         String coachName, String sportName) {

        this.playerName = playerName;
        this.age = age;
        this.gender = gender;
        this.coachName = coachName;
        this.sportName = sportName;
    }

    public void displayPlayer() {
        System.out.println("\n----- Player Details -----");
        System.out.println("Player Name : " + playerName);
        System.out.println("Age         : " + age);
        System.out.println("Gender      : " + gender);
    }

    public void displayCoach() {
        System.out.println("\n----- Coach Details -----");
        System.out.println("Coach Name  : " + coachName);
        System.out.println("Sport Name  : " + sportName);
    }

    void registerPlayer(float fee) {
        registrationFee = fee;
    }

    void calculateDiscount(float percent) {
        discount = registrationFee * percent / 100;
    }

    void calculateFinalFee() {
        finalFee = registrationFee - discount;
    }

    void displayRegistration() {
        displayPlayer();
        displayCoach();

        System.out.println("\n----- Registration Details -----");
        System.out.println("Registration Fee : " + registrationFee);
        System.out.println("Discount         : " + discount);
        System.out.println("Final Fee        : " + finalFee);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player Name: ");
        String playerName = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Coach Name: ");
        String coachName = sc.nextLine();

        System.out.print("Enter Sport Name: ");
        String sportName = sc.nextLine();

        System.out.print("Enter Registration Fee: ");
        float fee = sc.nextFloat();

        System.out.print("Enter Discount Percentage: ");
        float percent = sc.nextFloat();

        Main t = new Main(playerName, age, gender,
                          coachName, sportName);

        t.registerPlayer(fee);
        t.calculateDiscount(percent);
        t.calculateFinalFee();

        t.displayRegistration();

        sc.close();
    }
}
