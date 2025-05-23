import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculatrice {
    private Calculatrice calc;

    @BeforeEach
    public void init() {
        this.calc = new Calculatrice();
    }

    @Test
    public void whenAddingTwoAndFive_ShouldReturnSeven() {
        assertEquals(7, this.calc.add(2, 5));
    }

    @Test
    public void whenDividingFifteenByThree_ShouldReturnFive() {
        assertEquals(3, this.calc.div(15, 5));
    }

    @Test
    public void whenMultiplyingMinusTwoAndThree_ShouldReturnMinusSix() {
        assertEquals(-6, this.calc.mult(-2, 3));
    }

    /*Test qui fail*/
    @Test
    public void whenSubtractingFourFromNine_ShouldReturnFive() {
        assertEquals(5, calc.minus(9, 4));
    }
}
