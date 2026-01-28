package day07.practice10;

public class Score {
    private  int score;

    public void setScore(int score){
        if(score >= 0 && score <= 100 ){
            this.score = score;
        } else{
            System.out.println("유효하지 않은 점수입니다.");
        }
    }
    public int getScore(){
        return score;
    }
}
