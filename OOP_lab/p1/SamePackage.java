package p1;

class SamePackage{
	
	
	SamePackage(){
		Protection p = new Protection();
		System.out.println("same package constructor");
		System.out.println("n = " + p.n);
		// System.out.println("n.npri = " + p.npri);
		System.out.println("n.npro = " + p.npro);
		System.out.println("n.npub = " + p.npub);
	}
}

