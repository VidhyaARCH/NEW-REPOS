package org.bank;

public class CUB extends Bank {
	@Override
	public void savAcc() {
		System.out.println("4%");

	}
	
	public void deposit() {
		System.out.println("6%");
	}

	public static void main(String[] args) {
		CUB c=new CUB();
		
		c.savAcc();
		c.deposit();
		c.mmsAcc();

	}

}
