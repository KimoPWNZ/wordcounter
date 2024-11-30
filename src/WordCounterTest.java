import static org.junit.jupiter.api.Assertions.*;  
import org.junit.jupiter.api.Test;  

public class WordCounterTest {  
    @Test  
    public void testCountWords() {  
        WordCounter wc = new WordCounter();  
        assertEquals(0, wc.countWords(""));  
        assertEquals(0, wc.countWords(null));  
        assertEquals(1, wc.countWords("Hello"));  
        assertEquals(2, wc.countWords("Hello World"));  
        assertEquals(4, wc.countWords("This is a test"));  
    }  
}
