package io.github.benas.unixstream.components;

import io.github.benas.unixstream.Functions;
import io.github.benas.unixstream.Stage;

import java.util.stream.Stream;

/**
 * Replace Windows line separators (CRLF) by Unix line separators (LF).
 *
 * @author Mahmoud Ben Hassine (mahmoud@benhassine.fr)
 */
public class Dos2Unix implements Stage<String, String> {

    /**
     * Create a new {@link Dos2Unix} instance.
     */
    public Dos2Unix() {
    }

    /**
     * Create a new {@link Dos2Unix} instance.
     *
     * @return a new {@link Dos2Unix} instance.
     */
    public static Dos2Unix dos2unix() {
        return new Dos2Unix();
    }

    @Override
    public Stream<String> apply(Stream<String> input) {
        return input.map(Functions.dos2unix());
    }
}
