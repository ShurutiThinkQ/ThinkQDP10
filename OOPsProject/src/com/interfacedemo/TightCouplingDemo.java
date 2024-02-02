package com.interfacedemo;

interface MessageS {

	void sendMessage(String msg);

}

class Whatsapp implements MessageS {
	String type;

	public Whatsapp() {
		
	}

	@Override
	public void sendMessage(String msg) {
		this.type="Whatsapp";
		System.out.println(type+":"+msg);
		
	}

	
}

class Telegram implements MessageS {
	String type;

	public Telegram() {
		
	}

	@Override
	public void sendMessage(String msg) {
		this.type="Telegram";
		System.out.println(type+":"+msg);
		
	}

	
}

public class TightCouplingDemo {
	
//	public void msgNotify(Whatsapp w,String m)
//	{
//		w.sendMessage(m);
//	}
	// Loose coupling
	public void msgNotify(MessageS ser,String m)
	{
	  ser.sendMessage(m);
	}
	
	public static void main(String[] args) {
		
		TightCouplingDemo obj= new TightCouplingDemo();
//		Whatsapp w1= new Whatsapp();
//		obj.msgNotify(w1, "Welcome");
//		
//		Telegram t1= new Telegram();
//		obj.msgNotify(t1, "Hello");
		
		MessageS s;
		s= new Whatsapp();
		obj.msgNotify(s, "Welcome");
		s=new Telegram();
		obj.msgNotify(s, "Hello");
		
	}

}
