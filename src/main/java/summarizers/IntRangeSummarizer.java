package summarizers;

import numberrangesummarizer.NumberRangeSummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * NumberRangeSummarizer implementation.
 *
 * @author Brandon Pahla
 */
public class IntRangeSummarizer implements NumberRangeSummarizer {

    private final String inputDelimiter;
    private final String outputElementDelimiter;
    private final String outputGroupDelimiter;

    public IntRangeSummarizer() {
        this.inputDelimiter = ",";
        this.outputGroupDelimiter = "-";
        this.outputElementDelimiter = ", ";
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
        if (input.isEmpty())
            return "";

        List<Integer> collection = new ArrayList<>(input);

        StringBuilder result = new StringBuilder(String.valueOf(collection.get(0)));
        int lastElement = collection.get(collection.size()-1);
        String lastAdded = "";

        for (int i = 1; i < input.size(); i++) {
            int difference = Math.abs(collection.get(i - 1) - collection.get(i));
            if (difference == 1) {
                if (lastAdded.equals(this.outputGroupDelimiter))
                    continue;
                result.append(this.outputGroupDelimiter);
                lastAdded = this.outputGroupDelimiter;
                continue;
            }
            if (lastAdded.equals(this.outputGroupDelimiter))
                result.append(collection.get(i - 1));
            result.append(this.outputElementDelimiter).append(collection.get(i));
            lastAdded = String.valueOf(collection.get(i));
        }
        if (lastAdded.equals(this.outputGroupDelimiter))
            result.append(lastElement);

        return result.toString();
    }
}
