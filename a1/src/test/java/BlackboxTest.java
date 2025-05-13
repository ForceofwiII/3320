import com.fow.BigInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class BlackboxTest {


    // Tests for BigInteger(int signum, byte[] magnitude)



    @Test
    public void testjksdkf() {
        BigInteger result = new BigInteger(0, new byte[]{0});
        assertEquals(BigInteger.ZERO, result);
    }


    @Test
    public void testvjsdji() {
        assertThrows(NumberFormatException.class, () -> new BigInteger(0, new byte[]{1, 2}));
    }


    @Test
    public void testsdjflkfa() {
        assertThrows(NumberFormatException.class, () -> new BigInteger(1, (byte[]) null));
        assertThrows(NumberFormatException.class, () -> new BigInteger(-1, (byte[]) null));
    }


    @Test
    public void testvjkjgvv() {
        assertThrows(NumberFormatException.class, () -> new BigInteger(2, new byte[]{1}));
        assertThrows(NumberFormatException.class, () -> new BigInteger(-2, new byte[]{1}));
    }


    @Test
    public void testksdkjfz() {
        BigInteger result = new BigInteger(1, new byte[]{1, 2, 3});
        assertTrue(result.signum() > 0);
    }

    @Test
    public void testreijq1() {
        BigInteger result = new BigInteger(1, new byte[]{0});
        assertEquals(BigInteger.ZERO, result);
    }


    //
    @Test
    public void testjlksdkjlvj() {
        BigInteger result = new BigInteger(-1, new byte[]{1, 2, 3});
        assertTrue(result.signum() < 0);
    }

    @Test
    public void testjggggg() {
        BigInteger result = new BigInteger(-1, new byte[]{0});
        assertEquals(BigInteger.ZERO, result);
    }



    // Tests for BigInteger(String val, int radix)



    @Test
    public void testdjkskjlg() {
        assertThrows(NumberFormatException.class, () -> new BigInteger("123", 1));
        assertThrows(NumberFormatException.class, () -> new BigInteger("123", 37));
    }


    @Test
    public void testsgkjkgj() {
        assertThrows(NumberFormatException.class, () -> new BigInteger("1G5", 16));
    }


    @Test
    public void testSfdsjngjngf() {
        assertThrows(NumberFormatException.class, () -> new BigInteger("-", 10));
        assertThrows(NumberFormatException.class, () -> new BigInteger("", 10));
    }


    @Test
    public void testsgkgkf() {
        BigInteger result = new BigInteger("12345", 10);
        assertEquals(12345, result.intValue());
    }

    @Test
    public void test342482() {
        BigInteger result = new BigInteger("0", 10);
        assertEquals(BigInteger.ZERO, result);
    }



    @Test
    public void test234879() {
        BigInteger result = new BigInteger("-12345", 10);
        assertEquals(-12345, result.intValue());
    }


    // Tests for int compareTo(BigInteger val)



    @Test
    public void testwejkgkf() {
        BigInteger a = BigInteger.valueOf(5);
        BigInteger b = BigInteger.valueOf(10);
        assertEquals(-1, a.compareTo(b));
    }


    @Test
    public void testgjjkgv() {
        BigInteger a = BigInteger.valueOf(10);
        BigInteger b = BigInteger.valueOf(10);
        assertEquals(0, a.compareTo(b));
    }


    @Test
    public void testgfjkkfdgj() {
        BigInteger a = BigInteger.valueOf(15);
        BigInteger b = BigInteger.valueOf(10);
        assertEquals(1, a.compareTo(b));
    }
    @Test
    public void testgjfj() {
        BigInteger a = BigInteger.ONE;
        assertThrows(NullPointerException.class, () -> a.compareTo(null));
    }

    @Test
    public void testksljfkjfds() {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ZERO;
        assertEquals(1, a.compareTo(b));
    }

    @Test
    public void testsdjfkjfdjls() {
        BigInteger a = BigInteger.valueOf(-1);
        BigInteger b = BigInteger.ZERO;
        assertEquals(-1, a.compareTo(b));
    }

    @Test
    public void testdfsijdflksa() {
        BigInteger a = BigInteger.valueOf(-5);
        BigInteger b = BigInteger.valueOf(-10);
        assertEquals(1, a.compareTo(b));

        BigInteger c = BigInteger.valueOf(-10);
        BigInteger d = BigInteger.valueOf(-5);
        assertEquals(-1, c.compareTo(d));
    }

    @Test
    public void testghksfdljfd() {
        BigInteger big1 = new BigInteger("99999999999999999999999999999999999999");
        BigInteger big2 = new BigInteger("88888888888888888888888888888888888888");
        assertEquals(1, big1.compareTo(big2));

        BigInteger big3 = new BigInteger("99999999999999999999999999999999999999");
        assertEquals(0, big1.compareTo(big3));
    }





}