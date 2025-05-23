import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

public class TestStatistique {

    @Test
    public void init() {
        Calculatrice calc = Mockito.mock(Calculatrice.class);
        when(calc.add(30, 50)).thenReturn(80);
        when(calc.div(80, 2)).thenReturn(40);
    }
}
