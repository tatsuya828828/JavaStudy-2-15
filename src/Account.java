
public class Account {
	String owner;
	int balance;

	public Account(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public void trancefer(Account dest, int amount) {
		dest.balance += amount;
		balance -= amount;
	}


	public void transfer(Account dest, int amount) {
		// 送金処理の記述が書いてあると仮定(残高不足の場合は例外を早出)
		System.out.println("送金完了しました");
		// 本来は、テストクラスを作る方が良いのだが
		// 稼働クラスを作りながらテストクラスも並行して作っていく方が、品質の良いテストケースを作れることが経験的に知られている
		// そこでJavaには簡易なテストケースを稼働コードのソースコード内に直接記述できるアサーションという仕組みを備えている
		// このassertはJavaに標準装備されている文法でJUnitのassettメソッドとは関係がない
		// 送金処理後に「残高は0以上のはず」だということを表している

		// assert this.balance => 0 : "残高の値が不正です";

		// もし残高が0未満であった場合AssertionErrorが発生しJVMは強制停止する
		// assertの評価式の後ろに「:」をつけてその後にエラーメッセージを書いておくとエラーメッセージも指定できる
	}
}
