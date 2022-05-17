package JH.codetest.HowToInherit;

class Parent {
    int parentVar = 10;
    void parentMethod() {
        System.out.println("parent Method");
    }
}
class Child extends Parent { // Child 클래스를 정의할 때 extends를 이용하여 Parent 클래스를 상속받게 되는 부분이다.
    int childVar = 20;
    void childMethod() {
        System.out.println("child Method");
    }
}
public class ExtendsTest {
    //상속 테스트
    public static void main(String[] args) {
        Child child = new Child(); // child 클래스 객체 생성
        System.out.println("child.parentVar = " + child.parentVar);// child 클래스가 parent 클래스에게 상속 받았기 때문에
        System.out.println("child.childVar = " + child.childVar); // parent 클래스에서 정의한 변수나 메소드를 모두 쓸 수 있다.
        child.parentMethod();
        child.childMethod();
    }
}
