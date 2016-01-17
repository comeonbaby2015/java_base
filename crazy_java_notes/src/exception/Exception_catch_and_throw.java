package exception;

public class Exception_catch_and_throw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuctionTest auctionTest = new AuctionTest();
		try {
			auctionTest.bid("df");
		} catch (AuctionException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

class AuctionException extends Throwable {
	String content;

	public AuctionException(String content) {
		// TODO Auto-generated constructor stub
		this.content = content;
	}
}

class AuctionTest {
	private double intPrice = 30.0;

	public void bid(String bidPrice) throws AuctionException {
		double d = 0.0;

		try {
			d = Double.parseDouble(bidPrice);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new AuctionException("价格必须是数值");
		}

	}
}
