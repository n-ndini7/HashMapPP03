package com.capgemini;

import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {

	@Test
	public void givenASentence_WhenWordsAreAddedTOTheList_ShouldReturnWord_Of_Frequency() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}

		int frequency = myHashMap.get("not");
		System.out.println(myHashMap);
		Assert.assertEquals(1, frequency);
	}

}
