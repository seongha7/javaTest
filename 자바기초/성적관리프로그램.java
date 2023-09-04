package com.example.javatest;

/*  -한 메서드에 3단계 들여쓰기만 하기
    - else 키워드 쓰지 않기
    - 이름 줄여쓰기 않기
    - getter(사용 가능) setter(아에 사용 x) 를 쓰지 않는다.
자바로 성적관리프로그램 구현하기 -> 각각 과목 점수를 얻어와 평균을 구하고 그 평균점수에 따라 등급 분류
class 학교 학생 과목 점수 학급 -> 너무 간단하게 만들지 말기
점수에 따른 등급분류 필요
 메인클래스에서 학생을 출력할때 등급 소속 반, 이름 등을 출력하기
 등급은 점수 단위 따라 1-7등급으로 나누기, 세 과목 의 평균으로 등급 구하기
  */

class School {
    // school 클래스에는 대략적인 모든 정보들을 저장
}

// 학교 안 학급 클래스 구성
class Ban {
    // 등급따라 반 분류..
    private String Standford;
    private String Seoul;
    private String Harvard;
}


class Student {
    // 학생 객체 생성
    private String studentName;


}



class Score {
    private int subjectScore;

    public void Score(int subjectScore) {
        this.subjectScore = subjectScore;
    }


}

//과목
class Subject {
    private int korean; // 국어, 영어 , 수학 추가 예정
    private int english;
    private int math;

    public Subject(int korean, int english, int math) {
        this.english = english;
        this.korean = korean;
        this.math = math;
    }

}

public class Sample {
    public static void main(String[] args) {

    }
}
