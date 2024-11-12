//Camryn Brown
package org.howard.edu.lsp.assignment6;


import java.util.ArrayList;
import java.util.List;


public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();

   
    public IntegerSet() {
    }

    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    public void clear() {
        set.clear();
    }

    public int length() {
        return set.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet other = (IntegerSet) o;
        return this.set.containsAll(other.set) && other.set.containsAll(this.set);
    }


    public boolean contains(int value) {
        return set.contains(value);
    }


    public int largest() {
        if (isEmpty()) throw new IllegalStateException("Set is empty");
        return set.stream().max(Integer::compareTo).orElseThrow();
    }

    public int smallest() {
        if (isEmpty()) throw new IllegalStateException("Set is empty");
        return set.stream().min(Integer::compareTo).orElseThrow();
    }

    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }
    
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }


    public void union(IntegerSet intSetb) {
        for (Integer item : intSetb.set) {
            add(item);
        }
    }

    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }


    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }


    public void complement(IntegerSet intSetb) {
        List<Integer> complement = new ArrayList<>(set);
        complement.removeAll(intSetb.set);
        set = complement;
    }


    public boolean isEmpty() {
        return set.isEmpty();
    }

 
    @Override
    public String toString() {
        return "Set: " + set.toString();
    }
}