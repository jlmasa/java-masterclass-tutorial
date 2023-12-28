public class main {
    public static void main(String[] args) {

    int HighScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("john", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("tim", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("bob", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("percy", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("james", HighScorePosition);
    }
    public static void displayHighScorePosition (String playerName, int HighScorePosition){
        System.out.println(playerName + " Manage to get into position " +
                HighScorePosition + " on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore){
    if(playerScore >= 1000){
         return 1;
    } else if (playerScore >= 500 && playerScore <1000) {
        return 2;
    } else if (playerScore >= 100 && playerScore <500) {
        return 3;
    }else
        return 4;
    }
}
