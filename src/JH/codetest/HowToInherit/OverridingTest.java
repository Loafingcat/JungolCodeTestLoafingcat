package JH.codetest.HowToInherit;

class OverridingParent {
    void parentMethod() {
        System.out.println("parent method");
    }
}
class OverridingChild extends OverridingParent { // 자식 클래스를 정의할 때 부모 클래스를 상속받아 정의
    void parentMethod() {
        System.out.println("overriding method"); // 부모 클래스에서 상속받은 메소드를 재정의
    }
}
public class OverridingTest {
    //Overriding 테스트
    public static void main(String[] args) {
        OverridingChild oc = new OverridingChild(); // 자식 클래스 객체 생성
        oc.parentMethod(); // 재정의된 메소드를 호출하면 부모 클래스가 아닌 최종적으로 재정의된 메소드가 호출된다.
    }
}
