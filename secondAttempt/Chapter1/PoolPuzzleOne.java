class PoolPuzzleOne {
	public static void main(String [] args) {
		int x = 0;
		while ( x < 1 ) {
			System.out.print("a");
				if ( x < 1 ) {
					x = x + 2;
				}
				System.out.print("noise");
				if ( x < 4 ) {
					System.out.print("annoys");
						x = x - 1;				
				}
			if ( x == 1 ) {
				System.out.print("an");
			}
			if ( x > 0 ) {
				System.out.print(" oyster");
			}
			System.out.println();
			x = x + 1;
		}
	}
}
