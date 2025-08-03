package student.junit;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void testPrintNumber(){
        StringUtil.printNumber("admin");
        StringUtil.printNumber(null);

    }

    @Test
    public void testGetMaxIndex(){
        int index1 = StringUtil.getMaxIndex(null);
        System.out.println(index1);
        int index2 = StringUtil.getMaxIndex("admin");
        System.out.println(index2);
        Assert.assertEquals("bug",4,index2);
    }
}
