package org.example.easy;

import org.example.easy.BinarySearch;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @org.junit.jupiter.api.Test
    void implementBinarySearch() {
        BinarySearch b1= new BinarySearch();
        assertTrue(b1.implementBinarySearch(new int[]{1,2,3,4,5,6},5));
        assertFalse(b1.implementBinarySearch(new int[]{1,2,3,4,5,6},50));
        assertFalse(b1.implementBinarySearch(new int[]{1,2,3,4,5,6},50));
        assertFalse(b1.implementBinarySearch(new int[]{}, 50));
        assertFalse(b1.implementBinarySearch(new int[]{}, 50));
    }
}