package kp.home.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayThreeTest {

    @Test
    void testParseAndExecute() {
        DayThree three = new DayThree();
        Assertions.assertEquals(161,
                three.parseAndExecute("xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))"));
    }

    @Test
    void testParseAndExecute2() {
        DayThree three = new DayThree();
        Assertions.assertEquals(48,
                three.parseAndExecute("xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))"));
    }

}