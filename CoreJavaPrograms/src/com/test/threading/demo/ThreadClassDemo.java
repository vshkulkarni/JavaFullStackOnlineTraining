package com.test.threading.demo;

class ThreadEx extends Thread {
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread started" + Thread.currentThread());
		}
		// multithreading logic
	}
}

public class ThreadClassDemo {

	public static void main(String[] args) { // main
		ThreadEx obj = new ThreadEx();// runnable state
		obj.start();  //runnning 

		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread started" + Thread.currentThread());
		}
		// main
	}

}
