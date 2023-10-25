package summarizers;

import numberrangesummarizer.NumberRangeSummarizer;

import java.util.Collection;


/**
 * NumberRangeSummarizer implementation.
 *
 * @author Brandon Pahla
 */
public class IntRangeSummarizer implements NumberRangeSummarizer {

    /**
     * Collect the input.
     * @param input A string list of comma separated numbers.
     * @return Collection of numbers in the input string.
     **/
    @Override
    public Collection<Integer> collect(String input) {
        return null;
    }

    /**
     * Summarizes the input Integer collection into groups of numbers if they are sequential.
     * @param input Collection of Integers.
     * @return String of groups of numbers.
     * **/
    @Override
    public String summarizeCollection(Collection<Integer> input) {
        return null;
    }
}
