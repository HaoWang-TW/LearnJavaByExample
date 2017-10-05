import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class String01 {
    private String str = "abcabc";
    @Test
    public void getStringLength() {
        Assert.assertEquals(6, str.length());
    }
    @Test
    public void getCharByIndex() {
        Assert.assertEquals('b', str.charAt(1));
    }
    @Test
    public void getCharIndex() {
        Assert.assertEquals(2, str.indexOf('c'));
        Assert.assertEquals(2, str.indexOf("c"));
        Assert.assertEquals(5, str.indexOf("c", 3));
        Assert.assertEquals(5, str.lastIndexOf('c'));
        Assert.assertEquals(5, str.lastIndexOf("c",5));
    }
    @Test
    public void compareBetweenStrings() {
        // can't use == to compare string
        Assert.assertFalse("abcabc".substring(0,3) == "abc");
        Assert.assertTrue(new String("abcabc") != str);
        Assert.assertTrue(Sample.str == str);
        Assert.assertTrue("b".compareTo("c") < 0);
        Assert.assertTrue("b".compareTo("a") > 0);
        Assert.assertTrue("b".compareTo("b") == 0);
        Assert.assertTrue("ABC".equalsIgnoreCase("abc"));
        Assert.assertTrue(Sample.str.equals(str));
    }
    @Test
    public void getSubString() {
        Assert.assertEquals("abc", "  abc   ".trim());
        Assert.assertEquals("abc", "  abc\t\n".trim());
        Assert.assertEquals("abc", str.substring(0,3));
        Assert.assertEquals("abc", str.substring(3));
    }
    @Test
    public void replace() {
        Assert.assertEquals("abc", "abcdef".replace("def", ""));
        Assert.assertEquals("", "abcabc".replace("abc", ""));
        Assert.assertEquals("cbcabc", "abcabc".replaceFirst("a", "c"));
        Assert.assertEquals("cbccbc", "abcabc".replaceAll("a", "c"));
    }

    @Test
    public void startOrEndWith() {
        Assert.assertTrue("abc".startsWith("a"));
        Assert.assertTrue("abc".startsWith("b", 1));
        Assert.assertTrue("abc".endsWith("c"));
    }
    @Test
    public void toLowerOrUpperCase() {
        Assert.assertEquals("ABC", "abc".toLowerCase());
        Assert.assertEquals("abc", "ABC".toLowerCase());
    }
    @Test
    public void useStringBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append("12");
        builder.append(1);
        builder.append('c');
        Assert.assertEquals("121c", builder.toString());
    }

}
 class Sample {
    public static String str = "abcabc";
}
