class ScoreBox {
private int score;
public ScoreBox(int score){
    this.score=score;
}
public int getScore(){
    return score;
}
public void setScore(int score){
    if(score>=0){
        this.score=score;
    }

}
public String toString(){
    return "ScoreBox{Score="+ score+"}";

}

}
public class ObjectRerferenceLab {
    static void addBonus(ScoreBox box, int bonus){
        if(bonus>=0){
            box.setScore(box.getScore()+bonus);
        }

        }
        static void replaceLocally(ScoreBox box){
            box=new ScoreBox(100);
            System.out.println("inside methos:"+box);

        }
        static ScoreBox createScoreBox(int score){
            return new ScoreBox(score);
        }
    }

