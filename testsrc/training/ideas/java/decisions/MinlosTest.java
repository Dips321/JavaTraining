package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idndee on 31-07-2014.
 */
public class MinlosTest {

        @Test
        public void given_a_FPLOS_Pattern_As_YYYYYYY_I_Should_Get_Minlos_As_1() {
            Assert.assertEquals("MINLOS does not match", 1, GeneratePattern.generateMINLOS("YYYYYYY"));
        }

        @Test
        public void given_a_FPLOS_Pattern_As_NNNNNNN_I_Should_Get_Minlos_As_0() {
            Assert.assertEquals("MINLOS does not match", 0, GeneratePattern.generateMINLOS("NNNNNNN"));
        }

        @Test
        public void given_a_FPLOS_Pattern_As_NNYYYYY_I_Should_Get_Minlos_As_3() {
            Assert.assertEquals("MINLOS does not match", 3, GeneratePattern.generateMINLOS("NNYYYYY"));
        }

        @Test
        public void given_a_FPLOS_Pattern_As_NNNNNNY_I_Should_Get_Minlos_As_7() {
            Assert.assertEquals("MINLOS does not match", 7, GeneratePattern.generateMINLOS("NNNNNNY"));
        }

        @Test
        public void given_a_FPLOS_Pattern_As_YNNNNNY_I_Should_Get_Minlos_As_1() {
            Assert.assertEquals("MINLOS does not match", 1, GeneratePattern.generateMINLOS("YNNNNNY"));
        }

        @Test
        public void given_a_FPLOS_Pattern_As_null_I_Should_Get_Minlos_As_minus1() {
            Assert.assertEquals("MINLOS does not match", -1, GeneratePattern.generateMINLOS(""));
        }
    }



