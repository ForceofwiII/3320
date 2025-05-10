import com.fow.BigInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompareToTest {

    // 100%语句覆盖

    @Test
    public void test1() {

        BigInteger x = BigInteger.valueOf(66);
        BigInteger y = BigInteger.valueOf(88);

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test11111() {

        BigInteger x = BigInteger.valueOf(66);
        BigInteger y = BigInteger.valueOf(66);

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test11112() {

        BigInteger x = BigInteger.valueOf(88);
        BigInteger y = BigInteger.valueOf(66);

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test21() {

        BigInteger x = new BigInteger("-8888000000");
        BigInteger y = new BigInteger("6666");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test2() {

        BigInteger x = new BigInteger("8888000000");
        BigInteger y = new BigInteger("6666");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test211() {

        BigInteger x = new BigInteger("66");
        BigInteger y = new BigInteger("8888000000");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test3() {

        BigInteger x = new BigInteger("888888888888888888888");
        BigInteger y = new BigInteger("888888888888888888888");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test4() {

        BigInteger x = new BigInteger("888888888888888888888");
        BigInteger y = new BigInteger("-888888888888888888888");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    // 100%决策覆盖
    @Test
    public void test41() {

        BigInteger x = new BigInteger("888888888888888888888");
        BigInteger y = new BigInteger("-888888888888888888888");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test31() {

        BigInteger x = new BigInteger("888888888888888888888");
        BigInteger y = new BigInteger("888888888888888888888");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test11() {

        BigInteger x = BigInteger.valueOf(66);
        BigInteger y = BigInteger.valueOf(88);

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test111() {

        BigInteger x = BigInteger.valueOf(66);
        BigInteger y = BigInteger.valueOf(66);

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test1111() {

        BigInteger x = BigInteger.valueOf(88);
        BigInteger y = BigInteger.valueOf(66);

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test22() {

        BigInteger x = new BigInteger("8888000000");
        BigInteger y = new BigInteger("6666");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test2111() {

        BigInteger x = new BigInteger("66");
        BigInteger y = new BigInteger("8888000000");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test21111() {

        BigInteger x = new BigInteger("-8888000000");
        BigInteger y = new BigInteger("6666");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    // 100%条件覆盖

    @Test
    public void test12() {

        BigInteger x = BigInteger.valueOf(66);
        BigInteger y = BigInteger.valueOf(88);

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test123() {

        BigInteger x = BigInteger.valueOf(666);
        BigInteger y = BigInteger.valueOf(88);

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test123114() {

        BigInteger x = BigInteger.valueOf(666);
        BigInteger y = BigInteger.valueOf(666);

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test211611() {

        BigInteger x = new BigInteger("-8888000000");
        BigInteger y = new BigInteger("6666");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test2116181() {

        BigInteger x = new BigInteger("8888000000");
        BigInteger y = new BigInteger("-6666");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test21616181() {

        BigInteger x = new BigInteger("8888000000");
        BigInteger y = new BigInteger("6666");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test216316181() {

        BigInteger x = new BigInteger("666");
        BigInteger y = new BigInteger("8888000000");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test2163161861() {

        BigInteger x = new BigInteger("8888000000");
        BigInteger y = new BigInteger("8888000000");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test21631761861() {

        BigInteger x = new BigInteger("-8888000000");
        BigInteger y = new BigInteger("-888800000");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test216317611861() {

        BigInteger x = new BigInteger("888800000");
        BigInteger y = new BigInteger("8888000000");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    // 100%条件/决策覆盖

    @Test
    public void test22312() {

        BigInteger x = BigInteger.valueOf(66);
        BigInteger y = BigInteger.valueOf(88);

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test3232123() {

        BigInteger x = BigInteger.valueOf(666);
        BigInteger y = BigInteger.valueOf(88);

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test112234() {

        BigInteger x = BigInteger.valueOf(666);
        BigInteger y = BigInteger.valueOf(666);

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test21341611() {

        BigInteger x = new BigInteger("-8888000000");
        BigInteger y = new BigInteger("6666");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test2113446181() {

        BigInteger x = new BigInteger("8888000000");
        BigInteger y = new BigInteger("-6666");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test2143616181() {

        BigInteger x = new BigInteger("8888000000");
        BigInteger y = new BigInteger("6666");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test21436316181() {

        BigInteger x = new BigInteger("666");
        BigInteger y = new BigInteger("8888000000");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test216213161861() {

        BigInteger x = new BigInteger("8888000000");
        BigInteger y = new BigInteger("8888000000");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test216317613861() {

        BigInteger x = new BigInteger("-8888000000");
        BigInteger y = new BigInteger("-888800000");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test2163176118161() {

        BigInteger x = new BigInteger("888800000");
        BigInteger y = new BigInteger("8888000000");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test4121() {

        BigInteger x = new BigInteger("888888888888888888888");
        BigInteger y = new BigInteger("-888888888888888888888");

        int i = x.compareTo(y);
        assertNotNull(i);

    }

    @Test
    public void test3211() {

        BigInteger x = new BigInteger("888888888888888888888");
        BigInteger y = new BigInteger("888888888888888888888");

        int i = x.compareTo(y);
        assertNotNull(i);

    }


    // f. 100% multiple condition coverage

    // 1
    @Test
    // if(x.words == null && y.words == null) => x.words == null && y.words == null
    public void testfddsf() {
        BigInteger x = BigInteger.valueOf(66);
        BigInteger y = BigInteger.valueOf(88);

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    @Test
    // if(x.words == null && y.words == null) => x.words != null && y.words == null
    public void testdfjkafds() {
        byte[] xBytes = new byte[] { 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(-1, xBytes); // = -2^33
        BigInteger y = BigInteger.valueOf(88);

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    @Test
    // if(x.words == null && y.words == null) => x.words == null && y.words != null
    public void testzvvasdf() {
        BigInteger x = BigInteger.valueOf(88);
        byte[] yBytes = new byte[] { 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger y = new BigInteger(1, yBytes); // = 2^33

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    @Test
    // if(x.words == null && y.words == null) => x.words != null && y.words == null
    public void testfdfssa() {
        byte[] xBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(1, xBytes); // = 2^33 × (1 + 2^32)
        byte[] yBytes = new byte[] { 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger y = new BigInteger(1, yBytes); // = 2^33

        int result1 = x.compareTo(y);
        assertEquals(1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(y, result2);
        result2 = x.max(y);
        assertEquals(x, result2);
    }

    // 2
    @Test
    // (x.words == null && y.words == null) if(x.ival<y.ival) => x.ival<y.ival
    public void testdfdadf() {
        BigInteger x = BigInteger.valueOf(66);
        BigInteger y = BigInteger.valueOf(88);

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    @Test
    // (x.words == null && y.words == null) if(x.ival<y.ival) => x.ival>y.ival
    public void testdfda() {
        BigInteger x = BigInteger.valueOf(88);
        BigInteger y = BigInteger.valueOf(66);

        int result1 = x.compareTo(y);
        assertEquals(1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(y, result2);
        result2 = x.max(y);
        assertEquals(x, result2);
    }

    @Test
    // (x.words == null && y.words == null) if(x.ival<y.ival) => x.ival=y.ival
    public void testdffasfd() {
        BigInteger x = BigInteger.valueOf(88);
        BigInteger y = BigInteger.valueOf(88);

        int result1 = x.compareTo(y);
        assertEquals(0, result1);
        BigInteger result2 = x.min(y);
        assertEquals(y, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    // 3
    @Test
    // (x.words!=null || y.words!=null) if(x_negative != y_negative) =>
    // x_negative==false y_negative==true => x_negative != y_negative
    public void testfdsf() {
        byte[] xBytes = new byte[] { 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(1, xBytes); // = 2^33
        BigInteger y = BigInteger.valueOf(-88);

        int result1 = x.compareTo(y);
        assertEquals(1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(y, result2);
        result2 = x.max(y);
        assertEquals(x, result2);
    }

    @Test
    // (x.words!=null || y.words!=null) if (x_negative != y_negative) =>
    // x_negative==true y_negative==false => x_negative != y_negative
    public void testdf() {
        byte[] xBytes = new byte[] { 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(-1, xBytes); // = -2^33
        BigInteger y = BigInteger.valueOf(88);

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    @Test
    // (x.words!=null || y.words!=null) if (x_negative != y_negative) =>
    // x_negative==true y_negative==true => x_negative == y_negative
    public void testfafd() {
        byte[] xBytes = new byte[] { 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(-1, xBytes); // = -2^33
        byte[] yBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00 };
        BigInteger y = new BigInteger(-1, yBytes); // = -2^33(2^32 + 3)

        int result1 = x.compareTo(y);
        assertEquals(1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(y, result2);
        result2 = x.max(y);
        assertEquals(x, result2);
    }

    @Test
    // (x.words!=null || y.words!=null) if (x_negative != y_negative) =>
    // x_negative==false y_negative==false => x_negative == y_negative
    public void test1234() {
        byte[] xBytes = new byte[] { 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(1, xBytes); // = 2^33
        byte[] yBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00 };
        BigInteger y = new BigInteger(1, yBytes); // = 2^33(2^32 + 3)

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    // 4
    @Test
    // (x.words!=null || y.words!=null) x.negative==y.negative if(x_len != y_len) =>
    // x_len==y_len
    public void test324234() {
        byte[] xBytes = new byte[] { 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(1, xBytes); // = 2^33
        byte[] yBytes = new byte[] { 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00 };
        BigInteger y = new BigInteger(1, yBytes); // = 2^33 * 3

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    // 5
    @Test
    // (x.words!=null || y.words!=null) x.negative==y.negative x_len!=y_len
    // if((x_len>y_len) != x_negative) =>
    // x_len<y_len x_negative==false (x_len>y_len) == x_negative
    public void testkjlfdskjlf() {
        byte[] xBytes = new byte[] { 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(1, xBytes); // = 2^33
        byte[] yBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00 };
        BigInteger y = new BigInteger(1, yBytes); // = 2^33(2^32 + 3)

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    @Test
    // (x.words!=null || y.words!=null) x.negative==y.negative x_len!=y_len
    // if((x_len>y_len) != x_negative) =>
    // x_len<y_len x_negative==true => (x_len>y_len) != x_negative
    public void testjzkvkj() {
        byte[] xBytes = new byte[] { 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(-1, xBytes); // = 2^33
        byte[] yBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00 };
        BigInteger y = new BigInteger(-1, yBytes); // = 2^33(2^32 + 3)

        int result1 = x.compareTo(y);
        assertEquals(1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(y, result2);
        result2 = x.max(y);
        assertEquals(x, result2);
    }

    @Test
    // (x.words!=null || y.words!=null) x.negative==y.negative x_len!=y_len
    // if((x_len>y_len) != x_negative) =>
    // x_len>y_len x_negative==true => (x_len>y_len) == x_negative
    public void testsdffds() {
        byte[] xBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(-1, xBytes); // = -2^33(2^32 + 3)
        byte[] yBytes = new byte[] { 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger y = new BigInteger(-1, yBytes); // = -2^33

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    @Test
    // (x.words!=null || y.words!=null) x.negative==y.negative x_len!=y_len
    // if((x_len>y_len) != x_negative) =>
    // x_len>y_len x_negative==false (x_len>y_len) != x_negative
    public void testzdf() {
        byte[] xBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(1, xBytes); // = 2^33(2^32 + 3)
        byte[] yBytes = new byte[] { 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger y = new BigInteger(1, yBytes); // = 2^33

        int result1 = x.compareTo(y);
        assertEquals(1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(y, result2);
        result2 = x.max(y);
        assertEquals(x, result2);
    }


    // g. 100% modified condition/decision coverage
    // 1
    @Test
// if(x.words == null && y.words == null) => x.words == null && y.words == null
    public void testqqfjkjv() {
        BigInteger x = BigInteger.valueOf(66);
        BigInteger y = BigInteger.valueOf(88);

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }
    @Test
    public void testajfkjv() {
        byte[] xBytes = new byte[]{0x00, 0x02, 0x00, 0x00, 0x00, 0x00};
        BigInteger x = new BigInteger(-1, xBytes);   // = -2^33
        BigInteger y = BigInteger.valueOf(88);

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }
    @Test
// if(x.words == null && y.words == null) => x.words == null && y.words != null
    public void testnvnvv() {
        BigInteger x = BigInteger.valueOf(88);
        byte[] yBytes = new byte[]{0x00, 0x02, 0x00, 0x00, 0x00, 0x00};
        BigInteger y = new BigInteger(1, yBytes);   // = 2^33

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    // 2
    @Test
// (x.words == null && y.words == null) if(x.ival<y.ival) => x.ival<y.ival
    public void testfjwqjokfqe() {
        BigInteger x = BigInteger.valueOf(66);
        BigInteger y = BigInteger.valueOf(88);

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }
    @Test
    public void testjkqqjo() {
        BigInteger x = BigInteger.valueOf(88);
        BigInteger y = BigInteger.valueOf(66);

        int result1 = x.compareTo(y);
        assertEquals(1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(y, result2);
        result2 = x.max(y);
        assertEquals(x, result2);
    }
    @Test
    public void testdjqkkq() {
        BigInteger x = BigInteger.valueOf(88);
        BigInteger y = BigInteger.valueOf(88);

        int result1 = x.compareTo(y);
        assertEquals(0, result1);
        BigInteger result2 = x.min(y);
        assertEquals(y, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    // 3
    @Test
// (x.words!=null || y.words!=null) if (x_negative != y_negative) =>
// x_negative==true y_negative==true => x_negative == y_negative
    public void testdkjskff() {
        byte[] xBytes = new byte[]{0x00, 0x02, 0x00, 0x00, 0x00, 0x00};
        BigInteger x = new BigInteger(-1, xBytes);   // = -2^33
        byte[] yBytes = new byte[]{0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00};
        BigInteger y = new BigInteger(-1, yBytes);   // = -2^33(2^32 + 3)

        int result1 = x.compareTo(y);
        assertEquals(1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(y, result2);
        result2 = x.max(y);
        assertEquals(x, result2);
    }
    @Test
// (x.words!=null || y.words!=null) if(x_negative != y_negative) =>
// x_negative==false y_negative==true => x_negative != y_negative
    public void testdfjklq() {
        byte[] xBytes = new byte[]{0x00, 0x02, 0x00, 0x00, 0x00, 0x00};
        BigInteger x = new BigInteger(1, xBytes);   // = 2^33
        BigInteger y = BigInteger.valueOf(-88);

        int result1 = x.compareTo(y);
        assertEquals(1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(y, result2);
        result2 = x.max(y);
        assertEquals(x, result2);
    }
    @Test
// (x.words!=null || y.words!=null) if (x_negative != y_negative) =>
// x_negative==true y_negative==false => x_negative != y_negative
    public void testdfjklakqq() {
        byte[] xBytes = new byte[]{0x00, 0x02, 0x00, 0x00, 0x00, 0x00};
        BigInteger x = new BigInteger(-1, xBytes);   // = -2^33
        BigInteger y = BigInteger.valueOf(88);

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    // 4
    @Test
// (x.words!=null || y.words!=null) x.negative==y.negative if(x_len != y_len) => x_len==y_len
    public void testdfakjjka() {
        byte[] xBytes = new byte[]{0x00, 0x02, 0x00, 0x00, 0x00, 0x00};
        BigInteger x = new BigInteger(1, xBytes);   // = 2^33
        byte[] yBytes = new byte[]{0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00};
        BigInteger y = new BigInteger(1, yBytes); // = 2^33 * 3

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }

    // 5
    @Test
// (x.words!=null || y.words!=null) x.negative==y.negative x_len!=y_len if((x_len>y_len) != x_negative) =>
// x_len>y_len x_negative==true => (x_len>y_len) == x_negative
    public void testjvnvvn() {
        byte[] xBytes = new byte[]{0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00};
        BigInteger x = new BigInteger(-1, xBytes);   // = -2^33(2^32 + 3)
        byte[] yBytes = new byte[]{0x00, 0x02, 0x00, 0x00, 0x00, 0x00};
        BigInteger y = new BigInteger(-1, yBytes);   // = -2^33

        int result1 = x.compareTo(y);
        assertEquals(-1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(x, result2);
        result2 = x.max(y);
        assertEquals(y, result2);
    }
    @Test
// (x.words!=null || y.words!=null) x.negative==y.negative x_len!=y_len if((x_len>y_len) != x_negative) =>
// x_len<y_len x_negative==true => (x_len>y_len) != x_negative
    public void testdjfklkjflwe() {
        byte[] xBytes = new byte[]{0x00, 0x02, 0x00, 0x00, 0x00, 0x00};
        BigInteger x = new BigInteger(-1, xBytes);   // = 2^33
        byte[] yBytes = new byte[]{0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00};
        BigInteger y = new BigInteger(-1, yBytes);   // = 2^33(2^32 + 3)

        int result1 = x.compareTo(y);
        assertEquals(1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(y, result2);
        result2 = x.max(y);
        assertEquals(x, result2);
    }
    @Test
// (x.words!=null || y.words!=null) x.negative==y.negative x_len!=y_len if((x_len>y_len) != x_negative) =>
// x_len>y_len x_negative==false (x_len>y_len) != x_negative
    public void testdfjksljl() {
        byte[] xBytes = new byte[]{0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00};
        BigInteger x = new BigInteger(1, xBytes);   // = 2^33(2^32 + 3)
        byte[] yBytes = new byte[]{0x00, 0x02, 0x00, 0x00, 0x00, 0x00};
        BigInteger y = new BigInteger(1, yBytes);   // = 2^33

        int result1 = x.compareTo(y);
        assertEquals(1, result1);
        BigInteger result2 = x.min(y);
        assertEquals(y, result2);
        result2 = x.max(y);
        assertEquals(x, result2);
    }

    //全定义覆盖

    @Test
    public void testdfjkkg() {
        BigInteger x = new BigInteger("5");
        BigInteger y = new BigInteger("-10");
        assertTrue(x.compareTo(y) > 0);
    }

    @Test
    public void testdfsjkjgj() {
        BigInteger x = new BigInteger("100000000000000000000");
        BigInteger y = new BigInteger("100");
        assertTrue(x.compareTo(y) > 0);
    }

    @Test
    public void testdfkllk() {
        BigInteger x = new BigInteger("123456789");
        BigInteger y = new BigInteger("123456789");
        assertEquals(0, x.compareTo(y));
    }


    // 全用例覆盖

    @Test
    public void test412121() {

        BigInteger x = new BigInteger("888888888888888888888");
        BigInteger y = new BigInteger("-888888888888888888888");

        int i = x.compareTo(y);
        assertEquals(1,i);

    }

    @Test
    public void test4121121() {

        BigInteger x = new BigInteger("-888888888888888888888");
        BigInteger y = new BigInteger("888888888888888888888");

        int i = x.compareTo(y);
        assertEquals(-1,i);

    }

    @Test
    public void test412112121() {

        BigInteger x = new BigInteger("888");
        BigInteger y = new BigInteger("8888888888888888888888");

        int i = x.compareTo(y);
        assertEquals(-1,i);

    }

    @Test
    public void test4121112121() {

        BigInteger x = new BigInteger("-888");
        BigInteger y = new BigInteger("-8888888888888888888888");

        int i = x.compareTo(y);
        assertEquals(1,i);

    }

    @Test
    public void test4121121121() {

        BigInteger x = new BigInteger("-888888888888888888888");
        BigInteger y = new BigInteger("-888");

        int i = x.compareTo(y);
        assertEquals(-1,i);

    }

    @Test
    public void test412112121121() {

        BigInteger x = new BigInteger("888888888888888888888");
        BigInteger y = new BigInteger("888");

        int i = x.compareTo(y);
        assertEquals(1,i);

    }

    @Test
    public void test312211() {

        BigInteger x = new BigInteger("888888888888888888888");
        BigInteger y = new BigInteger("888888888888888888888");

        int i = x.compareTo(y);
        assertEquals(0,i);

    }

    @Test
    public void test3121211() {

        BigInteger x = new BigInteger("888");
        BigInteger y = new BigInteger("888");

        int i = x.compareTo(y);
        assertEquals(0,i);

    }

    @Test
    public void test31212111() {

        BigInteger x = new BigInteger("888");
        BigInteger y = new BigInteger("8888");

        int i = x.compareTo(y);
        assertEquals(-1,i);

    }

    @Test
    public void test3121122111() {

        BigInteger x = new BigInteger("8888");
        BigInteger y = new BigInteger("888");

        int i = x.compareTo(y);
        assertEquals(1,i);

    }

}
