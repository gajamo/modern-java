package co.com.ias.deved.workshop.step02;

import java.util.Objects;

public class LambdasExercises {

    /**
     * Implement a function that receives two values
     * @param <T>
     * @param <R>
     * @param <U>
     */
    // remove next comment to implement
    // @FunctionalInterface
    interface BiFunction<T, R, U> {
        // TODO
    }

    /**
     * Implement a consumer that receives two values
     * @param <T> ?
     * @param <R> ?
     */
    // remove next comment to implement
    // @FunctionalInterface
    interface BiConsumer<T, R> {
        // TODO
    }

    /**
     * Implement a predicate that receives two values
     * @param <T> ?
     * @param <R> ?
     */
    // remove next comment to implement
    // @FunctionalInterface
    interface BiPredicate<T, R> {
        // TODO
    }

    /**
     * Implement compose method to the function
     */
    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);

        default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
            Objects.requireNonNull(after);
            return (T t) -> after.apply(apply(t));
        }

        default <V> Function<T, V> compose(Function<? super V, ? extends T> before) {
            Objects.requireNonNull(before);
            // TODO
            return null;
        }
    }


}
