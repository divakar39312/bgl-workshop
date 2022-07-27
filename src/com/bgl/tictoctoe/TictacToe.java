package com.bgl.tictoctoe;

import java.util.Scanner;

public class TictacToe {
     private int counter;
     private char posn[]=new char[10];
     private char player;
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;
		TictacToe toe=new TictacToe();
		do {
			toe.newBoard();
			toe.play();
			System.out.println("like to play again enter yes");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextLine();
			System.out.println("ch value"+ch);
			
		}while(ch.equals("yes"));
  
	}
	public void newBoard() {
		char posndef[]= {'0','1','2','3','4','5','6','7','8','9'};
		int i;
		counter=0;
		player='X';
		for(i=1;i<10;i++) posn[i]=posndef[i];
		currentBoard();
		
	}
	public String currentBoard() {
		System.out.println( "\n\n" );
        System.out.println(  "\n\n" );
        System.out.println(  "\n\n\t\t" + posn [1] + "   | " +posn [2]+ "  | " +posn [3]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" +posn [4]+ "   | " +posn [5]+ "  | " +posn [6]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" +posn [7]+ "   | " +posn [8]+ "  | " +posn [9]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  "\n\n" );
        return "currentBoard";
		
	}
	public void play() {
		
	}
	
}
