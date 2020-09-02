package zy.day09.test6;

public class Test {
    public static void goToSport(Sport sport){
        sport.playBasketball();
    }
    public static void main(String[] args) {
        Teacher t1 = new Teacher("马云",45);
        SportTeacher t2 = new SportTeacher("大姚",45);
        Student s1 = new Student("大姚",35);
        SportStudent s2 = new SportStudent("王中王",21);

//        goToSport(t1);
        goToSport(t2);
//        goToSport(s1);
        goToSport(s2);
    }
}
