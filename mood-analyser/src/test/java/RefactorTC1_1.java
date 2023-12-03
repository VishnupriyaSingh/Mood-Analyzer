import com.day12.Refactor;
import org.junit.Assert;
import org.junit.Test;

public class RefactorTC1_1 {

    @Test
    public void SadMessageTest() {
        Refactor moodAnalyser = new Refactor("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Sad", mood);
    }
}