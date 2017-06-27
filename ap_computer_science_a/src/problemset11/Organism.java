package problemset11;

public class Organism {

	public static void main(String[] args) {
		//subclass descends from superclass therefore subclass "IS A" superclass based on inheritance
		
		//constructor methods run first from the from top of hierarchy then down each constructor method in the hierarchy. 
		//so new RedBloodCell() 1.st constructs a Cell, 2nd. a BloodCell then 3rd. a RedBloodCell  
		
		//Cell c1 = new Cell(); //OK cell object is a cell type
		//Cell c2 = new BloodCell(); //OK bloodcell object is descended from cell and "IS A" cell type based on inheritance
		//Cell c3 = new RedBloodCell(); //OK redbloodcell object is descended from cell and "IS A" cell type based on inheritance
		
		//BloodCell b1 = new Cell(); //cell is not descended from red blood cell. type mismatch
		//BloodCell b2 = new BloodCell(); //OK bloodcell object is a bloodcell type
		//BloodCell b3 = new RedBloodCell(); //OK redbloodcell object is descended from bloodcell and "IS A" bloodcell type based on inheritance
		
		//RedBloodCell r1 = new Cell(); //cell is not descended from redbloodcell. type mismatch
		//RedBloodCell r2 = new BloodCell(); //blood cell is not descended from redbloodcell. type mismatch
		RedBloodCell r3 = new RedBloodCell(); //OK redbloodcell object is a redbloodcell type

	}

}
