package com.LeetCode.tddTest;

import com.tdd.FizzBuzz;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void isFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.isFizz(18)).isEqualTo(true);
        assertThat(fizzBuzz.isFizz(1)).isEqualTo(false);
        assertThat(fizzBuzz.isBuzz(5)).isEqualTo(true);
        assertThat(fizzBuzz.isBuzz(6)).isEqualTo(false);
        assertThat(fizzBuzz.isFizzBuzz(15)).isEqualTo(true);
        assertThat(fizzBuzz.isFizzBuzz(3)).isEqualTo(false);
        assertThat(fizzBuzz.call(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.call(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.call(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.call(1)).isEqualTo("1");

    }
}
