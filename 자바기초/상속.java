//예시 1
package com.example.javatest;


class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

// animal 클래스 상속
class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class Sample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}

// 예시 2

package com.example.javatest;



 class ParentCafe {
    String coffee;
    int price;

    public void printMenu() {
        System.out.println(coffee + "는 " + price + "원입니다.");
    }
}

class ChildCafe extends ParentCafe {
    ChildCafe (String coffee, int price) {
        this.coffee = coffee;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        //ChildCafe child = new ChildCafe("아메리카노", 4100);
        ParentCafe child = new ChildCafe("아메리카노" , 4000); // 상속관계에 있을때 자식 클래스의 객체는 부모 클래스의 자료형인 것처럼 사용 가능
        child.printMenu();
    }
}
