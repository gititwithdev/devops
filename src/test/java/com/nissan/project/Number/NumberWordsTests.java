package com.nissan.project.Number;

import org.junit.*;



public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void One() {
		Assert.assertEquals( "Result","ONE",numberWords.toWords( 1, " ") ) ;
	}
	

	@Test
	public void two() {
		Assert.assertEquals( "Result","TWO",numberWords.toWords( 2, " ") ) ;
	}
	
	@Test
	public void three() {
		Assert.assertEquals( "Result","THREE",numberWords.toWords( 3, " ") ) ;
	}
	
	@Test
	public void four() {
		Assert.assertEquals( "Result","FOUR",numberWords.toWords( 4, " ") ) ;
	}
	
	@Test
	public void five() {
		Assert.assertEquals( "Result","FIVE",numberWords.toWords( 5, " ") ) ;
	}
	
	@Test
	public void six() {
		Assert.assertEquals( "Result","SIX",numberWords.toWords( 6, " ") ) ;
	}
	
	@Test
	public void seven() {
		Assert.assertEquals( "Result","SEVEN",numberWords.toWords( 7, " ") ) ;
	}
	
	@Test
	public void eight() {
		Assert.assertEquals( "Result","EIGHT",numberWords.toWords( 8, " ") ) ;
	}
	
	@Test
	public void nine() {
		Assert.assertEquals( "Result","NINE",numberWords.toWords( 9, " ") ) ;
	}
	
	@Test
	public void ten() {
		Assert.assertEquals( "Result","TEN",numberWords.toWords( 10, " ") ) ;
	}

}
