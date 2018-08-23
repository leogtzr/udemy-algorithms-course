package com.quickfind;

import java.util.Arrays;

public class QuickFindUF {

    private int []id;

    public QuickFindUF(final int n) {
        this.id = new int[n];

        /*
            O(N)
         */
        for (int i = 0; i < n; i++) {
            this.id[i] = i;
        }

    }

    /*
        O(1)
     */
    public boolean connected(final int q, final int p) {
        return this.id[p] == this.id[q];
    }

    /*
        O(N)
     */
    public void union(final int p, final int q) {
        final int pId = this.id[p];
        final int qId = this.id[q];

        for (int i = 0; i < this.id.length; i++) {
            if (this.id[i] == pId) {
                this.id[i] = qId;
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        for (final int e : id) {
            sb.append(e).append(" ");
        }

        return sb.toString();
    }
}