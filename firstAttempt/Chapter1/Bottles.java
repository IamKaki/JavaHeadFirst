/** MessageFormat version */
public class Bottles {
	static final String p1 = "{0, choice, -1#99|0#no more|0<{0}} bottle{0, choice, 0#s|1#|1<s} of beer";
	static final String p2 = " on the wall";
	static final String p3 = "{0, choice, -1#Go to the store and buy some more|0#Take one down and pass it around}, ";

	static final String patterns[] = { p1 + p2 + ", " + p1 + ".", p3 + p1 + p2 + "." } ;

	public static void main(String[] args ) {
	for (int i = 99; i >= 0; i-- ) {
	System.out.println(java.text.MessageFormat.format(patterns[0], i ).replaceFirst("^n", "N" ) ) ;
	System.out.println(java.text.MessageFormat.format(patterns[1], i - 1 ) );
		}
	}
}
