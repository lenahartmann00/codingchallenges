package lena;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimplePigLatinTest {

	@Test
	public void pigItInstruction() {
		assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt("Pig latin is cool"));
	}

	@Test
	public void ignoreNotLetters(){
		assertEquals("elloHay orldway !", SimplePigLatin.pigIt("Hello world !"));
		assertEquals("ansGay, achtmay oolecay achenSay!", SimplePigLatin.pigIt("Gans, macht coole Sachen!"));
	}

	@Test
	public void emptyString(){
		assertEquals("", SimplePigLatin.pigIt(""));
	}

	@Test
	public void onlyNotLetters(){
		assertEquals("!: )", SimplePigLatin.pigIt("!: )"));
	}
}