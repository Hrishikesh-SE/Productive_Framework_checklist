import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streaming {
	public static <T> Stream<T> getSliceOfStream(Stream<T> stream, int startIndex, int endIndex) {
		// skip will determine start and limit will determine how many elements will stream contain
		return stream.skip(startIndex).limit(endIndex - startIndex + 1);
	}

	public static void main(String[] args) {
		// Create a new List with values 11 - 20
		List<Integer> list = new ArrayList<>();
		for (int i = 11; i <= 20; i++)
			list.add(i);
		// Create stream from list
		Stream<Integer> intStream = list.stream();
		// Print the stream
		System.out.println("List: " + list);
		// Get Slice of Stream
		// containing of elements from the 4th index to 8th
		Stream<Integer> sliceOfIntStream = getSliceOfStream(intStream, 4, 8);
		// Print the slice
		System.out.println("\nSlice of Stream:");
		sliceOfIntStream.forEach(System.out::println);
		// Partition the STREAM
		Stream<Integer> st1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Map<Boolean, List<Integer>> m1 = st1.collect(Collectors.partitioningBy(number -> number > 3));
		System.out.println(m1);
		List<Integer> list22 = Arrays.asList(0, 2, 4, 6, 8, 10);
		list22.stream().peek(System.out::println);
		int[] arr = { 1, 2, 3, 4, 5 };
		List<Integer> arL = Arrays.asList(22, 33, 44, 55, 66, 77);
		List<Integer> arL1 = arL.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(arL1);
		// Finding elements that start with "S"
		System.out.println("Finding elements that start with S");
		List<String> names = Arrays.asList("Sqqw", "Swewe", "pppdfe", "vvcv");
		List<String> custom = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(custom);
		// Give Only Unique Elements
		System.out.println("Give Only Unique Elements");
		List<String> persons = Arrays.asList("Sasa", "Sasa", "Psdss", "Psdss", "EEEE", "sxcxc");
		List<String> res = persons.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println(res);
		// Sorts The Elements in the List
		System.out.println("Sorts The Elements in the List");
		List<String> arList = Arrays.asList("AAA", "BBB", "ZZZ", "EEEE", "DDDD", "XXXX");
		List<String> sorted = arList.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		// Will get Even NUmbers And Adds THEM
		System.out.println("Will get Even Numbers And Adds them");
		List<Integer> number = Arrays.asList(12, 3, 4, 5);
		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		System.out.println(even);
		// Will print numbers by Squaring it
		System.out.println("**********************");
		System.out.println("Will print numbers by Squaring it");
		number.stream().map(x -> x * x).forEach(y -> System.out.println(y));
		// Will get even number list
		System.out.println("Will get even number list");
		List<Integer> even1 = number.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(even1);
		// Counts the elements of the list by numbers
		System.out.println("Counts the elements of the list by numbers");
		List<String> g = Arrays.asList("geeks", "for", "geeks");
		Map<String, Long> result = g.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
		// Counts the elements of the list by numbers
		System.out.println("Counts the elements of the list by numbers");
		List<Integer> numList = Arrays.asList(22, 22, 55, 66, 66, 88, 88, 88, 88, 100, 100);
		Map<Integer, Long> countNum = numList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countNum);
	}
}
