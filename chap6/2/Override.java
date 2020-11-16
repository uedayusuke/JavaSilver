class X {
	void methodA() {}
	void methodB() {}
}

class Y extends X {
	/*
	本当はclassXのmethodAをオーバーライドする予定がタイプミスでmethodaに
	しかし、classYの独自のメソッドと判断される為エラーは起こらない
	*/
	void methoda() {}
}

class Z extends X {
	/*
	@Overrideと明記することでオーバーライドすることを明示でき
	スペルミス等がありオーバーライドできない場合はコンパイルエラーを起こす
	*/
	@Override
	void methoda() {}
}