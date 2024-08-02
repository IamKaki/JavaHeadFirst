class mySongs2{
	//set instance variables for the class
	private String title;
	private String artist;

	//create methods to access the private variables
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	public String getTitle() {
		return title;
	}

	public void setArtist(String newArtist) {
		artist = newArtist;
	}
	public String getArtist() {
		return artist;
	}
}
class mySongsTestDrive {
	public static void main(String[] args) {
		//declare an array of type mySongs2 called song with an index of 3
		mySongs2[] song = new mySongs2[3];

		//create the first object of type mySongs
		song[0] = new mySongs2();
		//set the title and artist of the first object
		song[0].setTitle("Greatest");
		song[0].setArtist("Sia");
		
		song[1] = new mySongs2();
		song[1].setTitle("Nairobi");		
		song[1].setArtist("Bruklyn Boyz");

		song[2] = new mySongs2();
		song[2].setTitle("Njege/Sanse");		
		song[2].setArtist("Wakadinali");

		//get and print the values of the objects previously created
		System.out.println("My first request is " + song[0].getTitle() + " perfomed by " + song[0].getArtist());
		System.out.println("My second request is " + song[2].getTitle() + " perfomed by " + song[2].getArtist());
		System.out.println("My final request is " + song[1].getTitle() + " perfomed by " + song[1].getArtist());
	}
}

