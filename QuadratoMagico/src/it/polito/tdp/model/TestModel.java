package it.polito.tdp.model;

import java.util.List;

public class TestModel {

	public static void main(String[] args) {

		Model model = new Model();
		int temp=3;
		List<Quadrato> quadrati = model.findMagicSquare(temp);

		for(Quadrato q: quadrati)
		  System.out.println(q);
		
	
		
		
	}

}
