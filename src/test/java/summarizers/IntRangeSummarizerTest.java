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
        Collection<Integer> collection = intRangeSummarizer.collect("1,3,6,7,8,12,13,14,15,21,22,23,24");
        assertEquals(new ArrayList<>(Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24)), collection);
    }

    @Test
    @DisplayName("summarize one element")
    void summarizeCollectionOne() {
        IntRangeSummarizer intRangeSummarizer = new IntRangeSummarizer();
        String summarized = intRangeSummarizer.summarizeCollection(new ArrayList<>(List.of(7)));
        assertEquals("7", summarized);
    }

    @Test
    @DisplayName("One Group")
    void summarizeCollectionGroup(){
        IntRangeSummarizer intRangeSummarizer = new IntRangeSummarizer();
        Collection<Integer> collection = intRangeSummarizer.collect("1,2,3,4,5,6,7,8,9,10");
        String summarized = intRangeSummarizer.summarizeCollection(collection);
        assertEquals("1-10", summarized);
    }

    @Test
    @DisplayName("Last element not in a group")
    void summarizeCollection() {
        IntRangeSummarizer intRangeSummarizer = new IntRangeSummarizer();
        String summarized = intRangeSummarizer
                .summarizeCollection(new ArrayList<>(Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31)));
        assertEquals("1, 3, 6-8, 12-15, 21-24, 31", summarized);
    }

    @Test
    @DisplayName("First element is a group")
    void summarizeCollectionFirst() {
        IntRangeSummarizer intRangeSummarizer = new IntRangeSummarizer();
        String summarized = intRangeSummarizer
                .summarizeCollection(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 8, 9, 10)));
        assertEquals("1-4, 6, 8-10", summarized);
    }

    @Test
    @DisplayName("Numbers in reverse")
    void summarizeCollectionInReverse() {
        IntRangeSummarizer intRangeSummarizer = new IntRangeSummarizer();
        Collection<Integer> collection = intRangeSummarizer.collect("31,24,23,22,21,15,14,13,12,8,7,6,3,1");
        String summarized = intRangeSummarizer.summarizeCollection(collection);
        assertEquals("31, 24-21, 15-12, 8-6, 3, 1", summarized);
    }

    @Test
    @DisplayName("Numbers not in order")
    void summarizeCollectionNotSorted() {
        IntRangeSummarizer intRangeSummarizer = new IntRangeSummarizer();
        Collection<Integer> collection = intRangeSummarizer.collect("1,24,3,22,21,15,6,13,12,8,7,14,33,31");
        String summarized = intRangeSummarizer.summarizeCollection(collection);
        assertEquals("1, 24, 3, 22-21, 15, 6, 13-12, 8-7, 14, 33, 31", summarized);
    }

    @Test
    @DisplayName("No groups")
    void summarizeCollectionNoGroup() {
        IntRangeSummarizer intRangeSummarizer = new IntRangeSummarizer();
        Collection<Integer> collection = intRangeSummarizer.collect("2,4,6,8,10");
        String summarized = intRangeSummarizer.summarizeCollection(collection);
        assertEquals("2, 4, 6, 8, 10", summarized);
    }
}