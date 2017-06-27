package problemset11;

public class Water {

	public static void main(String[] args) {
		SeaCreature [] elements = {
				new Squid(),
				new Whale(),
				new SeaCreature(),
				new Mammal() };
		
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
			elements[i].method1();
			elements[i].method2();
			System.out.println();
		}
		//following is written to the console:
		//squid
		//creature 1
		//tentacles
		//
		//BIG!
		//spout
		//creature 2
		//
		//ocean-dwelling
		//creature 1
		//creature 2
		//
		//ocean-dwelling
		//warm-blooded
		//creature 2
	}

}
