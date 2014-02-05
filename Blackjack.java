import java.util.Scanner;
import java.util.Random;

public class Blackjack {

	public static void main (String[] args) {

        Scanner stdin = new Scanner(System.in);
        System.out.println("Would you like to play Blackjack?");
        String responsePlay = stdin.next();

        Random randomGen = new Random();
        while (responsePlay.toUpperCase().equals("YES")){
            System.out.println("Let's play!");
            int userScore = 0;
            int dealerScore = 0;
            Card firstCard = getNextCard();
            System.out.println(firstCard.toString());
            userScore = firstCard.getValue();
            Card secondCard = getNextCard();
            userScore = userScore + secondCard.getValue(); 
            System.out.println(secondCard.toString());
            System.out.println("Your total score is " + userScore);

            System.out.println("Would you like to hit?");
            String response = stdin.next();
            while (response.toUpperCase().equals("YES") && userScore < 22){
                Card nCard = getNextCard();
                System.out.println(nCard.toString());
                userScore = userScore + nCard.getValue();
                System.out.println("Your total score is " + userScore);
                if (userScore>21) {
                    System.out.println("You lose"); } 
                else {
                    System.out.println("Would you like to hit?");
                    response = stdin.next();
                }
            }
            if (userScore < 21){
                System.out.println("It's the dealer's turn");
                while (dealerScore < 17 && dealerScore < userScore) {
                    Card nCard = getNextCard();
                    System.out.println(nCard.toString());
                    dealerScore = dealerScore + nCard.getValue();
                    System.out.println("The dealer's score is " + dealerScore);
                 }

                if (dealerScore > userScore && dealerScore < 22) {
                    System.out.println("The dealer wins");
                }
                else {
                    System.out.println("You win!");
                 }
            }
            System.out.println("Would you like to continue playing?");
            responsePlay = stdin.next();
            
        }

	}
    
    private static Card getNextCard() {
        Random randomGen = new Random();
        int nextCard = randomGen.nextInt(13) + 1;
        CardValue nextCV;
        switch (nextCard) {
            case 1: nextCV = CardValue.TWO;
                    break;  
            case 2: nextCV = CardValue.THREE;
                    break;
            case 3: nextCV = CardValue.FOUR;
                    break;
            case 4: nextCV = CardValue.FIVE;
                    break;
            case 5: nextCV = CardValue.SIX;
                    break;
            case 6: nextCV =CardValue.SEVEN;
                    break;
            case 7: nextCV = CardValue.EIGHT;
                    break;
            case 8: nextCV = CardValue.NINE;
                    break;
            case 9: nextCV = CardValue.TEN;
                    break;
            case 10:nextCV = CardValue.JACK;
                    break;
            case 11:nextCV = CardValue.QUEEN;
                    break;
            case 12:nextCV = CardValue.KING;
                    break;
            default:nextCV = CardValue.ACE;
                    break;
        }
        int nextSuit = randomGen.nextInt(4) + 1;
        Suit nextS;
        switch (nextSuit) {
            case 1: nextS = Suit.SPADES;
                    break;
            case 2: nextS = Suit.DIAMONDS;
                    break;
            case 3: nextS = Suit.HEARTS;
                    break;
            default:nextS = Suit.CLUBS;
                    break;
        }
        Card nCard = new Card(nextS, nextCV);
        return nCard;
    }
}

