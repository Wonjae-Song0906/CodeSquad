import java.util.Scanner;
import java.util.Random;

public class BlackJack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("간단 카드 게임을 시작합니다.\n");

        int wins = 0;
        int losses = 0;
        int ties = 0;
        int gameCount = 1;

        String playerString = "YOU    :";
        String dealerString = "DEALER :";

        while(true) {
            System.out.println("Game " + gameCount);
            int playerCard = random.nextInt(11) + 1;
            int dealerCard = random.nextInt(11) + 1;

            playerString += String.format(" [%2d]", playerCard);
            dealerString += String.format(" [%2d]", dealerCard);

            System.out.println(playerString);
            System.out.println(dealerString);


        }
    }
}