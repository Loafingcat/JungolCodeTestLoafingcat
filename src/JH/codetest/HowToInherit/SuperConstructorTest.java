package JH.codetest.HowToInherit;

class Sawon2 {
    String name;
    String dept;
    int salary;

    public Sawon2(String name, String dept, int salary) { //부모 클래스의 인자 있는 부분을 정의한 것
        super();
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    String displayInfo() {
        return "이름: " + name + ",부서: " + dept + ",연봉: " + salary;
    }
}
class Sales2 extends Sawon2 {
    int commition;

    public Sales2(String name, String dept, int salary, int commition) {
        //super(). 아래 부분이 정의되지 않고 이 부분이 자동으로 호출되면 컴파일 에러가 뜸. 부모 클래스에 빈 생성자가 없기 때문.
        super(name, dept, salary);// 자식 클래스의 생정자에서 부모 클래스의 인자 있는 생성자를 명시적으로 호출하는 부분.
        this.commition = commition;
    }
    String displayInfo() {
        return super.displayInfo() + ",수당: " + commition;
    }
}
public class SuperConstructorTest {
    //super() 테스트
    public static void main(String[] args) {
        Sales2 sales2 = new Sales2("오정원", "영업부", 100000000, 70000000);
        System.out.println(sales2.displayInfo());
    }
}
