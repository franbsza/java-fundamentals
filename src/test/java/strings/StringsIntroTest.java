package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringsIntroTest {

    StringsIntro stringsIntro = new StringsIntro();

    @Test
    void sumLengths(){
       int num = stringsIntro.sumLengths("Ana" , "Peter");
       assertEquals(8, num);
    }

    @Test
    void isBComesBeforeATrue(){
        assertTrue(stringsIntro.isBComesBeforeA("Peter", "Ana"));
    }

    @Test
    void isBComesBeforeAFalse(){
        assertFalse(stringsIntro.isBComesBeforeA("Ana" , "Peter"));
    }

    @Test
    void capitalize(){
        assertEquals("Ana Peter", stringsIntro.capitalize("ana", "peter"));
    }
}
