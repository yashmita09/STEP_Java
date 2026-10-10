public class QuizScorecard {
    static class Scorecard {
        private final boolean[] answers;
        private int count;
        public Scorecard(int totalQuestions) {
            this.answers = new boolean[Math.max(1, totalQuestions)];
        }
        public void recordAnswer(boolean correct) {
            if (count < answers.length) answers[count++] = correct;
        }
        public int getScore() {
            int score = 0;
            for (int i = 0; i < count; i++) if (answers[i]) score++;
            return score;
        }
    }
    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true); sc.recordAnswer(true); sc.recordAnswer(false); sc.recordAnswer(true);
        System.out.println("Score: " + sc.getScore());
    }
}
