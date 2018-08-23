package main

import (
	"testing"
)

func TestConnected(t *testing.T) {
	quick := New(2)

	p := 0
	q := 1

	if quick.Connected(p, q) {
		t.Fatalf("Error, %d and %d should NOT be connected.", p, q)
	}

    quick.Union(p, q)

	if ! quick.Connected(p, q) {
		t.Fatalf("Error, %d and %d should be connected.", p, q)
	}

    quick = New(5)
	
	p = 3
	q = 4
    quick.Union(p, q)

	if !quick.Connected(p, q) {
		t.Fatalf("Error, %d and %d should be connected.", p, q)
	}

}
