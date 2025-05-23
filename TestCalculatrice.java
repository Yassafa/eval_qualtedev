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
}
