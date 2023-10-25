package summarizers;

import numberrangesummarizer.NumberRangeSummarizer;

import java.util.ArrayList;
import java.util.Collection;


/**
 * NumberRangeSummarizer implementation.
 *
 * @author Brandon Pahla
 */
public class IntRangeSummarizer implements NumberRangeSummarizer {

    private final String inputDelimiter;

    public IntRangeSummarizer() {
        this.inputDelimiter = ",";
    }

    /**
     * Collect the input.
     * @param input A string list of comma separated numbers.
     * @return Collection of numbers in the input string.
     **/
    @Override
    public Collection<Integer> collect(String input) {
        Collection<Integer> res = new ArrayList<>();
        if (input.isEmpty())
            return res;
        String[] inputArray = input.split(this.inputDelimiter);
        for (String element : inputArray) {
            res.add(Integer.parseInt(element));
        }
        return res;
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
