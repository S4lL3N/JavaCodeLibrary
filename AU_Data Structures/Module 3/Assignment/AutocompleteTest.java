

import Algorithms.Autocomplete;
import Algorithms.Term;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutocompleteTest {

    @Test
    void allMatches() {
        Term[] arr = {new Term("a", 1),
                new Term("b", 2),
                new Term("ac", 3),
                new Term("d", 4),
                new Term("ae", 5),
                new Term("af", 6),
                new Term("g", 7),
                new Term("h", 8),
                new Term("", 9)};
        Autocomplete ac = new Autocomplete(arr);
        String prefix = "a";

        Term[] expected = {new Term("af", 6),
                new Term("ae", 5),
                new Term("ac", 3),
                new Term("a", 1)};
        Term[] actual = ac.allMatches(prefix);
        assertEquals(expected[0].myWeight, actual[0].myWeight);
        assertEquals(expected[0].myQuery,  actual[0].myQuery);
        assertEquals(expected[1].myWeight, actual[1].myWeight);
        assertEquals(expected[1].myQuery,  actual[1].myQuery);
        assertEquals(expected[2].myWeight, actual[2].myWeight);
        assertEquals(expected[2].myQuery,  actual[2].myQuery);
        assertEquals(expected[3].myWeight, actual[3].myWeight);
        assertEquals(expected[3].myQuery,  actual[3].myQuery);
    }
}
