package com.quickfind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickfindJavaApplication {

	public static void main(String[] args) {

        final QuickFindUF quickFind = new QuickFindUF(10);
        quickFind.union(4, 3);
        quickFind.union(3, 8);
        quickFind.union(6, 5);
        quickFind.union(9, 4);
        quickFind.union(2, 1);
        quickFind.union(8, 9);
        quickFind.union(5, 0);
        quickFind.union(7, 2);
        quickFind.union(6, 1);

        System.out.println(quickFind);


	}
}
