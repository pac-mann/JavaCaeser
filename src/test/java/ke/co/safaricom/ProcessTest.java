package ke.co.safaricom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessTest {
    //RED GREEN REFACTOR

    @Test
    @DisplayName("Test if encoding is working OK")
    void testEncoding(){
        Data data = new Data();
        data.setProcess(1);
        data.setMessage("A");
        data.setKey(1);
        String output = Process.run(data);
        assertEquals("B", output);
    }

    @Test
    @DisplayName("Test if decoding is working OK")
    void testDecoding(){
        Data data = new Data();
        data.setProcess(2);
        data.setMessage("B");
        data.setKey(1);
        String output = Process.run(data);
        assertEquals("A", output);

    }

    @Test
    @DisplayName("Unknown process works ok")
    void testUnknownProcess() {
        Data data = new Data();
        data.setProcess(3);
        data.setMessage("B");
        data.setKey(1);
        String output = Process.run(data);
        assertEquals(null, output);
    }

}