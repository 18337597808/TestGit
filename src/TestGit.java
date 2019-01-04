import org.junit.Test;

import java.io.*;

public class TestGit {
   @Test
    public void test() throws IOException {
        OutputStream out = null;
        for (int i = 0; i < 10; i++) {
           // System.out.println(i);
            out = new DataOutputStream(new FileOutputStream("d:wangss.txt"));
            ((DataOutputStream) out).writeInt(i);
        }
        out.close();
    }

}
