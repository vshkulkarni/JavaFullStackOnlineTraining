package com.test.threading.demo;

class ThreadCreation implements Runnable
{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread started" + Thread.currentThread());
		}
		
	}
	
}
public class RunnableExample {

	public static void main(String[] args) {
		ThreadCreation threadObj=new ThreadCreation();
		
		Thread obj=new Thread(threadObj); // passing thread object to Thread class 
		obj.start();   // starting object 
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread started" + Thread.currentThread());
		}

	}

}
