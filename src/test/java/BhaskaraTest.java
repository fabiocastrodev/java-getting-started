import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Bhaskara;

public class BhaskaraTEst {

    @Test
    public void Teste1() {
        Bhaskara bhask = new Bhaskara(1, -5, 6);
        assertEquals(3, bhask.getX1());
        assertEquals(2L, bhask.getX2());
    }
}