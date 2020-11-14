public class Test {
	//インスタンス変数
	int instanceVal;
	//メンバ変数
	static int staticVal;

	//インスタンス　→ インスタンス　ok
	int methodA() {
		return instanceVal;
	}

	//インスタンス　→ stasic ok
	int methodB() {
		return staticVal;
	}

	/*
	stasic　→　インスタンス　NG
	static int methodC() {
		return instanceVal;
	}
	*/

	//static　→ インスタンス　ok
	static int methodD() {
		return staticVal;
	}

	//インスタンス化すれば　stasic　→ インスタンス　ok
	static int methodE() {
		Test obj = new Test();
		return obj.instanceVal;
	}
}