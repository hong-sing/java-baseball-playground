public class StringCalculator {

    public String[] splitString(String str) {
        return str.split(" ");
    }

    public int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    public int calculate(int firstValue, String operator, int secondValue) {
        if (operator.equals("+")) {
            return add(firstValue, secondValue);
        }
        if (operator.equals("-")) {
            return minus(firstValue, secondValue);
        }
        if (operator.equals("*")) {
            return multiply(firstValue, secondValue);
        }
        if (operator.equals("/")) {
            return divide(firstValue, secondValue);
        }
        return 0;
    }

    public int add(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    public int minus(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    public int multiply(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    public int divide(int firstValue, int secondValue) {
        if (secondValue==0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return firstValue / secondValue;
    }

    public int runCalculate(String[] strArr) {
        int result = stringToInt(strArr[0]);
        for (int i = 1; i < strArr.length; i += 2) {
            result = calculate(result,strArr[i],stringToInt(strArr[i+1]));
        }
        return result;
    }

}
