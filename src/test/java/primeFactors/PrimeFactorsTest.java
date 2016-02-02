package primeFactors;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsTest {

    @Test
    public void testOne() {
        assertThat(PrimeFactors.generate(1)).isEqualTo(list());
    }

    @Test
    public void testTwo() {
        assertThat(PrimeFactors.generate(2)).isEqualTo(list(2));
    }

    private List<Integer> list(int ... ints) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i : ints) {
            integers.add(i);
        }
        return integers;
    }
}