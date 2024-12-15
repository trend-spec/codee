
	import java.util.*;
	import java.util.function.Predicate;

	public class Generics{

	    // Generic method to count elements matching a condition
	    public static <T> long countMatchingElements(Collection<T> collection, Predicate<T> predicate) {
	        return collection.stream().filter(predicate).count();
	    }

	    public static void main(String[] args) {
	        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
	        List<String> words = List.of("level", "radar", "apple", "madam", "banana");

	        // Using lambda expressions directly
	        System.out.println("Odd numbers: " + countMatchingElements(numbers, num -> num % 2 != 0));
	        System.out.println("even numbers: " + countMatchingElements(numbers, num -> num % 2 == 0));
	        System.out.println("Prime numbers: " + countMatchingElements(numbers, num -> {
                if (num <= 1) return false;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) return false;
                }
                return true;
            }));
	        System.out.println("Palindromes: " + countMatchingElements(words, word -> word.equals(new StringBuilder(word).reverse().toString())));;
	}
	}