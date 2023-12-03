import com.day12.UC3;
import org.junit.Test;
import static org.junit.Assert.*;

public class TC3_2 {

    @Test
    public void givenEmptyMood_ShouldThrowMoodAnalysisException_IndicatingEmptyMood() {
        UC3 moodAnalyser = new UC3("");
        try {
            moodAnalyser.analyseMood();
            fail("Expected a MoodAnalysisException to be thrown");
        } catch (UC3.MoodAnalysisException e) {
            assertEquals(UC3.MoodAnalysisError.EMPTY_MOOD, e.getErrorType());
        }
    }
}