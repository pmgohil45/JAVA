// creat package 

package human;

import java.util.Scanner;

// thread
class threads extends Thread{
	public void run(){
		System.out.println("Ohh, You r student...@_^\t\t\t//Thread");
	}
}
// abstract class
abstract class printStat{
	abstract void dispStat();
}
// class of cunstructor
class hobbies extends printStat{
	public String h1, h2;
	hobbies(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your any 2 hobby : "+"\t\t\t//Constructor of hobbies class");
		 h1 = sc.nextLine();
		 h2 = sc.nextLine();
	}
	public void dispStat(){
		System.out.println("Your 1st hobby is : " + h1 + "\t\t\t//Funciton of abstract class");
		System.out.println("Your 2st hobby is : " + h2 + "\t\t\t//Funciton of abstract class");
	}
}
// interface
interface allFunction{
	public void studFun();
}
// class of protected function
class student implements allFunction{
	public void studFun(){
		System.out.println("\nEnter hobby for the student : "+"\t\t\t//Fuction of interface");
		hobbies h = new hobbies();
		h.dispStat();
		threads t = new threads();
		t.start();
	}
}
// class of private nd public methods and inhritance
class developer extends student{
	private void deve(){
		System.out.println("Enter hobby for the developer : ");
		hobbies h = new hobbies();
		h.dispStat();
	}
	protected void disp(){
		deve();
	}
}
// only use of all class, interface, thread
public class packAll
{
	public void packageUse()
	{
		developer d = new developer();
		d.disp();
		d.studFun();
	}
}
