package SpeakerTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import SystemHW.SystemSpeaker;

class SpeakerAccessTest {


	@Test
	void InstanceEqualTest() {
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		assertEquals(speaker1, speaker2);
		
	}
	
	@Test
	void InstanceValueEqualTest() {
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		//basic value
		assertEquals(5, speaker1.getVolume());
		//speaker1 set
		speaker1.setVolume(2);
		
		//speaker2 get
		assertEquals(2, speaker2.getVolume());
		
		//speaker2 set
		speaker2.setVolume(6);
		
		//speaker2 get
		assertEquals(6, speaker1.getVolume());
				
	}

}
