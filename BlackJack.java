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

            if(playerCard > dealerCard) {
                System.out.println("당신이 이겼습니다.");
                wins++;
            }
            else if(playerCard < dealerCard) {
                System.out.println("딜러가 이겼습니다.");
                losses++;
            }
            else {
                System.out.println("비겼습니다.");
                ties++;
            }

            System.out.println("현재 전적: " + wins + "승" + ties + "무" + losses + "패");

            while(true) {
                System.out.print("한 게임 더 하시겠습니까? (Y/N) ");
                String input = scanner.next();
                if(input.equalsIgnoreCase("Y")) {
                    gameCount++;
                    System.out.println();
                    break;
                }
                else if(input.equalsIgnoreCase("N")) {
                    System.out.println("게임을 종료합니다.");
                    System.out.println("플레이해주셔서 감사합니다.");
                    scanner.close();
                    return;
                }
                else {
                    System.out.println("잘못 입력하셨습니다.");
                }
            }

        }
    }
}