import java.util.Scanner;

class Player {
    String playerName, gender;
    int age;

    Player(String playerName, int age, String gender) {
        this.playerName = playerName;
        this.age = age;
        this.gender = gender;
    }

    void displayPlayer() {
        System.out.println("\nPlayer Name : " + playerName);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
    }
}

class Coaching extends Player {
    String coachName, sportName;

    Coaching(String playerName, int age, String gender,
              String coachName, String sportName) {
        super(playerName, age, gender);
        this.coachName = coachName;
        this.sportName = sportName;
    }

    void displayCoach() {
        System.out.println("Coach Name : " + coachName);
        System.out.println("Sport Name : " + sportName);
    }
}

class Tournament extends Coaching {
    float registrationFee, discountPercent, finalFee;

    Tournament(String playerName, int age, String gender,
               String coachName, String sportName) {
        super(playerName, age, gender, coachName, sportName);
    }

    void registerPlayer(float registrationFee) {
        this.registrationFee = registrationFee;
    }

    void calculateDiscount(float discountPercent) {
        this.discountPercent = discountPercent;
    }

    void calculateFinalFee() {
        finalFee = registrationFee -
                (registrationFee * discountPercent / 100);
    }

    void displayRegistration() {
        System.out.println("\n----- Registration Details -----");
        displayPlayer();
        displayCoach();
        System.out.println("Registration Fee : " + registrationFee);
        System.out.println("Discount : " + discountPercent + "%");
        System.out.println("Final Fee : " + finalFee);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Coach Name: ");
        String coach = sc.nextLine();

        System.out.print("Enter Sport Name: ");
        String sport = sc.nextLine();

        Tournament t = new Tournament(name, age, gender, coach, sport);

        System.out.print("Enter Registration Fee: ");
        float fee = sc.nextFloat();

        System.out.print("Enter Discount (%): ");
        float discount = sc.nextFloat();

        t.registerPlayer(fee);
        t.calculateDiscount(discount);
        t.calculateFinalFee();

        t.displayRegistration();

        sc.close();
    }
}