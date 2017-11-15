package object;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ObjectTest {
    /**
     * override toString method
     */
    @Test
    public void shouldCallToStringMethod() throws Exception {

    }

    @Test
    public void shouldCompareReference() throws Exception {
        PrimaryStudent wang1 = new PrimaryStudent("wang");
        PrimaryStudent wang2 = new PrimaryStudent("wang");
        assertThat(false, is(wang1 == wang2));
        assertThat(true, is(wang1.equals(wang2)));
        assertThat(false, is(wang1.hashCode() == (wang2.hashCode()))); // bad
    }

    /**
     * A properly written hashCode() method will follow these rules:
     * 1. repeatable
     * 2. consistent with equality
     * 3. distinct objects should produce distinct hashCodes
     */

    @Test
    public void shouldHaveSameHashCode() throws Exception {
        JuniorStudent hao = new JuniorStudent("hao");
        JuniorStudent hao2 = new JuniorStudent("hao");
        assertThat(true, is(hao.equals(hao2)));
        assertThat(true, is(hao.hashCode() == hao2.hashCode()));  // good
    }

    /**
     * use shutdown hook
     */
    

    class PrimaryStudent {
        private String name;

        public PrimaryStudent(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PrimaryStudent primaryStudent = (PrimaryStudent) o;

            return name != null ? name.equals(primaryStudent.name) : primaryStudent.name == null;
        }

    }

    class JuniorStudent extends PrimaryStudent {

        public JuniorStudent(String name) {
            super(name);
        }

        @Override
        public int hashCode() {
            return super.name.length() % 20;
        }
    }
}
