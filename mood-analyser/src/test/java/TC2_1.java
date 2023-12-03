import com.day12.UC2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TC2_1 {
    @Test
    public void givenNullMood_ShouldReturnHappy() {
        UC2 moodAnalyser = new UC2(null);
        String mood = moodAnalyser.analyseMood();
        assertEquals("Happy", mood);
    }
}