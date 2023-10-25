package org.summarizer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSummarizerTest {

    @Test
    @DisplayName("Collect and Summarize combined")
    void summarize() {
        String summarized = NumberSummarizer.summarize("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
        assertEquals("1, 3, 6-8, 12-15, 21-24, 31", summarized);
    }
}