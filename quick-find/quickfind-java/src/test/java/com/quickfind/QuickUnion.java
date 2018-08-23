package com.quickfind;

public class QuickUnion {

    private int []id;

    public QuickUnion(final int n) {
        this.id = new int[n];

        for (int i = 0; i < n; i++) {
            this.id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(final int p, final int q) {
        return root(p) == root(q);
    }

    public void union(final int p, final int q) {
        int i = root(p);
        int j = root(q);
        // Set the root of the first one to the second one.
        id[i] = j;
    }

}