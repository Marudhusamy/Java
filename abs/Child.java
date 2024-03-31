package abs;

public  class Child extends Parent{
int age=23;
	@Override // Meta data  ---> Data about data
	// Compiler
	void study() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		ch.grow();
		
		
		Parent pa = new Child();
		pa.grow();
		ch.play();
		System.out.println(pa.age);
		System.out.println(ch.age);
		//pa.play();
		
		

	}
	void play() {
		System.out.println("playing with neighbors");
	}

}
