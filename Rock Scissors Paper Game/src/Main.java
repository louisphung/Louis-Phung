import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean keepPlaying = true;
        Scanner scan = new Scanner(System.in);

        while (keepPlaying) {
            int random;
            System.out.println();
            System.out.println("Rock Paper or Scissors (Press X to exit)");
            String useChoice = scan.next();
            if (useChoice.equals("Rock")) {
                random = (int) (Math.random() * 3 + 1);
                if (random == 1) {
                    System.out.println("Computer Choice: Scissors");
                    System.out.println("=> Player Win");
                } else if (random == 2) {
                    System.out.println("Computer Choice: Paper");
                    System.out.println("=> Computer Win");
                } else {
                    System.out.println("Computer Choice: Rock");
                    System.out.println("=> Tie");
                }
            } else if (useChoice.equals("Scissors")) {
                random = (int) (Math.random() * 3 + 1);
                if (random == 1) {
                    System.out.println("Computer Choice: Paper");
                    System.out.println("=> Player Win");
                } else if (random == 2) {
                    System.out.println("Computer Choice: Rock");
                    System.out.println("=> Computer Win");
                } else {
                    System.out.println("Computer Choice: Scissors");
                    System.out.println("=> Tie");
                }
            }

            else if (useChoice.equals("Paper")) {
                        random = (int) (Math.random() * 3 + 1);
                        if (random == 1) {
                            System.out.println("Computer Choice: Rock");
                            System.out.println("=> Player Win");
                        } else if (random == 2) {
                            System.out.println("Computer Choice: Scissors");
                            System.out.println("=> Computer Win");
                        } else {
                            System.out.println("Computer Choice: Paper");
                            System.out.println("=> Tie");
                        }

                    } else if (useChoice.equals("x")) {
                        keepPlaying = false;
                    } else {
                        System.out.println("Not a proper command");
                    }
                }
            }
        }

