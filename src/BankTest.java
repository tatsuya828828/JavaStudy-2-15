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

// 目に見えずに把握しにくい品質など、開発に関する把握しにくい様々な事柄を、主に数値指標として見えるようにしたものを
// メトリクスと呼ぶ。また、テストによるカバー率もテストカバレッジまたは網羅率と呼ばれるメトリクスの一種である
// 理想としては、カバー率100%wを目指すことが望ましいが機械的に計測することが難しいため、この方法はあまり用いられていない
// その代わりにコードカバレッジというものがよく用いられている。
// 代表的なものとして、命令網羅率(C0レベルカバレッジ)と分岐網羅率(C1レベルカバレッジ)がよく知られている
// 命令網羅率はセミコロンで終わる命令文だけを数える、条件分岐のためのif文やwhile文などは無視して構わない
// コードカバレッジを計測してくれるツールは複数存在するが、その中の一つにCoberturaがある
// Coberturaを使うHTMLファイルを出力しブラウザでカバレッジレポートを見ることができる
// また、eclipseではカバレッジの欄を右クリックしてセッションのエクスポートを選ぶことでもHTMLに出力することができる