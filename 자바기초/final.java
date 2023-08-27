class Test {
    final String host = "localhost:8080->";
    final int num;

    public Test(int num) {
        this.num = num;
    }
}

class TestExample {
    public static void main(String[] args) {
        Test testNum = new Test(777);

        System.out.println(testNum.host);
        System.out.println(testNum.num);

        String finalNum = testNum.host + testNum.num;
        System.out.println(finalNum);
    }
}
