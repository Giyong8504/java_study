package exam01;

public class Ex05 {
    public static void main(String[] args) {
        int result = add(10,20);
        System.out.println(result);
        int result2 = add(10,20,30);
        System.out.println(result2);

    }
    static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    static int add(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
}