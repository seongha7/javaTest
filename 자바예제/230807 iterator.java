package com.example.javatest;
import java.util.ArrayList;
import java.util.Iterator;

public class Example{
    public static void main(String[] args) {
        ArrayList original = new ArrayList(10);
        ArrayList copy1 = new ArrayList(10);
        ArrayList copy2 = new ArrayList(10);

        for (int i = 0; i < 10; i++) {
            original.add(i + "");
        }

        Iterator it = original.iterator();

        while(it.hasNext()) {
            copy1.add(it.next()); // original 복사
        }

        System.out.println("-> original에서 copy1로 복사");
        System.out.println("original: " + original );
        System.out.println("copy1: " + copy1);
        System.out.println();

        it = original.iterator();

        while (it.hasNext()) {
            copy2.add(it.next());
            it.remove(); // remove는 반드시 next() 다음에 써 줘야한다.
        }

        System.out.println("-> original에서 copy2로 이동");
        System.out.println("original: " + original);
        System.out.println("copy2: " + copy2);
    }
}
