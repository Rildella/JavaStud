import model.University;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UniversityTest {
    @Test
    void testUniversityCreation() {
        University university = new University("Тестовий університет");
        assertNotNull(university);
        assertEquals("Тестовий університет", university.getName());
    }
}
