package zy.day05._03;

public class Card {
    private String color;
    private String size;

    public Card(){

    }

    public Card(String color,String size){
        this.color = color;
        this.size = size;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void showCard(){
        System.out.println(color+size);
    }
}
