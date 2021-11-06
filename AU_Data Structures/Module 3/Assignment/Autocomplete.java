

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Autocomplete.
 */
public class Autocomplete {

    private Term[] terms;
    private List<Term> myTerms = new ArrayList<Term>();

    /**
     * Initializes a data structure from the given array of terms.
     * This method throws a NullPointerException if terms is null.
     */
    public Autocomplete(Term[] terms) {
        if (terms == null) throw new NullPointerException("Null terms array");

        myTerms = new ArrayList<Term>(List.of(terms));
        myTerms.sort(null);
    }

    /**
     * Returns all terms that start with the given prefix, in descending order of weight.
     * This method throws a NullPointerException if prefix is null.
     */
    public Term[] allMatches(String prefix) {
        if (prefix == null) throw new NullPointerException("Prefix is null");

        // Generate a primitive array of the terms
        Term[] terms_arr = new Term[myTerms.size()];
        terms_arr = myTerms.toArray(terms_arr);

        // Get the start and end index of the terms matching the prefix
        int start_idx = BinarySearch.<Term>firstIndexOf(terms_arr, new Term(prefix,0), Term.byPrefixOrder(prefix.length()));
        int end_idx = BinarySearch.<Term>lastIndexOf(terms_arr, new Term(prefix,0), Term.byPrefixOrder(prefix.length()));

        // Populate a list with all of the terms between start and end then sort by weight
        List<Term> prefixList = new ArrayList<Term>();
        for (int i = start_idx; i <= end_idx; i++) {
            prefixList.add(myTerms.get(i));
        }
        prefixList.sort(Term.byDescendingWeightOrder());

        // Populate and return array
        Term[] returnArray = new Term[prefixList.size()];
        returnArray = prefixList.toArray(returnArray);
        return returnArray;

    }

}

