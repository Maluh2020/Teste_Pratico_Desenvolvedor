package program;

import java.util.Scanner;

import entities.Menu;



public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Menu menu = new Menu();
		
		menu.menuInicial();
		
		input.close();

	}

}
