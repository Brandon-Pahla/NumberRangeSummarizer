package summarizers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class IntRangeSummarizerTest {
    @Test
    @DisplayName("Collect empty string")
    void collectZero() {
        IntRangeSummarizer intRangeSummarizer = new IntRangeSummarizer();
        assertEquals(new ArrayList<>(), intRangeSummarizer.collect(""));
    }

    @Test
    @DisplayName("Collect all elements into a collection")
    void collect() {
        IntRangeSummarizer intRangeSummarizer = new IntRangeSummarizer();
        Collection<Integer> collection = intRangeSummarizer.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
        assertEquals(new ArrayList<>(Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31)), collection);
    }
}