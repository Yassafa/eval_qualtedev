import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStatistique {
    private Statistique stat;

    @BeforeEach
    public void init() {
        this.stat = new Statistique();
    }

    @Test
    public void whenCalculatingAverageOfThirtyAndFifty_ShouldReturnForty() {
        assertEquals(40, stat.moyenne(30, 50));
    }
}
