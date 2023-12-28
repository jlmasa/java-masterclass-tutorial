public class mainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highsScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("The highScore is " + highsScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("The next highScore is " +
        calculateScore(gameOver,score,levelCompleted,bonus));
    }
    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus){
//        boolean gameOver = true;
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

}
