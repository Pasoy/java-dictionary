package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Dictionary;

class DictionaryTest {
	
	private Dictionary d;

	@Before
	void setUp() throws Exception {
		d = new Dictionary();
		d.put("apple", "Apfel");
		d.put("write", "schreiben");
		d.put("nut", "Nuss");
		d.put("light", "Licht");
		d.put("microphones", "Mikrofone");
		d.put("skull", "Schädel");
		d.put("heart", "Herz");
		d.put("hair", "Haar");
		d.put("keyboard", "Tastatur");
		d.put("walk", "gehen");
	}

	@Test
	void testPut() {
		assertEquals(10, d.size());
	}
	
	@Test
	void testGet() {
		assertEquals("Apfel", d.get("apple"));
	}
	
	@Test
	void testRemove() {
		assertEquals("Apfel", d.remove("apple"));
	}
	
	@Test
	void testContains() {
		d.remove("apple");
		assertEquals(false, d.contains("apple"));
	}
	
	@Test
	void testSize() {
		assertEquals(10, d.size());
	}
	
	@Test
	void testLongestKey() {
		assertEquals("microphones", d.longestKey());
	}
	
	@Test
	void testLongestValue() {
		assertEquals("Mikrofone", d.longestValue());
	}

}
