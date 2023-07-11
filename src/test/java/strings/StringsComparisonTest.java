package strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringsComparisonTest {

    StringsComparison stringsComparison = new StringsComparison();

    @Test
    @DisplayName("should return ava \n wel when input string is welcometojava and length 3")
    void getStringComparison(){
        String text =  stringsComparison.getMinumumString("welcometojava" ,3);
        assertEquals("ava\nwel", text);
    }

    @Test
    @DisplayName("should return A \n y when compare given data")
    void getStringComparisonTwo(){
      String text =  stringsComparison.getMinumumString("ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkj" +
              "kLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfg" +
              "ljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKH" +
              "KJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyh" +
              "trkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH" ,1);
        assertEquals("A\ny", text);
    }
}
