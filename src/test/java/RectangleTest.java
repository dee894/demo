import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void equalsArea(){
        Assertions.assertEquals(1,new Rectangle(1,1).area());
    }
}
