package first;

public class Calculator {

    private int firsNumber;
    private int secondNumber;

    public Calculator() {
    }

    public Calculator(int firsNumber, int secondNumber) {
        this.firsNumber = firsNumber;
        this.secondNumber = secondNumber;
    }

    public int add(Integer firsNumber, Integer secondNumber){
        int result = 0;
        if(firsNumber instanceof Integer  && secondNumber instanceof Integer){
            result =  firsNumber + secondNumber;
        }
        return result;
    }
}
