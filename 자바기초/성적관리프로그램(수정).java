// 클래스 별로 나눠서 scanner로 주입 받는 코드


// 반 관리 클래스 (ClassClassifier)

package com.example.javatest;

public class ClassClassifier {
    public static String Ban(String grade) {
        if (grade.equals("A")) {
            return "아이비리그";
        }
        if (grade.equals("B")) {
            return "스카이";
        }
        if (grade.equals("C")) {
            return "인서울";
        }
        if (grade.equals("D") || grade.equals("F")) {
            return "파이팅";
        }
        return "유효하지 않습니다.";
    }
}

// 등급 계산 클래스 (GradeCalculator) -> 모든 점수의 합과 평균 구하는 메서드를 포함한다.

package com.example.javatest;


public class GradeCalculator {
    public static double SumOfGrade(int math, int english, int korean) {
        return math + korean + english;
    }

    public static double Average(int math, int english, int korean) {
        return (double) (math + korean + english) / 3;
    }
}


// 등급 관리 클래스 (GradeClassifier) -> 평균에 따른 등급을 구해준다.

package com.example.javatest;

public class GradeClassifier {
    public static String Grade(double average) {
        if ((average >= 90) && (average <= 100)) {
            return "A";
        }
        if ((average >= 80) && (average < 90)) {
            return "B";
        }
        if ((average >= 70) && (average < 80)) {
            return "C";
        }
        if (average >= 60 && average < 70) {
            return "D";
        }
        if (average < 60) {
            return "F";
        }
        return "유효하지 않습니다.";
    }
}

// 메인 클래스

package com.example.javatest;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int studentNum = 0; // 스캐너로 입력받을 학생 수

        Scanner sc = new Scanner(System.in); // 학생 수 스캐너
        Scanner scanner = new Scanner(System.in); // 학생정보 스캐너

        System.out.print("학생 수를 입력하세요 -> ");
        studentNum = sc.nextInt();

        Student[] student = new Student[studentNum];
        System.out.println("학생이름, 수학점수, 영어점수, 국어점수 순으로 괄호 안 형식을 맞춰 입력하세요(성하 100 100 100)");


        for (int i = 0; i < student.length; i++) {
            String name = scanner.next();
            int math = scanner.nextInt();
            int english = scanner.nextInt();
            int korean = scanner.nextInt();


            student[i] = new Student(name,math,english,korean);
        }
        System.out.println("----출력예시입니다-----");
        System.out.println("학생이름 + 수학점수 + 영어점수 + 국어점수 + 총점 + 평균");
        System.out.println("------------------");

        for (Student value : student) {
            System.out.print("학생이름: " + value.name
                    + ", 수학성적: " + value.math + ", 영어성적: " + value.english + ", 국어성적: " + value.korean);
            System.out.print(", 총점: " + value.SumOfGrade());
            System.out.println(", 평균: " + value.Average());
            System.out.println(" 등급: " + value.Grade());
            System.out.println(" 소속학급: " + value.Ban());
        }
        scanner.close();
        sc.close();
    }
}


// student 클래스 -> 학생 이름 , 과목둘

package com.example.javatest;

public class Student {
    String name;

    // 과목은 int로 지정 (점수를 다이렉트로 받기 위해)
    int math;
    int english;
    int korean;

    public Student(String name, int math, int english, int korean) {
        this.name = name;
        this.math = math;
        this.english = english;
        this.korean = korean;
    }

    public double SumOfGrade() {
        return GradeCalculator.SumOfGrade(math, english, korean);
    }

    public double Average() {
        return GradeCalculator.Average(math, english, korean);
    }

    public String Ban() {
        return ClassClassifier.Ban(Grade());
    }

    public String Grade() {
        return GradeClassifier.Grade(Average());
    }
}
