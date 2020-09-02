package lesson.l12.FanInterface;

public class MyImp2<E> implements MyGenericInterface<E> {

    @Override
    public void add(E e) {
        System.out.println(e);
    }

    @Override
    public E getE() {
        return null;
    }
}
