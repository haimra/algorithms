package org.raman.algorithim.general;

import java.util.*;

/**
 * Created by haim on 29/04/2018.
 */
public class MatchingBrackets {

    static Map<Character, Character> matching = new HashMap<>();
    static Set<Character> opening = new HashSet<>();
    static Set<Character> closing = new HashSet<>();

    static {
        opening.add('{');
        opening.add('(');
        opening.add('[');
        closing.add('}');
        closing.add(')');
        closing.add(']');
        matching.put('{', '}');
        matching.put('(', ')');
        matching.put('[', ']');
    }

    public boolean isBalanced(String expression) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i < expression.length()) {
            char c = expression.charAt(i);
            if (opening.contains(c)) {
               s.push(c);
            } else if (closing.contains(c)) {
                if (!s.isEmpty()) {
                    Character pop = s.pop();
                    if (c != matching.get(pop).charValue()) {
                        //if we found a closing Brackets
                        // and we are not matching
                        return false;
                    }
                } else {
                    //if we found a closing Brackets
                    // and the stack is empty
                    return false;
                }
            }
            i++;
        }
        //when done the stack must me empty
        return s.isEmpty();
    }
}
