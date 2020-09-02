package lesson.l21.test4;

@Student("")
@Book(value = "西游记", authors = {"吴承恩", "白求恩"})
public class Test {
    @Book(value = "西游记", authors = {"吴承恩", "白求恩"}, price = 50)
    public void showBook() {
    }

    @Book(value = "西游记", price = 50, authors = {"吴承恩", "白求恩"})
    private String name;

}
