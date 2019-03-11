package domain;

import org.junit.Test;
import util.RandomNumberGenerator;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberConditionTest {
    @Test
    public void check_if_generated_number_bigger_than_condition_number() {
        RandomNumberCondition randomNumberCondition =
                new RandomNumberCondition(1, 10, 5, new MockRandomNumberGenerator());
        assertThat(randomNumberCondition.canPass()).isTrue();
    }

    static class MockRandomNumberGenerator extends RandomNumberGenerator {
        @Override
        public int nextInt(int startNumber, int endNumber){
            return 8;
        }
    }
}
