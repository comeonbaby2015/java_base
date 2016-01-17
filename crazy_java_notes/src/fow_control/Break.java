package fow_control;

public class Break {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		can_jump: 
			for (int i = 0; i < 5; i++) {
			// can_jump:

			for (int j = 0; j < 5; j++) {
				System.out.println("----" + i + "----" + j);
				if (j == 1) {
					break can_jump;
				}
			}
		}

	}
}
