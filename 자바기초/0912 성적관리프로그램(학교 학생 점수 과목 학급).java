
// 학생 클래스

public class Student {
    String name;
    
    public Student(String name) {this.name = name;}

}

// 과목 클래스

public class Subject {
    int math;
    int english;
    int korean;

    public Subject( int math, int english, int korean) {
        this.math = math;
        this.english = english;
        this.korean = korean;
    }
}


// 학교 클래스

public class School {

    Student student;
    Subject subject;

    int math;
    int english;
    int korean;
    String name;
    public School(String name, int math, int english, int korean) {
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


// 점수 클래스 ( 합계 평균)

public class GradeCalculator {
    public static double SumOfGrade(int math, int english, int korean) {
        return math + korean + english;
    }

    public static double Average(int math, int english, int korean) {
        return (double) (math + korean + english) / 3;
    }
}


// 학급 클래스 (등급에 따른 학급 관리)

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
        return "unknown";
    }
}


// 등급 클래스 ( 점수에 따른 등급 산출)

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
        return "Unknown";
    }
}

// 메인 클래스 

import java.util.Scanner;


// 메인
public class Main {
    public static void main(String[] args) {
        int studentNum = 0; // 스캐너로 입력받을 학생 수

        Scanner sc = new Scanner(System.in); // 학생 수 스캐너
        Scanner scanner = new Scanner(System.in); // 학생정보 스캐너

        System.out.print("학생 수를 입력하세요 -> ");
        studentNum = sc.nextInt();

        School[] school = new School[studentNum];
        System.out.println("학생이름, 수학점수, 영어점수, 국어점수 순으로 괄호 안 형식을 맞춰 입력하세요(성하 100 100 100)");


        for (int i = 0; i < school.length; i++) {
            String name = scanner.next();
            int math = scanner.nextInt();
            int english = scanner.nextInt();
            int korean = scanner.nextInt();

            school[i] = new School(name,math,english,korean);
        }

        System.out.println("----출력예시입니다-----");
        System.out.println("학생이름 + 수학점수 + 영어점수 + 국어점수 + 총점 + 평균");
        System.out.println("------------------");

        for (School value : school) {
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
