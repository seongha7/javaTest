package com.example.javatest;
import java.util.*;
import java.util.stream.*;


class StreamEx {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("jack", 3, 300),
                new Student("poll", 1, 200),
                new Student("bean", 2, 150),
                new Student("jean", 2, 140),
                new Student("can", 1, 100),
                new Student("bottle", 3, 290),
                new Student("tree", 1, 180)
        );
        studentStream.sorted(Comparator.comparing(Student::getBan) 
                .thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;
    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    String getName() {return name;}
    int getBan() {return ban;}
    int getTotalScore() {return totalScore;}

    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }

}

