# Number Range Summarizer

Welcome to the Number Range Summarizer project! The primary objective of this project is to implement the `NumberRangeSummarizer` interface, providing efficient and accurate summarization of numerical ranges.

## IntRangeSummarizer

The `IntRangeSummarizer` class serves as an implementation of the `NumberRangeSummarizer` interface. It is designed to handle integer ranges and provides specialized logic for summarizing these ranges effectively.

## NumberSummarizer

The `NumberSummarizer` class acts as a versatile utility, capable of utilizing any implementation of the `NumberRangeSummarizer` interface. Its core functionality lies in summarizing any given list of comma-separated numbers, provided as a String. By leveraging the implemented interfaces, the `NumberSummarizer` class offers a seamless and dynamic summarization experience. The default implementation of the `NumberRangeSummarizer` that is used is the `IntRangeSummarizer`.