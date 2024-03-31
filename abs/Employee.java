package abs;

public class Employee implements TCS {
	
	public static void main(String[] args) {
		Employee em = new Employee();
		em.deliver();
	TCS manager	= new Employee();
	manager.deliver();
	}
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playingg cricket");
	}
	public void watc() {
		// TODO Auto-generated method stub
		System.out.println("watching movie");
	}
	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println("project deliver");
	}

	@Override
	public void apply() {
		// TODO Auto-generated method stub
		System.out.println("apply leave");
		
	}

	@Override
	public void apprise() {
		// TODO Auto-generated method stub
		System.out.println("annual income");
	}

}
