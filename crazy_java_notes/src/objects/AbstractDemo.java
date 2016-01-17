package objects;

public class AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class AbstractBase {
	public abstract void print();
}

class AbstractSub extends AbstractBase {

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

}

class ThreeSub extends AbstractSub {

}
