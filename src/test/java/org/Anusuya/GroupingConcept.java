package org.Anusuya;

import org.testng.annotations.Test;

public class GroupingConcept {
	/*
	 * i have a big basket is having different types of mobile like Apple,Moto,vivo
	 * and lenova. i want write test cases only vivo and Moto phones
	 */
	@Test(groups ="apple")
	public void apple1() {

		System.out.println("Apple testing");
	}
	@Test(groups ="apple")
	public void apple2() {

		System.out.println("Apple testing");
	}
	@Test(groups ="moto")
	public void moto1() {

		System.out.println("Moto testing");
	}
	@Test(groups ="moto")
	public void moto2() {

		System.out.println("Moto testing");
	}
	@Test(groups ="vivo")
	public void vivo1() {

		System.out.println("vivo testing");
	}
	@Test(groups ="vivo")
	public void vivo2() {

		System.out.println("vivo testing");
	}
	@Test(groups ="lenova")
	public void lenova1() {

		System.out.println("Lenova testing");
	}
	@Test(groups ="lenova")
	public void lenova2() {

		System.out.println("Lenova testing");
	}

}
