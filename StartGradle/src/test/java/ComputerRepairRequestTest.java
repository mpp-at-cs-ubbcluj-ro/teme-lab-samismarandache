import static org.junit.jupiter.api.Assertions.assertEquals;

import model.ComputerRepairRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First Test")
    public void testExample() {
        ComputerRepairRequest crr = new ComputerRepairRequest();
        assertEquals("", crr.getOwnerName());
        assertEquals("", crr.getOwnerAddress());
    }

    @Test
    @DisplayName("Test Exemplu")
    public void testExemple2() {
        assertEquals(2,2,"Numele ar trebui sa fie egale");
    }
}
