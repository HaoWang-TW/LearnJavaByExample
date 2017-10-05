package RegPattern;
import com.sun.source.tree.AssertTree;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegExpression {
    @Test
    public void findTest() {
        String target = "abc";
        String source = "abcabcdef";
        Pattern pattern = Pattern.compile(target);
        assertTrue(pattern.matcher(source).lookingAt()); // only if a prefix of source matches the tartget pattern
        assertTrue(pattern.matcher(source).find());
        assertFalse(pattern.matcher(source).find(4));
    }
    @Test
    public void matchTest() {
        String target = "too.*sample";
        String source = "too young to sample";
        String source2 = "too young to sample, hahaha";
        Pattern pattern = Pattern.compile(target);
        assertTrue(pattern.matcher(source).matches());// only if whole source string matches
        Pattern pattern2 = Pattern.compile(target);
        assertFalse(pattern2.matcher(source2).matches());
    }
    @Test
    public void findAllMatches() {
        String target = "abc";
        String source = "abcabcabcabca";
        Pattern patten = Pattern.compile(target);
        Matcher matcher = patten.matcher(source);
        while(matcher.find()) {
            System.out.println(matcher.start() + "&" + matcher.end() + source.substring(matcher.start(), matcher.end()));
        }
        matcher = matcher.reset("dffabc");
        System.out.println(matcher.start() + "&" + matcher.end() + source.substring(matcher.start(), matcher.end()));


    }

    @Test
    public void getYearMonthDay() {
        String[] sentences = {
                "wew2017-02-23",
                "She's birthday is 2017-12-14",
                "2013-12-12 is the date he came back to China",
                "Today is 2017-10-02, the day after national day",
                "a normal sentence"
        };
        Pattern pattern = Pattern.compile(".*(\\d{4})-(\\d{2})-(\\d{2}).*");
        for(String sentence: sentences) {
            Matcher matcher = pattern.matcher(sentence);
            if(!matcher.matches()) {
                System.out.print("\"" + sentence + "\" doesn't contain a date");
                return;
            }
            System.out.print("year: " + matcher.group(1));
            System.out.print("month: " + matcher.group(2));
            System.out.println("day: " + matcher.group(3));
        }
    }

}
