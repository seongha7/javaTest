package com.example.javatest;


class Animal {
    String name; // Animal 클래스에 name이라는 String 변수를 추가

 /*   void Animal(String name) {    // 생성자 활용
        this.name = name;
    }
} */
    void setName(String name) {     // setter 메서드 활용
        this.name = name;   // == cat.name = "bob"
    }
}

class Sample {
    public static void main(String[] args) {
        Animal cat = new Animal(); // 객체 생성 (new는 객체를 생성할 때 사용하는 키워드)
        //cat.name = "bob";
        cat.setName("bob"); // 메서드 호출

        Animal dog = new Animal();
        dog.setName("tom");
        System.out.println(cat.name);
        System.out.println(dog.name); // 객체 변수의 값이 독립적으로 유지된다.
    }
}
