import com.day12.UC1;
import org.junit.Assert;
import org.junit.Test;

public class TC1_1 {

    @Test
    public void SadMessageTest() {
        UC1<String> moodAnalyser = new UC1<>();
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("Sad", mood);
    }
}