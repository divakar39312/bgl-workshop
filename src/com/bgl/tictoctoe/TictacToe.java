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
		
	}
	public String currentBoard() {
		return null;
		
	}
	public void play() {
		
	}
	
}
