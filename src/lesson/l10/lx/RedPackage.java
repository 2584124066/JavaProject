package lesson.l10.lx;

public class RedPackage {
    //群主名称
    private String name="群主大大";
    //发红包模式
    private OpenMode openMode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpenMode getOpenMode() {
        return openMode;
    }

    public void setOpenMode(OpenMode openMode) {
        this.openMode = openMode;
    }
}
