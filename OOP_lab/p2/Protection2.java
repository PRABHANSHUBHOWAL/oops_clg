package p2;

class Protection2 extends p1.Protection{
	Protection2(){
		System.out.println("derived other package constructor");
		System.out.println("n = " + n);
		System.out.println("npri = " + npri);
		System.out.println("npro = " + npro);
		System.out.println("npub = " + npub);
	}
}
