public class Stream {

//! Terminal Operations:

//*Return a single value:

// count(): Returns the number of elements in the stream.
// min(Comparator<?>): Returns the minimum element according to the provided comparator.
// max(Comparator<?>): Returns the maximum element according to the provided comparator.
// findFirst(): Returns the first element found in the stream, if any.
// anyMatch(Predicate<?>): Checks if at least one element matches the given predicate.
// allMatch(Predicate<?>): Checks if all elements match the given predicate.
// noneMatch(Predicate<?>): Checks if no elements match the given predicate.
// reduce(BinaryOperator<T>): Reduces the elements into a single summary value using a binary operator.
// collect(Supplier<C>, BiConsumer<C, ? super T>, BiConsumer<C, C>): Collects elements into a container using a supplier function, accumulator function, and combiner function (useful for creating custom collections).
// Perform side effects:

// forEach(Consumer<? super T>): Performs an action for each element in the stream.
// peek(Consumer<? super T>): Performs an action for each element in the stream but doesn't modify the stream itself (used for debugging or side effects without affecting the resulting stream).
//! Non-Terminal Operations (Intermediate Operations):

//*Filtering:

// filter(Predicate<? super T>): Returns a stream containing elements that match a given predicate.
// *Transforming:

// map(Function<? super T, ? extends R>): Applies a function to each element and returns a new stream with the results.
// flatMap(Function<? super T, ? extends Stream<? extends R>>): Flattens a stream of streams into a single stream of elements.
// distinct(): Returns a stream with duplicate elements removed.
// sorted(): Sorts the elements according to a natural ordering or a custom comparator.
// peek(Consumer<? super T>): Similar to the terminal peek but for intermediate operations (used for debugging or side effects without affecting the resulting stream).
// Short-circuiting:

// limit(long size): Returns a stream with a limited number of elements.
// skip(long n): Skips the first n elements and returns the remaining elements.
//! Important Note:

// Terminal operations are the ones that actually trigger the processing of the stream and return a result or perform a side effect.
// Non-terminal operations are chained together to define the processing pipeline for the stream. They return a new stream object without actually evaluating the stream elements until a terminal operation is called.
// By understanding these operations, you can effectively manipulate and process streams in Java to achieve various functionalities.
    
}
