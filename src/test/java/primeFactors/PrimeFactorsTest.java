package primeFactors;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static primeFactors.PrimeFactors.generate;

public class PrimeFactorsTest {

    @Test
    public void testOne() {
        assertThat(generate(1)).isEqualTo(list());
    }

    @Test
    public void testTwo() {
        assertThat(generate(2)).isEqualTo(list(2));
    }

    @Test
    public void testThree() {
        assertThat(generate(3)).isEqualTo(list(3));
    }

    @Test
    public void testFour() {
        assertThat(generate(4)).isEqualTo(list(2, 2));
    }

    @Test
    public void testFive() {
        assertThat(generate(6)).isEqualTo(list(2, 3));
    }

    private List<Integer> list(int ... ints) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i : ints) {
            integers.add(i);
        }
        return integers;
    }
}