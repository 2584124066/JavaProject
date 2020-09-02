package zy.day09.test3;

public interface AA {
    public abstract void showA();

    private void show10(String str) {
        for (int i = 0; i < 10; i++) {
            if (i<9){
                System.out.print(str + " ");
            }else {
                System.out.println();
            }
        }
    }

    public default void showB10(){
        show10("BBBB");
    }

    public default void showC10(){
        show10("CCCC");
    }
}
