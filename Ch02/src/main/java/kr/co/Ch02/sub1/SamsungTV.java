package kr.co.Ch02.sub1;

import org.springframework.beans.factory.annotation.Autowired;

public class SamsungTV {

	@Autowired
	private Speaker spk;
	
	public void powerOn() {
		System.out.println("SamsungTV powerOn...");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV powerOff...");
	}
	
	public void soundup() {
		//System.out.println("SamsungTV soundUp...");
		spk.soundUp();
	}
	
	public void soundDown() {
		//System.out.println("SamsungTV powerDown...");
		spk.soundDown();
	}
	
}
