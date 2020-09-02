package zy.day09.test7;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("张小强",9000.0);
        Coder c = new Coder("李小亮",5000.0);

        Company company = new Company();
        company.paySalary(m);
        company.paySalary(c);
    }
}
