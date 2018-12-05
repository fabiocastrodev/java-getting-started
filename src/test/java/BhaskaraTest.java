import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Bhaskara;

public class BhaskaraTest {
  @Test
  public void Teste1() {
      Bhaskara bhask = new Bhaskara(1.0, -5.0, 6.0);
      assertEquals(3.0, bhask.getX1(), 0.1);
      assertEquals(2.0, bhask.getX2(), 0.1);
  }
  
  @Test
  public void Teste2() {
      Bhaskara bhask = new Bhaskara(1.0, 8.0, -9.0);
      assertEquals(1.0, bhask.getX1(), 0.1);
      assertEquals(-9.0, bhask.getX2(), 0.1);
  }
  
  @Test
  public void Teste3() {
      Bhaskara bhask = new Bhaskara(1.0, 3.0, -4.0);
      assertEquals(1.0, bhask.getX1(), 0.1);
      assertEquals(-4.0, bhask.getX2()), 0.1;
  }
}