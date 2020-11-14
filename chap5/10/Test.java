public class Test {
	int instanceVal;
	static int staticVal;

	int methodA() {
		return instanceVal;
	}

	int methodB() {
		return staticVal;
	}

	/*
	static int methodC() {
		return instanceVal;
	}
	*/

	static int methodD() {
		return staticVal;
	}

	static int methodE() {
		Test obj = new Test();
		return obj.instanceVal;
	}
}