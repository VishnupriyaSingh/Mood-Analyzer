import com.day12.Refactor;
import org.junit.Assert;
import org.junit.Test;

public class RefactorTC1_2 {

    @Test
    public void givenHappyMessageInConstructor_ShouldReturnSad() {
        Refactor moodAnalyser = new Refactor("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy", mood);
    }

    @Test
    public void givenNoMessageInConstructor_ShouldReturnHappy() {
        Refactor moodAnalyser = new Refactor();
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy", mood);
    }
}