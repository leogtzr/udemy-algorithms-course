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

// Union
func (uf UF) Union(p, q int) {

}

func main() {
	uf := UF{ID: make([]int, 5)}
	fmt.Println(uf)
	fmt.Println(uf.Connected(2, 3))
}
