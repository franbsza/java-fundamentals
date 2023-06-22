package functional.programming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamUtilsTest {

    StreamUtils streamUtils = new StreamUtils();
    List<String> list;

    @BeforeEach
    void setup(){
        list = Arrays.asList( "Tiago", "Amanda", "Saulo", "Bianca", "Peter", "Carla", "Tatiane");
    }

    @Test
    @DisplayName("it should sort names alphabetically")
    void sorted(){
        List<String> expected = Arrays.asList("Amanda", "Bianca", "Carla", "Peter", "Saulo", "Tatiane", "Tiago");
        List<String> actual = streamUtils.sorted(list);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("it should filter names with beginning with T")
    void beginningWithT(){
        List<String> expected = Arrays.asList("Tiago", "Tatiane");
        List<String> actual = streamUtils.beginningWithT(list);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("it should capitalize names")
    void upperCase(){
        List<String> expected = Arrays.asList("TIAGO", "AMANDA", "SAULO", "BIANCA", "PETER", "CARLA", "TATIANE");
        List<String> actual = streamUtils.upperCase(list);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("it should sort names alphabetically, filter those with beginning with T and capitalize them")
    void everythingCombined(){
        List<String> expected = Arrays.asList("TATIANE", "TIAGO");
        List<String> actual = streamUtils.everythingCombined(list);
        assertEquals(expected, actual);
    }
}
