package com.quickfind;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickFindUFTest {

    @Test
    public void connected() {
        QuickFindUF quickFindUF = new QuickFindUF(2);

        assertFalse(quickFindUF.connected(0, 1));
        quickFindUF.union(0, 1);

        assertTrue(quickFindUF.connected(0, 1));

        quickFindUF = new QuickFindUF(5);
        quickFindUF.union(3, 4);

        assertTrue(quickFindUF.connected(3, 4));
    }

    @Test
    public void union() {

        final int N = 5;

        final QuickFindUF quickFindUF = new QuickFindUF(N);
        for (int i = 1; i < N; i++) {
            assertFalse(quickFindUF.connected(i - 1, i));
        }

        for (int i = 1; i < N; i++) {
            quickFindUF.union(i - 1, i);
            assertTrue(quickFindUF.connected(i - 1, i));
        }
    }
}