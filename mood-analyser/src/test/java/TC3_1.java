import com.day12.UC3;
import org.junit.Test;

public class TC3_1 {

    @Test(expected = UC3.MoodAnalysisException.class)
    public void givenNullMood_ShouldThrowMoodAnalysisException() throws UC3.MoodAnalysisException {
        UC3 moodAnalyser = new UC3(null);
        moodAnalyser.analyseMood();
    }
}