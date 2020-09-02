package zy.day05._07;

public class Book {
    private String number,name,ISBN,date;
    private double money;

    public Book(){

    }
    public Book(String number,String name,String ISBN,String date,double money){
        this.number = number;
        this.name = name;
        this.ISBN = ISBN;
        this.date = date;
        this.money = money;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void showBook(){
        System.out.println("最贵的书是："+number+","+name+"isbn"+ISBN+","+money+","+date);
    }
}
