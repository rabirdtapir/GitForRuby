import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceReaderTest {

    @Test
    public void read() throws Exception {
        SequenceReader sequence = new SequenceReader();
        String str = sequence.read("1");
        assertEquals(str, "11");
    }

    @Test
    public void counter() {
        SequenceReader sequence = new SequenceReader();
        String ch = "1";
        char arr[] = ch.toCharArray();
        int counter = sequence.counter(arr, 0);
        assertEquals(counter, 1);

    }

}