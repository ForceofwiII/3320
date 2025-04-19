import com.fow.BigInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GcdTest {





    // 1. test case for 100% Statement Coverage


    @Test
    public void testGCD_xIsZero() {
        BigInteger x = BigInteger.valueOf(0);
        BigInteger y = BigInteger.valueOf(42);

        BigInteger gcd = x.gcd(y);
        System.out.println(gcd);
    }

    @Test
    public void testGCD_xAndYNegative() {
        BigInteger x = BigInteger.valueOf(-18);
        BigInteger y = BigInteger.valueOf(-12);
        BigInteger gcd = x.gcd(y);
        System.out.println(gcd);
    }

    @Test
    public void testGCD_BigIntegerMainPath() {

        byte[] xBytes = new byte[]{(byte) 0xFF, (byte) 0xFF, 0x01, 0x01}; // 0xFFFF0000 = 4294901760
        byte[] yBytes = new byte[]{0x00, (byte) 0x88, 0x66, 0x66};       // 0x00800000 = 8388608

        BigInteger x = new BigInteger(1, xBytes); // words != null
        BigInteger y = new BigInteger(1, yBytes); // words != null

        BigInteger result = x.gcd(y);

        System.out.println(result);
    }

    @Test
    public void testGcd_triggerXvalEquals1() {
        BigInteger x = BigInteger.valueOf(666666666); // words == null
        byte[] yBytes = new byte[]{(byte)0xFF, 0x11, 0x22, 0x33}; // forces words != null
        BigInteger y = new BigInteger(1, yBytes); // words != null
        BigInteger result = x.gcd(y);
        System.out.println("Result1: " + result);
    }

    @Test
    public void testGcd_triggerYvalEquals0() {
        byte[] xBytes = new byte[]{(byte)0xFE, 0x55, 0x66, 0x77}; // forces words != null
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(0); // ival = 0, words == null
        BigInteger result = x.gcd(y);
        System.out.println("Result2: " + result);
    }


    //100% 分支覆盖（Branch/Decision Coverage）

    @Test
    public void testGCD_BigIntegerMainPath1() {

        byte[] xBytes = new byte[]{(byte) 0xFF, (byte) 0xFF, 0x01, 0x01}; // 0xFFFF0000 = 4294901760
        byte[] yBytes = new byte[]{0x00, (byte) 0x88, 0x66, 0x66};       // 0x00800000 = 8388608

        BigInteger x = new BigInteger(1, xBytes); // words != null
        BigInteger y = new BigInteger(1, yBytes); // words != null

        BigInteger result = x.gcd(y);

        System.out.println(result);
    }

    @Test
    public void testGcd_triggerXvalEquals12() {
        BigInteger x = BigInteger.valueOf(666666666); // words == null
        byte[] yBytes = new byte[]{(byte)0xFF, 0x11, 0x22, 0x33}; // forces words != null
        BigInteger y = new BigInteger(1, yBytes); // words != null
        BigInteger result = x.gcd(y);
        System.out.println("Result1: " + result);
    }

    @Test
    public void testGcd_triggerYvalEquals00() {
        byte[] xBytes = new byte[]{(byte)0xFE, 0x55, 0x66, 0x77}; // forces words != null
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(0); // ival = 0, words == null
        BigInteger result = x.gcd(y);
        System.out.println("Result2: " + result);
    }


    @Test
    public void testGcd_case1_intGcdBothNegative() {
        BigInteger x = BigInteger.valueOf(-36); // words == null
        BigInteger y = BigInteger.valueOf(-60); // words == null
        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(12), result);
    }

    // 用例 2：x = 0, y = 100 → 触发 B=true
    @Test
    public void testGcd_case2_xIsZero() {
        BigInteger x = BigInteger.valueOf(0);
        BigInteger y = BigInteger.valueOf(100);
        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(100), result);
    }

    // 用例 3：x = 大数, y = 0 → 触发 A=false, F=true, G=true
    @Test
    public void testGcd_case3_yIsZeroAndXisBig() {
        byte[] xBytes = new byte[]{0x01, 0x00, 0x00, 0x00}; // 0x01000000 = 16777216
        BigInteger x = new BigInteger(1, xBytes); // words != null
        BigInteger y = BigInteger.valueOf(0); // yval = 0
        BigInteger result = x.gcd(y);
        assertEquals(x.abs(), result);
    }









}
