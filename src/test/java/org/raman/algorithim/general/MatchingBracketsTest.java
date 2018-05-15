package org.raman.algorithim.general;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by haim on 29/04/2018.
 */
public class MatchingBracketsTest {
    @Test
    public void testMatchingBasic() {
        MatchingBrackets matcher = new MatchingBrackets();

        assertThat(matcher.isBalanced("(]"), Is.is(false));
        assertThat(matcher.isBalanced("{[(])}"), Is.is(false));
        assertThat(matcher.isBalanced("{[()]}"), Is.is(true));
        assertThat(matcher.isBalanced("{{[[(())]]}}"), Is.is(true));
    }

    @Test
    public void testMatchingEdge() {
        MatchingBrackets matcher = new MatchingBrackets();
        assertThat(matcher.isBalanced(""), Is.is(true));
        assertThat(matcher.isBalanced("{"), Is.is(false));
        assertThat(matcher.isBalanced("}"), Is.is(false));
        assertThat(matcher.isBalanced("{{[[((a))]]}}"), Is.is(true));
    }
}