import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingTest {
    @Test
    void testGenerateGreeting() {
        String name = "Alice";
        String expectedGreeting = "Hello, Alice! Welcome to GitHub Classroom!";
        assertEquals(expectedGreeting, Greeting.generateGreeting(name));
    }
}
