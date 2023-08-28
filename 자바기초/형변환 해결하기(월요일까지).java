class Casting {
    long x = Long.MAX_VALUE;
    long y = 1234567L;
    int z;
    
    // z 변수에 x, y 변수에 선언되어있는 데이터를 안전하게 할당할수 있도록
}


//double로 
package com.example.javatest;

class Casting {
     static long x = Long.MAX_VALUE;
     static long y = 1234567L;
     static int z;

   static double x1 = x;
   static double y1 = y;
   static double z1 = z;

    public static void main(String[] args) {
        z1 = (x1 + y1);
        System.out.println(z1);
        
    }
    
    // z 변수에 x, y 변수에 선언되어있는 데이터를 안전하게 할당할수 있도록
}



//조건문, 형변환 이용하여 다시 만들기
//x나 y 값이  z로 온전히 들어가게


// static 없이 
package com.example.javatest;

class Casting {
      long x = Long.MAX_VALUE;
      long y = 1234567L;
      int z;

    double x1 = x;
    double y1 = y;
    double z1 = z;

    public static void main(String[] args) {
        Casting c = new Casting();
        c.z1 = (c.x1 + c.y1);
        System.out.println(c.z1);

    }

    // z 변수에 x, y 변수에 선언되어있는 데이터를 안전하게 할당할수 있도록
}

//형변환

package com.example.javatest;

class Casting {
    public static void main(String[] args) {


        long x = Long.MAX_VALUE;
        //int i = (int) x;
        double d = (double) x;
        System.out.println(d);



        long y = 1234567L;
        //int i2 = (int) y;
        double d2 = (double) y;
        System.out.println(d2);

        // int z;

        // z 변수에 x, y 변수에 선언되어있는 데이터를 안전하게 할당할수 있도록
    }
}




//모든 조건 충족 아직 못함

package com.example.javatest;

class Casting {

      static long x = Long.MAX_VALUE;
        //int i = (int) x;

       static long y = 1234567L;
      //   int i2 = (int) y;

      static   int z;

        // z 변수에 x, y 변수에 선언되어있는 데이터를 안전하게 할당할수 있도록
        //조건문, 형변환 이용하여 다시 만들기
        //x나 y 값이  z로 온전히 들어가게
    }

    class CastingTest {
        public static void main(String[] args) {
            Casting c = new Casting();

            if (c.x > Integer.MAX_VALUE) {
                System.out.println("값 초과");
            } else {
                int i = (int) c.x;
                System.out.println(i);
            }

            if (c.y> Integer.MAX_VALUE) {
                System.out.println("값 초과");
            } else {
                int i2 = (int) c.y;
                System.out.println(i2);
            }


        }
    }
