package Algorithms;

import java.util.Comparator;

/**
 * Autocomplete term representing a (query, weight) pair.
 *
 */
public class Term implements Comparable<Term> {
    public String myQuery = "";
    public long myWeight = 0;
    /**
     * Initialize a term with the given query and weight.
     * This method throws a NullPointerException if query is null,
     * and an IllegalArgumentException if weight is negative.
     */
    public Term(String query, long weight)  throws NullPointerException, IllegalArgumentException {
        if (query == null) throw new NullPointerException("Null Term query");
        if (weight < 0) throw new IllegalArgumentException("Negative Term weight");
        myQuery = query;
        myWeight = weight;
    }

    /**
     * Compares the two terms in descending order of weight.
     */
    public static Comparator<Term> byDescendingWeightOrder() {
        return
                new Comparator<Term>() {
                    @Override
                    public int compare(Term left, Term right) {
                        return Long.compare(right.myWeight, left.myWeight);
                    }
                };
    }

    /**
     * Compares the two terms in ascending lexicographic order of query,
     * but using only the first length characters of query. This method
     * throws an IllegalArgumentException if length is less than or equal
     * to zero.
     */
    public static Comparator<Term> byPrefixOrder(int length) throws IllegalArgumentException {
        if (length <= 0) throw new IllegalArgumentException("Length less than 1");
        return
                new Comparator<Term>() {
                    @Override
                    public int compare(Term left, Term right) {
                        String right_substring = right.myQuery;
                        String left_substring = left.myQuery;
                        if (length < right.myQuery.length()) {
                            right_substring = right_substring.substring(0, length);
                        }
                        if (length < left.myQuery.length()) {
                            left_substring = left_substring.substring(0, length);
                        }
                        return left_substring.compareTo(right_substring);
                    }
                };
    }

    /**
     * Compares this term with the other term in ascending lexicographic order
     * of query.
     */
    @Override
    public int compareTo(Term other) {
        return myQuery.compareTo(other.myQuery);
    }

    /**
     * Returns a string representation of this term in the following format:
     * query followed by a tab followed by weight
     */
    @Override
    public String toString(){
        return myQuery + "\t" + myWeight;
    }

}

