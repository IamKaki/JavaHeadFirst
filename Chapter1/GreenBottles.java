public class GreenBottles{
	public static void main(String[] args){
		int g = 10;
		System.out.println("10 green bottles hanging on the wall,");
                System.out.println("10 green bottles hanging on the wall,");
                System.out.println("And if one bottle should accidentally fall,");
		g -= 1;
                System.out.println("There'll be " + g + " bottles hanging on the wall.");

		while (g >= 0){
		System.out.println(g + " green bottles hanging on the wall,");
		System.out.println(g + " green bottles hanging on the wall,");
		System.out.println("And if one bottle should accidentally fall,");
		System.out.println("There'll be " + g + " bottles hanging on the wall.");
		g--;
		}
	}
}
