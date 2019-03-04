package com.hackerrank.easy;

//Write your code here
class Arithmetic{
    private int a;
    private int b;

    Arithmetic(){
    	
    }
    Arithmetic(int a, int b){
        this.setA(a);
        this.setB(b);
    }
    int add(int a, int b){
        return a+b;
    }
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}

class Adder extends Arithmetic{
   /* private int a;
    private int b;
*/    /*Adder(int a, int b){
    	super(a, b);
    }
*/  
	public Adder() {
		super();// TODO Auto-generated constructor stub
	}
}
public class InheritanceII{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
