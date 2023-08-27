package com.example.javatest;

class Test{
    void dog(){
        System.out.println("개 없음");
    }
    void dog(int a, int b){
        System.out.println("개: " +a+ "," +b);
    }
    void dog(String c){
        System.out.println("개: " +c);
    }

}

 class DogTest{
    public static void main(String[] args){

        Test t = new Test(); // 클래스 인스턴스 생성

        t.dog();

        t.dog(2,3);

        t.dog("bob");
    }
}
