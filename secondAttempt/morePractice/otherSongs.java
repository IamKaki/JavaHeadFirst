class otherSongs {
	//create instance varible for the class
	private String artist;

	//create public methods to access the private variables
	public void setArtist(String newArtist) {
		artist = newArtist;
	}
	public String getArtist() {
		return artist;
	}
}
class otherSongsTestDrive { 
	public static void main(String [] args) {
		//create an array of type otherSongs with three indexes
		otherSongs[] songs = new otherSongs[3];
		
		//declare an array named titles with three indexes
		String titles[] =  {"Shots", "Mapenzi run dunia", "Zimenishika"};

		System.out.println("The first song in the array is " + titles[1] );
	}
}

