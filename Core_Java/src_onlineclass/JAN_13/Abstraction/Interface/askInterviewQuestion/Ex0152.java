package Core_Java.src_onlineclass.JAN_13.Abstraction.Interface.askInterviewQuestion;

public class Ex0152 {
    public static void main(String[] args) {


    }
}

interface I1{}
interface I2{}

class A{}
class B{}
abstract class C{}
abstract class D{}

class Test1 extends A{ }
//class Test2 extends A,B{ }
class Test3 implements I1{ }
class Test4 implements I1,I2{ }
class Test5 extends A implements I1,I2{ }
//class Test6 implements I1 extends A{ }

//interface I3 extends A{}
//interface I4 implements A{}
//interface I5 extends A,B{}
interface I6 extends I1,I2{ }

