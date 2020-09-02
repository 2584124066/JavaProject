package lesson.l12.Fan;

public class MyGenericClass<MVP> {
    private MVP mvp;

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }

    public <MVP> void show(MVP mvp) {
        System.out.println(mvp.getClass());
    }

    public <MVP> MVP show2(MVP mvp) {
        return mvp;
    }
}
