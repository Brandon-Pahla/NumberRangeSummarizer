# Number Range Summarizer

Welcome to the Number Range Summarizer project! The primary objective of this project is to implement the `NumberRangeSummarizer` interface, providing efficient and accurate summarization of numerical ranges.

## IntRangeSummarizer

The `IntRangeSummarizer` class serves as an implementation of the `NumberRangeSummarizer` interface. It is designed to handle integer ranges and provides specialized logic for summarizing these ranges effectively.

### Efficiency class

* __collect__
  * Time efficiency
    * &Theta;(n)
  * Memory efficiency
    * &Theta;(n)
* __summarizeCollection__
  * Time efficiency
    * &Theta;(n)
  * Memory efficiency
    * &Theta;(n)

## NumberSummarizer

The `NumberSummarizer` class acts as a versatile utility, capable of utilizing any implementation of the `NumberRangeSummarizer` interface. Its core functionality lies in summarizing any given list of comma-separated numbers, provided as a String. By leveraging the implemented interfaces, the `NumberSummarizer` class offers a seamless and dynamic summarization experience. The default implementation of the `NumberRangeSummarizer` that is used is the `IntRangeSummarizer`.

### How to Use

To utilize the summarization capabilities offered by this project, follow these steps:

1. **Implementation:** Implement the `NumberRangeSummarizer` interface or choose an existing implementation like `IntRangeSummarizer`.

2. **Set Summarizer:** If you opt for a custom implementation, utilize the `setSummarizer` method in the `NumberSummarizer` class to set your custom summarizer.

3. **Summarize Numbers:** Call the `summarize` method, passing a comma-separated list of numbers as a String. The `NumberSummarizer` class will efficiently process the input and provide a summarized version of the numbers in sequential groups.

### Example Usage

```java
// Choose an appropriate implementation of NumberRangeSummarizer
NumberRangeSummarizer summarizer = new IntRangeSummarizer();

// Set the chosen summarizer
Summarizer.setSummarizer(summarizer);

// Provide a comma-separated list of numbers for summarization
String inputNumbers = "1,2,3,4,6,7,8,10,11";

// Obtain the summarized result
String summarizedNumbers = Summarizer.summarize(inputNumbers);

System.out.println("Summarized Numbers: " + summarizedNumbers);
```

This example demonstrates how to use the `NumberSummarizer` class to summarize a list of numbers.