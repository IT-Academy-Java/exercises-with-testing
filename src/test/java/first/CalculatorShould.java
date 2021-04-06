package first;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class CalculatorShould {

    private Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @Test
    public void addTwoNumbers(){
        assertThat(calculator.add(2,5), is(7));
    }

}
