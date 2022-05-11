package JH.codetest.HowToInherit;

class OverridingParent {
    void parentMethod() {
        System.out.println("parent method");
    }
}
class OverridingChild extends OverridingParent {
    void parentMethod() {
        System.out.println("overriding method");
    }
}
public class OverridingTest {
    //Overriding 테스트
    public static void main(String[] args) {
        OverridingChild oc = new OverridingChild();
        oc.parentMethod();
    }
}
