package org.summarizer;

import numberrangesummarizer.NumberRangeSummarizer;
import summarizers.IntRangeSummarizer;

/**
 * The Summarizer class provides methods to summarize a list of numbers by grouping
 * them into sequential ranges.
 * Uses IntRangeSummarizer as the default NumberRangeSummarizer implementation.
 * @author Brandon Pahla
 * */
public class NumberSummarizer {

    private static NumberRangeSummarizer summarizer = new IntRangeSummarizer();

    /**
     * Sets the NumberRangeSummarizer implementation to be used for summarization.
     *
     * @param summarizer The NumberRangeSummarizer implementation to be used.
     */
    public static void setSummarizer(NumberRangeSummarizer summarizer) {
        NumberSummarizer.summarizer = summarizer;
    }

    /**
     * Summarizes numbers by grouping them into groups if they are sequential.
     * @param input A comma delimited list of numbers as a string.
     * @return A string representing a comma-delimited list of groups of sequential numbers.
     * */
    public static String summarize(String input) {
        return summarizer.summarizeCollection(summarizer.collect(input));
    }
}
