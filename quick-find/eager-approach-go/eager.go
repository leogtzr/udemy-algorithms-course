package main

import "fmt"

// UF ...
type UF struct {
	ID []int
}

// Connected ...
func (uf UF) Connected(p, q int) bool {
	return uf.ID[p] == uf.ID[q]
}

// Union ...
func (uf UF) Union(p, q int) {
	pID := uf.ID[p]
	qID := uf.ID[q]
	for i := 0; i < len(uf.ID); i++ {
		if uf.ID[i] == pID {
			uf.ID[i] = qID
		}
	}

}

// New creates a UF ...
func New(n int) UF {
	i := 0
	uf := UF{ID: make([]int, n)}
	for ; i < n; i++ {
		uf.ID[i] = i
	}
	return uf
}

func main() {
	uf := New(10)

	uf.Union(4, 3)
	fmt.Println(uf)

	uf.Union(3, 8)
	fmt.Println(uf)

	uf.Union(6, 5)
	fmt.Println(uf)

	uf.Union(9, 4)
	fmt.Println(uf)

	uf.Union(2, 1)
	fmt.Println(uf)

	uf.Union(8, 9)
	fmt.Println(uf)

	uf.Union(5, 0)
	fmt.Println(uf)

	uf.Union(7, 2)
	fmt.Println(uf)

	uf.Union(6, 1)
	fmt.Println(uf)
}
