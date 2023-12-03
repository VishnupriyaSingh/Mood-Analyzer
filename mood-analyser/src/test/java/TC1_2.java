import com.day12.UC1;
import org.junit.Assert;
import org.junit.Test;

public class TC1_2 {

    @Test
    public void HappyMessageTest() {
        UC1<String> moodAnalyser = new UC1<>();
        String mood = moodAnalyser.analyseMood("I am in Any mood");
        Assert.assertEquals("Happy", mood);
    }
}