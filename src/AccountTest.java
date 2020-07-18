// JUnitを使う際は、基本的には以下の2行をimoportしておけば問題ない
import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
	// JUnitを使ったテストケース
	// JUnitのJARファイルの中にmainメソッドに相当するプログラム(JUnitCore)が準備されているため、mainメソッドは記述しなくてよい
	// JUnitでは1つのテストクラスの中に、必ず複数のメソッドに分けてテストを記述していく
	// 1つのテストメソッドには、1つのことを確認するようなテストを作ると良い
	// テストメソッドには、@Testというアノテーションをつける、これを忘れるとテストメソッドであると認識されない
	@Test public void instantiate() {
		Account a = new Account("ミナト", 30000);
		// 値の確認にはif文ではなく、JUnitに用意されたメソッドを利用する
		// assertEqualsメソッドは、assertEquals(期待値, 実際値)のように記述して、実際値が期待値と等価かを評価する
		assertEquals("ミナト", a.owner);
		assertEquals(30000, a.balance);
		// 他にも
		// assertSameメソッドは、assertSame(期待値, 実際値)のように記述して、実際値が期待値と等値かを評価する
		// assertNullメソッドは、assertNull(実際値)のように記述して、実際値がnullかを評価する
		// assertNotNullメソッドは、assertNotNull(実際値)のように記述して、実際値がnull以外かを評価する
		// failメソッドは、fail()のように記述して、常に検証失敗にする
		// といったようなメソッドなどがある
		// これらのメソッドは、もし想定した値でない場合AssertionErrorを発生させる
		// ちなみにassert ~ とは ~であるはずだという意味の英文
		// テストコードは一眼でどのようなテストを行なっているかを把握できることが重要なため
		// 基本的には非推奨である日本語のメソッドの命名も広く実践されている
	}

	@Test void transfer() {

	}
}
