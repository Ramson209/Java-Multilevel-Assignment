package q1;

public class Electronics
{
	
	public Electronics() {
		System.out.println("Class Electronics");
	}
	
	void deviceType() {
		System.out.println("Device Type: Electronics");
	}
}
	class Television extends Electronics {
		public Television() {
			System.out.println("Class Television");
		}
	
	void category() {
		System.out.println("Category - Television");
	}
	
	static class LED extends Television{
		public LED () {
			System.out.println("Class LED");
		}
		void display_tech() {
			System.out.println("Display Technology - LED");
		}
	}
	
    public static  class Test{
	public static void main(String[] args)
	{
		LED led = new LED();
		led.deviceType();
		led.category();
		led.display_tech();

	}

}
	}
	

