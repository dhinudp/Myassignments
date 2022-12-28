package week1.day1;

public class MobileAssignment {
	public void makeCall() {
		String mobileModel="redmi";
		float mobileWeight=200.35f;
		System.out.println("Call me");
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		
	}
	public void sendMessage() {
		boolean isFullCharged=true;
		int mobileCost=20000;
		System.out.println("Message me");
		System.out.println(isFullCharged);
		System.out.println(mobileCost);

	}
	public static void main(String[] args) {
		MobileAssignment object = new MobileAssignment();
		object.makeCall();
		object.sendMessage();
		
	    System.out.println("This is my mobile");
	}

}
