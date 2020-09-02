package zy.day14.two.Checkpoint1.test7;

public class Student {
    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        if (score<0){
            throw new NoScoreException("分数不能为负数:"+score);
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score<0){
            throw new NoScoreException("分数不能为负数:"+score);
        }
        this.score = score;
    }
}
