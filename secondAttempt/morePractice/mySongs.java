class mySongs{
	private String title;
	private String artist;

	public void setTitle(String newTitle){
		title = newTitle;
	}

	public String getTitle(){
		return title;
	}

	public void setArtist(String newArtist){
		artist = newArtist;
	}

	public String getArtist(){
		return artist;
	}
}

class mySongsTestDrive{
	public static void main(String [] args){
		mySongs[] songs = new mySongs[3];

		songs[0] = new mySongs();
		songs[0].setTitle("Under the influence");
		songs[0].setArtist("FemiOne");

		songs[1] = new mySongs();
		songs[1].setTitle("Fathela");
		songs[1].setArtist("Nyashinski");

		songs[2] = new mySongs();
		songs[2].setTitle("Cheap Thrills");
		songs[2].setArtist("Sia");

		System.out.println("My favourite song is " + songs[0].getTitle() + " which was sung by none other than " + songs[0].getArtist());
		System.out.println("My second favourite song is " + songs[2].getTitle() + " sung by " + songs[2].getArtist());
		System.out.println("Thirdly, my last song is " + songs[1].getTitle() + " sung by " + songs[1].getArtist());
	}
}
