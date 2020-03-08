import java.io.PrintStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class Base36
{
  public static void main(String[] args)
  {
    int base = 36;
    String s = "123456789";
    System.out.println("original string: " + s);
    byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
    String base36 = new BigInteger(1, bytes).toString(base);
    System.out.println("base36: " + base36);
    bytes = base36.getBytes();
    bytes = new BigInteger(base36, base).toByteArray();
    String original = new String(bytes, StandardCharsets.UTF_8);
    System.out.println("original: " + original);
  }
}