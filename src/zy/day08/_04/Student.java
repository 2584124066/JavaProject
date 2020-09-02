package zy.day08._04;

public class Student extends Person {
    private int score;

    public Student() {

    }
    public Student(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void test(){
        System.out.println(getName()+"同学，考试得了："+score+"分");
    }
}
