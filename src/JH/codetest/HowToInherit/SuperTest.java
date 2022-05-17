package JH.codetest.HowToInherit;

class Sawon {
    String name;
    String dept;
    int salary;

    String displayInfo() {
        return "이름: " + name + ",부서: " + dept + ",연봉: " + salary;
    }
}
class Sales extends Sawon {
    int commition;
    String displayInfo() {
        return super.displayInfo() + ",수당: " + commition;
        /*Super 레퍼런스 변수를 이용하여 상위 클래스의 메소드를 호출하고 상위 클래스에 정의되어 있는 메소드의 기능을 이용하고있다.
         super를 메소드 앞에 지정하지 않으면 기본적으로 this가 적용이 된다! this.displayInfo()가 되어 자신의 메소드를 호출하게 된다.
         따라서 상위 클래스의 변수나 메소드를 호출하려면 반드시 super를 앞에 붙여줘야 한다.
         */
    }
}
public class SuperTest {
    public static void main(String[] args) {
        Sales sales = new Sales();
        System.out.println(sales.displayInfo());
    }
}
