package com.example.javatest;
import java.util.*;


 class Example {
     public static void main(String[] args) {
         HashMap map = new HashMap();
         map.put("myId", "1234");
         map.put("asdf", "1111");
         map.put("asdf", "1234");

         Scanner s = new Scanner(System.in);

         while (true) {
             System.out.println("id와 pw를 입력하세요.");
             System.out.println("id: ");
             String id = s.nextLine().trim();

             System.out.println("password: ");
             String password = s.nextLine().trim();
             System.out.println();

             if (!map.containsKey(id)) {
                 System.out.println("입력한 id는 존재하지 않습니다");
                 continue;
             } else {
                 if (!(map.get(id)).equals(password)) {
                     System.out.println("비밀번호가 일치 하지 않습니다");
                 } else {
                     System.out.println("id와 비밀번호가 일치합니다.");
                 }
             }
         }
     }
 }
