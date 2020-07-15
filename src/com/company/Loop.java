package com.company;

public class Loop {

    public static void main(String[] args) {
	int i=1;
	while (i<5){
	    System.out.println("This is loop");
	    i++;
    }
	do {
		System.out.println("This is do loop");
		i++;
		} while (i<4);

	for (i=7; i>2; i--){
			System.out.println("Yes");
    }
	for (i=20; i>=2; i= i/2){
		System.out.println("FOR Loop"+i);
	}
	}
}