package lesson.l12.FanInterface;

public class MyImp1 implements MyGenericInterface<String> {

    @Override
    public void add(String o) {
        System.out.println(o);
    }

    @Override
    public String getE() {
        return null;
    }
}
