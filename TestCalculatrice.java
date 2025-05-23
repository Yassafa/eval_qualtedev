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
        assertEquals(7, calc.add(2, 5));
    }
}
