package JH.codetest.HowToInherit;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class OverridingParent2 {
    int money = 20; // 부모 클래스에서는 머니를 int로
    void parentMethod() {
        System.out.println("parent method");
    }
}
class OverridingChild2 extends OverridingParent2 {
    String money = "20원"; // 자식 클래스에서는 머니를 String으로
    void parentMethod() {
        System.out.println("overriding method");
    }
}
public class OverridingTest2 {
    //변수 재정의 테스트
    public static void main(String[] args) {
        OverridingChild2 oc2 = new OverridingChild2();
        oc2.money = "30원"; //자식 클래스에서 머니를 String으로 정의했기 때문에 머니 변수에 String 타입을 할당
        //oc2.money = 30; 이 주석을 풀면 컴파일 에러가 생긴다. int 타입이므로
        System.out.println("oc2.money = " + oc2.money); // 출력하면 String타입의 30원이 나올것이다.
    }
}
