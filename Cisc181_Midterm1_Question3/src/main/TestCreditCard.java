package main;
import org.junit.Test;
import main.CreditCard;
import org.junit.After;
import org.junit.Before;
public class TestCreditCard extends CreditCard{
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//Test will not work correctly because I cannot fix error in CreditCard.java
	@Test
	public void test(){
	CreditCard cc = new CreditCard();
//These tests will be examples if my code worked.
	String account ='12345678';
	int check = 8;
	int sum = 36;

	equals(account == cc);
	equals(check == getNumber());
	equals(sum = (sumOfOdd+sumOfDoubleEven));
	}
}