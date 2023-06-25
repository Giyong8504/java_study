package exam08;

public class ComplexCalculator extends Calculator{
    public int add(int num1, int num2) {
        int result =num1 + num2;
        return result;
    }

    @Override
    public int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
}
