package zy.day05._07;

public class Test7 {
    public static void main(String[] args) {
        Book book1 = new Book("No001", "JavaScript", "3861564567", "2017-02-01", 50.1);
        Book book2 = new Book("No002", "PHP", "386156456117", "2017-03-01", 50.5);
        Book book3 = new Book("No003", "JAVA", "3861564567", "2017-01-01", 58.8);

        if (book1.getMoney() > book2.getMoney() && book1.getMoney() > book3.getMoney()) {
            book1.showBook();
        } else if (book2.getMoney() > book3.getMoney()) {
            book2.showBook();
        } else {
            book3.showBook();
        }
    }
}
