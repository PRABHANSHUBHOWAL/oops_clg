package p2;

class OtherPackage{
	OtherPackage() {
		p1.protection p = new p1.Protection();
		System.out.println("other package constructor");
		
		System.out.println("n == + " p.n);
		System.out.println("npri " + p.npri);
		System.out.println("npro " + p.npro);
		System.out.println("npub " + p.npub);
	}
}
		
