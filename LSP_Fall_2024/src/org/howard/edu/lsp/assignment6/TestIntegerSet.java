//Camryn Brown
package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestIntegerSet {

    private IntegerSet set;

    @BeforeEach
    public void setUp() {
        set = new IntegerSet();
    }

    @Test
    @DisplayName("Test add and length methods")
    public void testAdd() {
        set.add(5);
        set.add(10);
        assertEquals(2, set.length(), "Length should be 2 after adding two elements");
        set.add(5);
        assertEquals(2, set.length(), "Length should remain 2 after adding a duplicate element");
    }

    @Test
    @DisplayName("Test remove method")
    public void testRemove() {
        set.add(5);
        set.add(10);
        set.remove(5);
        assertFalse(set.contains(5), "Set should not contain 5 after removal");
        set.remove(15); 
        assertEquals(1, set.length(), "Length should remain 1 after trying to remove a non-existent element");
    }

    @Test
    @DisplayName("Test largest method")
    public void testLargest() {
        set.add(3);
        set.add(7);
        set.add(10);
        try {
            assertEquals(10, set.largest(), "Largest element should be 10");
        } catch (IntegerSetException e) {
            fail("Exception should not be thrown when the set is not empty");
        }
        set.clear();
        assertThrows(IntegerSetException.class, () -> set.largest(), "Should throw IntegerSetException for empty set");
    }

    @Test
    @DisplayName("Test smallest method")
    public void testSmallest() {
        set.add(3);
        set.add(7);
        set.add(10);
        try {
            assertEquals(3, set.smallest(), "Smallest element should be 3");
        } catch (IntegerSetException e) {
            fail("Exception should not be thrown when the set is not empty");
        }
        set.clear();
        assertThrows(IntegerSetException.class, () -> set.smallest(), "Should throw IntegerSetException for empty set");
    }

    @Test
    @DisplayName("Test clear method")
    public void testClear() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.clear();
        assertTrue(set.isEmpty(), "Set should be empty after calling clear");
    }

    @Test
    @DisplayName("Test union method")
    public void testUnion() {
        IntegerSet setB = new IntegerSet();
        set.add(1);
        set.add(2);
        setB.add(2);
        setB.add(3);
        set.union(setB);
        assertEquals(3, set.length(), "Union of two sets should have 3 elements");
    }

    @Test
    @DisplayName("Test intersect method")
    public void testIntersect() {
        IntegerSet setB = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
        setB.add(2);
        setB.add(3);
        set.intersect(setB);
        assertEquals(2, set.length(), "Intersection of two sets should have 2 elements");
        assertTrue(set.contains(2), "Set should contain 2");
        assertTrue(set.contains(3), "Set should contain 3");
    }

    @Test
    @DisplayName("Test difference method")
    public void testDiff() {
        IntegerSet setB = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
        setB.add(2);
        setB.add(3);
        set.diff(setB);
        assertEquals(1, set.length(), "Difference of sets should have 1 element");
        assertTrue(set.contains(1), "Set should contain 1");
    }

    @Test
    @DisplayName("Test complement method")
    public void testComplement() {
        IntegerSet setB = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
        setB.add(2);
        setB.add(3);
        set.complement(setB);
        assertEquals(1, set.length(), "Complement of sets should have 1 element");
        assertTrue(set.contains(1), "Set should contain 1");
    }

    @Test
    @DisplayName("Test isEmpty method")
    public void testIsEmpty() {
        assertTrue(set.isEmpty(), "New set should be empty");
        set.add(1);
        assertFalse(set.isEmpty(), "Set should not be empty after adding an element");
    }

    @Test
    @DisplayName("Test equals method")
    public void testEquals() {
        IntegerSet setB = new IntegerSet();
        set.add(1);
        set.add(2);
        setB.add(2);
        setB.add(1);
        assertTrue(set.equals(setB), "Sets should be equal, even if the order is different");
    }
}
