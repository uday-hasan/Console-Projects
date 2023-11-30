import java.util.Scanner;

class GussingGame {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        byte userNumber = 0;
        byte rand = (byte) (Math.random() * 10);
        byte i = 3;
        System.out.print("Enter number between 0 to 10: ");
        do {
            userNumber = sc.nextByte();
            sc.nextLine();
            i--;
            if (userNumber == rand) {
                System.out.println("You won.");
                break;
            } else {
                if (i == 0) {
                    System.out.print("Attempts end. You lose. Best luck next time.");
                    return;
                }

                System.out.print("Wrong. " + i + " attemp left. Choose again: ");

            }
        } while (i > 0);

    }
}