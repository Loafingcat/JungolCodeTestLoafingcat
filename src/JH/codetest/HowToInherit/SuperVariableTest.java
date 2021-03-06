package JH.codetest.HowToInherit;

class Sawon3 {
    String name = "홍길동";
}
class Sales3 extends Sawon3 {
    String name;
    public Sales3(){}
    public Sales3(String name){
        this.name = name;
    }
    String displayInfoLocal() {
        String name = "최민수";
        return name;
    }
    String displayInfoThis() {
        String name = "최민수";
        return this.name;
    }
    String displayInfoSuper() {
        String name = "최민수";
        return super.name;
    }
}
public class SuperVariableTest {
    //super를 이용한 변수 호출
    public static void main(String[] args) {
        Sales3 sales3 = new Sales3("정재훈");
        System.out.println("local.name = " + sales3.displayInfoLocal());
        System.out.println("this.name = " + sales3.displayInfoThis());
        System.out.println("super.name = " + sales3.displayInfoSuper());
    }
}
