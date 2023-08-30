//예시 1
package com.example.javatest;


class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}


class Dog extends Animal {        // animal 클래스 상속
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

// 예제 3
package com.example.javatest;



class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + " 자는중");
    }
}

class HouseDog extends Dog {     // 메서드 오버라이딩
    void sleep() {
        System.out.println(this.name + " 자는중 in house");
    }

    void sleep(int hour) {      // 입력 항목으로 hour라는 int 자료형 추가 , 메서드 오버로딩
        System.out.println(this.name + " 자는중 in house 에서 " + hour + " 시간동안");
    }
}

public class Sample {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("puppy");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}
