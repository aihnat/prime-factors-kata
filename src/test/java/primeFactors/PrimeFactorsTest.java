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

    private List<Integer> list() {
        return new ArrayList<>();
    }
}