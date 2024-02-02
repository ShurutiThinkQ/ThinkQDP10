package com.abstractdemo;

abstract class Language
{
  // can have both abstract and concrete methods
  abstract void details();	
  
  void show()
  {
	  System.out.println("Languages");
  }

}

class ProgLanguage extends Language
{

	@Override
	void details() {
		System.out.println("C++,Java,.net,Python");
		
	}
	
	void display(String name)
	{
		System.out.println("Institute:"+name);
	}
	

}

class SpeakingLanguage extends Language
{

	@Override
	void details() {
		System.out.println("English, French, Spanish");
		
	}
	

}

public class AbstractDemo1 {
	 
	public static void main(String[] args) {
		// we cannot create object of abstract class
		//Language l = new Language();
		
		Language lang;
		lang= new ProgLanguage();
		lang.details();
		lang.show();
		//lang.display();
		
		lang= new SpeakingLanguage();
		lang.details();
		
		
	}


}
