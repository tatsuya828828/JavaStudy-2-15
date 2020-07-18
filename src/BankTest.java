import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {
	// 正常に動作するか調べる
	@Test public void setNameTest() {
		Bank bank = new Bank();
		bank.setName("たかし");
	}

	// nullをセットしたときに例外が起きるか調べる
	@Test public void setNameWithNull() {
		try {
			Bank bank = new Bank();
			bank.setName(null);
		} catch(NullPointerException e) {
			return;
		}
		fail();
	}

	// 2文字をセットしようとしたときに例外が起こるかを調べる
	@Test(expected = IllegalArgumentException.class)
	public void throwsExceptionWithTwoCharName() {
		Bank bank = new Bank();
		bank.setName("くま");
	}
}
