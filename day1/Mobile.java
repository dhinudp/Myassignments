package week1.day1;

public class Mobile {
	public void sendSms() {
		System.out.println("Sms is sent");
	}
	public void takeSnap() {
		System.out.println("Snap is sent");
	}
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.takeSnap();
		obj.sendSms();
		
	}

}
