package fizz.buzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_2_when_count_given_number_2() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.count(2);

        //then
        assertEquals("2", actual);
    }

    @Test
    void should_return_Fizz_when_count_given_number_30() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.count(30);

        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_FizzBuzz_when_count_given_number_15() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.count(15);

        //then
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_return_Buzz_when_count_given_number_10() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.count(10);

        //then
        assertEquals("Buzz", actual);
    }
}
