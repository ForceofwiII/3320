import com.fow.BigInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GcdTest {

    // 1. test case for 100% Statement Coverage

    @Test
    public void testskjdfkj() {
        BigInteger x = BigInteger.valueOf(0);
        BigInteger y = BigInteger.valueOf(42);

        BigInteger result = x.gcd(y);
        assertNotNull(result);

    }

    @Test
    public void testfkdsljklv() {
        BigInteger x = BigInteger.valueOf(-18);
        BigInteger y = BigInteger.valueOf(-12);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void testsjdfikjlf() {

        byte[] xBytes = new byte[] { (byte) 0xFF, (byte) 0xFF, 0x01, 0x01 };
        byte[] yBytes = new byte[] { 0x00, (byte) 0x88, 0x66, 0x66 };

        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = new BigInteger(1, yBytes);

        BigInteger result = x.gcd(y);
        assertNotNull(result);

    }

    @Test
    public void test43289() {
        BigInteger x = BigInteger.valueOf(666666666);
        byte[] yBytes = new byte[] { (byte) 0xFF, 0x11, 0x22, 0x33 };
        BigInteger y = new BigInteger(1, yBytes);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void test328u4() {
        byte[] xBytes = new byte[] { (byte) 0xFE, 0x55, 0x66, 0x77 };
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(0);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    // 100% 分支覆盖（Branch/Decision Coverage）

    @Test
    public void test2349098() {

        byte[] xBytes = new byte[] { (byte) 0xFF, (byte) 0xFF, 0x01, 0x01 };
        byte[] yBytes = new byte[] { 0x00, (byte) 0x88, 0x66, 0x66 };

        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = new BigInteger(1, yBytes);

        BigInteger result = x.gcd(y);
        assertNotNull(result);

    }

    @Test
    public void test498230() {
        BigInteger x = BigInteger.valueOf(666666666);
        byte[] yBytes = new byte[] { (byte) 0xFF, 0x11, 0x22, 0x33 };
        BigInteger y = new BigInteger(1, yBytes);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void test438294() {
        byte[] xBytes = new byte[] { (byte) 0xFE, 0x55, 0x66, 0x77 };
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(0);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void test3942814() {
        BigInteger x = BigInteger.valueOf(-36);
        BigInteger y = BigInteger.valueOf(-60);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void test28314() {
        BigInteger x = BigInteger.valueOf(0);
        BigInteger y = BigInteger.valueOf(100);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void test4823() {
        byte[] xBytes = new byte[] { 0x01, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(0);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    // d. test cases to achieve 100% condition coverage

    @Test
    // if(words==null) => words==null
    public void testadjfklfa() {
        BigInteger x = BigInteger.valueOf(36);
        BigInteger y = BigInteger.valueOf(42);

        BigInteger gcd = x.gcd(y);
        assertEquals(BigInteger.valueOf(6), gcd);
    }
    @Test
// if(words==null) => words!=null
    public void testjklfkjfv() {
        byte[] xBytes = new byte[]{0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00}; // = 2^33 = 8589934592
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(-12);

        BigInteger gcd = x.gcd(y);
        assertEquals(BigInteger.valueOf(4), gcd);
    }

    // 2
    @Test
// words==null if(xval==0) => xval==0
    public void testfjkajfj() {
        BigInteger x = BigInteger.valueOf(0);
        BigInteger y = BigInteger.valueOf(42);

        BigInteger gcd = x.gcd(y);
        assertEquals(y, gcd);
    }
    @Test
// words==null if(xval==0) => xval!=0
    public void testjkdsfkjv() {
        BigInteger x = BigInteger.valueOf(36);
        BigInteger y = BigInteger.valueOf(42);

        BigInteger gcd = x.gcd(y);
        assertEquals(BigInteger.valueOf(6), gcd);
    }

    // 3
    @Test
// words==null xval!=0 if (y.words == null && xval != Integer.MIN_VALUE && yval != Integer.MIN_VALUE) =>
// y.words != null && xval != Integer.MIN_VALUE && yval != Integer.MIN_VALUE
    public void testdsfjkajkv() {
        BigInteger x = BigInteger.valueOf(12);
        byte[] yBytes = new byte[]{0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00}; // = 2^33 = 8589934592
        BigInteger y = new BigInteger(1, yBytes);

        BigInteger gcd = x.gcd(y);
        assertEquals(BigInteger.valueOf(4), gcd);
    }
    @Test
// words==null xval!=0 if (y.words == null && xval != Integer.MIN_VALUE && yval != Integer.MIN_VALUE) =>
// y.words == null && xval == Integer.MIN_VALUE && yval != Integer.MIN_VALUE
    public void testqqiqff() {
        BigInteger x = BigInteger.valueOf(Integer.MIN_VALUE);
        BigInteger y = BigInteger.valueOf(2048);

        BigInteger gcd = x.gcd(y);
        assertEquals(y, gcd);
    }
    @Test
// words==null xval!=0 if (y.words == null && xval != Integer.MIN_VALUE && yval != Integer.MIN_VALUE) =>
// y.words == null && xval == Integer.MIN_VALUE && yval != Integer.MIN_VALUE
    public void testfjsdjv() {
        BigInteger x = BigInteger.valueOf(-16);
        BigInteger y = BigInteger.valueOf(Integer.MIN_VALUE);

        BigInteger gcd = x.gcd(y);
        assertEquals(BigInteger.valueOf(16), gcd);
    }

    // 4
    @Test
// words==null xval!=0 (y.words == null && xval != Integer.MIN_VALUE && yval != Integer.MIN_VALUE)
// if(xval<0) if(yval<0) => xval>=0 y<0
    public void testvkjvjvs() {
        BigInteger x = BigInteger.valueOf(16777216);
        BigInteger y = BigInteger.valueOf(-12);

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(4), result);
    }
    @Test
// words==null xval!=0 (y.words == null && xval != Integer.MIN_VALUE && yval != Integer.MIN_VALUE)
// if(xval<0) if(yval<0) => xval<0 yval>=0
    public void testdfjgjkg() {
        BigInteger x = BigInteger.valueOf(-64);
        BigInteger y = BigInteger.valueOf(24);

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(8), result);
    }

    // 5
    @Test
// words!=null if(y.words==null) => y.words==null
    public void testvnkijds() {
        byte[] xBytes = new byte[]{0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00}; // = 2^33 = 8589934592
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(24);

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(8), result);
    }
    @Test
// words!=null if(y.words==null) => y.words!=null
    public void testfdsjiigjfk() {
        byte[] xBytes = new byte[]{0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00}; // = 2^33 = 8589934592
        BigInteger x = new BigInteger(1, xBytes);
        byte[] yBytes = new byte[]{0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00}; // = 2^33 * 3 = 25769803776
        BigInteger y = new BigInteger(1, yBytes);

        BigInteger result = x.gcd(y);
        assertEquals(x, result);
    }

    // 6
    @Test
// words!=null y.words==null if(yval==0) => yval!=0
    public void testdfijikg() {
        BigInteger x = BigInteger.valueOf(16777216);
        BigInteger y = BigInteger.valueOf(16);

        BigInteger result = x.gcd(y);
        assertEquals(y, result);
    }
    @Test
// words!=null y.words==null if(yval==0) => yval==0
    public void testfdsjkgj() {
        BigInteger x = BigInteger.valueOf(-16777216);
        BigInteger y = BigInteger.valueOf(0);

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(16777216), result);
    }

    // 7
    @Test
// words!=null y.words!=null if(xval>yval) => xval>yval
    public void testdjksgkjkvbg() {
        byte[] xBytes = new byte[]{0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00};
        BigInteger x = new BigInteger(1, xBytes);   // = 2^33 × (1 + 2^32)
        byte[] yBytes = new byte[]{0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00}; // = 2^33 = 8589934592
        BigInteger y = new BigInteger(1, yBytes);

        BigInteger result = x.gcd(y);
        assertEquals(y, result);
    }
    @Test
// words!=null y.words!=null if(xval>yval) => xval<=yval
    public void testfdsjkgfkjg() {
        byte[] xBytes = new byte[]{0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00};
        BigInteger x = new BigInteger(1, xBytes);   // = 2^33 × (1 + 2^32)
        byte[] yBytes = new byte[]{0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00};
        BigInteger y = new BigInteger(1, yBytes);

        BigInteger result = x.gcd(y);
        assertEquals(x, result);
    }

    // 100% 条件决策覆盖

    @Test
    public void testfdsakjv() {

        byte[] xBytes = new byte[] { (byte) 0xFF, (byte) 0xFF, 0x01, 0x01 };
        byte[] yBytes = new byte[] { 0x00, (byte) 0x88, 0x66, 0x66 };

        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = new BigInteger(1, yBytes);

        BigInteger result = x.gcd(y);
        assertNotNull(result);

    }

    @Test
    public void testdkjfslkvj() {
        BigInteger x = BigInteger.valueOf(666666666);
        byte[] yBytes = new byte[] { (byte) 0xFF, 0x11, 0x22, 0x33 };
        BigInteger y = new BigInteger(1, yBytes);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void testfsadklvc() {
        byte[] xBytes = new byte[] { (byte) 0xFE, 0x55, 0x66, 0x77 };
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(0);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void testqoe() {
        BigInteger x = BigInteger.valueOf(-36);
        BigInteger y = BigInteger.valueOf(-60);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void testdskjfkj() {
        BigInteger x = BigInteger.valueOf(0);
        BigInteger y = BigInteger.valueOf(100);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void testdfskljaj() {
        byte[] xBytes = new byte[] { 0x01, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(0);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void testbbbf() {
        BigInteger x = BigInteger.valueOf(16777216);
        BigInteger y = BigInteger.valueOf(24);

        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void testdjkkjlv() {
        BigInteger x = BigInteger.valueOf(Integer.MIN_VALUE);
        BigInteger y = BigInteger.valueOf(2048);

        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void testsdkflj() {
        BigInteger x = BigInteger.valueOf(2048);
        BigInteger y = BigInteger.valueOf(Integer.MIN_VALUE);

        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void testkljklf() {
        byte[] xBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(1, xBytes);
        byte[] yBytes = new byte[] { 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00 };
        BigInteger y = new BigInteger(1, yBytes);

        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    // 100% 多条件覆盖

    @Test
    public void testfsdkj() {

        byte[] xBytes = new byte[] { (byte) 0xFF, (byte) 0xFF, 0x01, 0x01 };
        byte[] yBytes = new byte[] { 0x00, (byte) 0x88, 0x66, 0x66 };

        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = new BigInteger(1, yBytes);

        BigInteger result = x.gcd(y);
        assertNotNull(result);

    }

    @Test
    public void testdfsfo() {
        BigInteger x = BigInteger.valueOf(666666666);
        byte[] yBytes = new byte[] { (byte) 0xFF, 0x11, 0x22, 0x33 };
        BigInteger y = new BigInteger(1, yBytes);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void testljksfv() {
        byte[] xBytes = new byte[] { (byte) 0xFE, 0x55, 0x66, 0x77 };
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(0);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void testdsofij() {
        BigInteger x = BigInteger.valueOf(-36);
        BigInteger y = BigInteger.valueOf(-60);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void test12345() {
        BigInteger x = BigInteger.valueOf(0);
        BigInteger y = BigInteger.valueOf(100);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void test1234() {
        byte[] xBytes = new byte[] { 0x01, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(0);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void test123() {
        BigInteger x = BigInteger.valueOf(16777216);
        BigInteger y = BigInteger.valueOf(24);

        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void test1234341() {
        BigInteger x = BigInteger.valueOf(Integer.MIN_VALUE);
        BigInteger y = BigInteger.valueOf(2048);

        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void testsdjk() {
        BigInteger x = BigInteger.valueOf(2048);
        BigInteger y = BigInteger.valueOf(Integer.MIN_VALUE);

        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void test9999() {
        byte[] xBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(1, xBytes);
        byte[] yBytes = new byte[] { 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00 };
        BigInteger y = new BigInteger(1, yBytes);

        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    public void testsdklf() {
        BigInteger x = BigInteger.valueOf(Integer.MIN_VALUE);

        byte[] yBytes = new byte[] {
                0x0C, 0x49, 0x7A, (byte) 0x96, (byte) 0x81, 0x63, (byte) 0xF0, 0x00, 0x00, 0x00, 0x00
        };
        BigInteger y = new BigInteger(1, yBytes);

        BigInteger result = x.gcd(y);
        assertNotNull(result);

    }

    @Test
    void test9032() {
        BigInteger x = BigInteger.valueOf(1);
        byte[] yBytes = new byte[] {
                0x0C, 0x49, 0x7A, (byte) 0x96, (byte) 0x81, 0x63, (byte) 0xF0, 0x00, 0x00, 0x00, 0x00
        };
        BigInteger y = new BigInteger(1, yBytes);
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    void testzz() {
        BigInteger x = new BigInteger("-2147483648");
        BigInteger y = new BigInteger("-2147483648");
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    void testvcx() {
        BigInteger x = new BigInteger("-2147483648");
        BigInteger y = new BigInteger("66");
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    void testsdj() {
        BigInteger x = new BigInteger("666");
        BigInteger y = new BigInteger("-2147483648");
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    @Test
    void testdsf() {
        BigInteger x = new BigInteger("666");
        BigInteger y = new BigInteger("8848");
        BigInteger result = x.gcd(y);
        assertNotNull(result);
    }

    // 100% modified condition/decision coverage.

    @Test
    // 1
    // if(word==null) => word==null
    public void testdsfkjaf() {
        BigInteger x = BigInteger.valueOf(2048); // x.words == null
        byte[] yBytes = new byte[] { 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00 }; // = 2^33 * 3 = 25769803776
        BigInteger y = new BigInteger(1, yBytes);

    

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(2048), result);
    }

    @Test
    // if(word==null) => word!=null
    public void testzmmnv() {
        byte[] xBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 }; // = 2^33 = 8589934592
        BigInteger x = new BigInteger(1, xBytes);
        byte[] yBytes = new byte[] { 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00 }; // = 2^33 * 3 = 25769803776
        BigInteger y = new BigInteger(1, yBytes);

       

        BigInteger result = x.gcd(y);
        assertEquals(x, result);
    }

    @Test
    // 2
    // if(word==null) if(xval==0) => xval==0
    public void testfdjkasdfkjdf() {
        BigInteger x = BigInteger.valueOf(0);
        BigInteger y = BigInteger.valueOf(-42);

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(42), result);
    }

    @Test
    // word==null if(xval==0) => xval!=0
    public void testdafjkkfjqqq() {
        BigInteger x = BigInteger.valueOf(-18);
        BigInteger y = BigInteger.valueOf(42);

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(6), result);
    }

    @Test
    // 3
    // word==null xval!=0 if(y.words == null && xval != Integer.MIN_VALUE && yval !=
    // Integer.MIN_VALUE)
    // Bbasic test => y.words==null && xval != Integer.MIN_VALUE && yval !=
    // Integer.MIN_VALUE
    public void testkfnmznv() {
        BigInteger x = BigInteger.valueOf(-18);
        BigInteger y = BigInteger.valueOf(42);

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(6), result);
    }

    @Test
    // word==null xval!=0 if(y.words == null && xval != Integer.MIN_VALUE && yval !=
    // Integer.MIN_VALUE)
    // test_1 => y.words!=null
    public void testdfafvzz() {
        BigInteger x = BigInteger.valueOf(-16);
        byte[] yBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 }; // = 2^33 = 8589934592
        BigInteger y = new BigInteger(1, yBytes);

      

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(16), result);
    }

    @Test
    // word==null xval!=0 if(y.words == null && xval != Integer.MIN_VALUE && yval !=
    // Integer.MIN_VALUE)
    // test_1 => xval == Integer.MIN_VALUE
    public void test123431df() {
        BigInteger x = BigInteger.valueOf(Integer.MIN_VALUE);
        BigInteger y = BigInteger.valueOf(2);

     

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(2), result);
    }

    @Test
    // word==null xval!=0 if(y.words == null && xval != Integer.MIN_VALUE && yval !=
    // Integer.MIN_VALUE)
    // test_1 => xval == Integer.MIN_VALUE
    public void testvnnf() {
        BigInteger x = BigInteger.valueOf(2);
        BigInteger y = BigInteger.valueOf(Integer.MIN_VALUE);

       

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(2), result);
    }

    @Test
    // 4
    // word==null xval!=0 (y.words == null && xval != Integer.MIN_VALUE && yval
    // !=Integer.MIN_VALUE) if(xval<0)=> xval < 0
    public void testdsafdssdf() {
        BigInteger x = BigInteger.valueOf(-16);
        BigInteger y = BigInteger.valueOf(24);

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(8), result);
    }

    @Test
    // word==null xval!=0 (y.words == null && xval != Integer.MIN_VALUE && yval
    // !=Integer.MIN_VALUE) if(xval<0)=> xval > 0
    public void testqjkfvncmnv() {
        BigInteger x = BigInteger.valueOf(16);
        BigInteger y = BigInteger.valueOf(24);

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(8), result);
    }

    @Test
    // 5
    // word==null xval!=0 (y.words == null && xval != Integer.MIN_VALUE && yval
    // !=Integer.MIN_VALUE) xval>0 if(yval<0)=> yval < 0
    public void test2341342234() {
        BigInteger x = BigInteger.valueOf(16);
        BigInteger y = BigInteger.valueOf(-24);

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(8), result);
    }

    @Test
    // word==null xval!=0 (y.words == null && xval != Integer.MIN_VALUE && yval
    // !=Integer.MIN_VALUE) xval>0 if(yval<0)=> yval > 0
    public void test3412387487() {
        BigInteger x = BigInteger.valueOf(16);
        BigInteger y = BigInteger.valueOf(24);

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(8), result);
    }

    @Test
    // 6
    // word!=null if(y.words==null) => y.words==null
    public void testdsaajkfkj() {
        byte[] xBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 }; // = 2^33 = 8589934592
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(24);

      

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(8), result);
    }

    @Test
    // word!=null if(y.words==null) => y.words!=null
    public void test13423423432452() {
        byte[] xBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 }; // = 2^33 = 8589934592
        BigInteger x = new BigInteger(1, xBytes);
        byte[] yBytes = new byte[] { 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00 }; // = 2^33 * 3 = 25769803776
        BigInteger y = new BigInteger(1, yBytes);

       

        BigInteger result = x.gcd(y);
        assertEquals(x, result);
    }

    @Test
    // 7
    // word!=null y.words==null if(yval==0) => yval==0
    public void testdjkfklsjklfklfdfkjlkfjd() {
        byte[] xBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 }; // = 2^33 = 8589934592
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(0);

       

        BigInteger result = x.gcd(y);
        assertEquals(x, result);
    }

    @Test
    // word!=null y.words==null if(yval==0) => yval!=0
    public void test12342432o() {
        byte[] xBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 }; // = 2^33 = 8589934592
        BigInteger x = new BigInteger(1, xBytes);
        BigInteger y = BigInteger.valueOf(24);

       

        BigInteger result = x.gcd(y);
        assertEquals(BigInteger.valueOf(8), result);
    }

    @Test
    // 8
    // word!=null y.words!=null if(xval > yval) => xval <= yval
    public void testdsfjkakadklffkjl() {
        byte[] xBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(1, xBytes); // = 2^33
        byte[] yBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00 };
        BigInteger y = new BigInteger(1, yBytes); // = 2^33(2^32 + 3)

       
        BigInteger result = x.gcd(y);
        assertEquals(x, result);
    }

    @Test
    // word!=null y.words!=null if(xval > yval) => xval > yval
    public void testjfkaskdljf() {
        byte[] xBytes = new byte[] { 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger x = new BigInteger(1, xBytes); // = 2^33 × (1 + 2^32)
        byte[] yBytes = new byte[] { 0x00, 0x02, 0x00, 0x00, 0x00, 0x00 };
        BigInteger y = new BigInteger(1, yBytes); // = 2^33

        

        BigInteger result = x.gcd(y);
        assertEquals(y, result);
    }

    //全定义覆盖

    @Test
    public void testqkjkjfkjdv() {
        BigInteger x = new BigInteger("18");
        BigInteger y = new BigInteger("12");
        assertEquals(new BigInteger("6"), x.gcd(y));
    }

    @Test
    public void testfdjskfqk() {
        BigInteger x = new BigInteger("0");
        BigInteger y = new BigInteger("25");
        assertEquals(new BigInteger("25"), x.gcd(y));
    }

    @Test
    public void testdkjfldjv() {
        BigInteger x = new BigInteger("12345678901234567890");
        BigInteger y = new BigInteger("98765432109876543210");
        BigInteger result = x.gcd(y);
        assertTrue(result.compareTo(BigInteger.ONE) >= 0);

    }




    // 全用例覆盖

    @Test
    void testjsldk() {
        BigInteger x = new BigInteger("0");
        BigInteger y = new BigInteger("8888");
        BigInteger result = x.gcd(y);
        assertEquals(new BigInteger("8888"),result);
    }

    @Test
    void test12() {
        BigInteger x = new BigInteger("666");
        BigInteger y = new BigInteger("8888");
        BigInteger result = x.gcd(y);
        assertEquals(new BigInteger("2"),result);
    }

    @Test
    void test1122() {
        BigInteger x = new BigInteger("-666");
        BigInteger y = new BigInteger("-8888");
        BigInteger result = x.gcd(y);
        assertEquals(new BigInteger("2"),result);
    }

    @Test
    public void test412112121121() {

        BigInteger x = new BigInteger("-2147483648");
        BigInteger y = new BigInteger("888");

        BigInteger result = x.gcd(y);
        assertEquals(new BigInteger("8"),result);
    }

    @Test
    public void test41211212112121() {

        BigInteger x = new BigInteger("-2147483648");
        BigInteger y = new BigInteger("0");

        BigInteger result = x.gcd(y);
        assertEquals(new BigInteger("2147483648"),result);
    }

    @Test
    public void test41211212121121() {

        BigInteger x = new BigInteger("888888888888888888888");
        BigInteger y = new BigInteger("888");

        BigInteger result = x.gcd(y);
        assertEquals(new BigInteger("888"),result);
    }

    @Test
    public void test4121121221121() {

        BigInteger x = new BigInteger("888");
        BigInteger y = new BigInteger("888888888888888888888888");

        BigInteger result = x.gcd(y);
        assertEquals(new BigInteger("888"),result);
    }

}
