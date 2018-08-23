package com.quickfind;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickUnionTest {

    @Test
    public void connected() {
        QuickUnion quickUnion = new QuickUnion(2);

        assertFalse(quickUnion.connected(0, 1));
        quickUnion.union(0, 1);

        assertTrue(quickUnion.connected(0, 1));

        quickUnion = new QuickUnion(5);
        quickUnion.union(3, 4);

        assertTrue(quickUnion.connected(3, 4));
    }

    @Test
    public void union() {
        final int N = 5;

        final QuickUnion quickUnion = new QuickUnion(N);
        for (int i = 1; i < N; i++) {
            assertFalse(quickUnion.connected(i - 1, i));
        }

        for (int i = 1; i < N; i++) {
            quickUnion.union(i - 1, i);
            assertTrue(quickUnion.connected(i - 1, i));
        }
    }
}