public class BottlesV2 {
    public static void main(String[] args) {
        for (int numberOfBottles = 99; numberOfBottles > 0; numberOfBottles--) {
            if (numberOfBottles > 1) {
                System.out.println(numberOfBottles + " bottles of beer on the wall");
                System.out.println(numberOfBottles + " bottles of beer");
                System.out.println("Take one down, pass it around.");
            } else {
                System.out.println("1 bottle of beer on the wall");
                System.out.println("1 bottle of beer");
                System.out.println("Take it down, pass it around.");
            }

            if (numberOfBottles - 1 > 1) {
                System.out.println((numberOfBottles - 1) + " bottles of beer on the wall");
                System.out.println();
            } else if (numberOfBottles - 1 == 1) {
                System.out.println("1 bottle of beer on the wall");
                System.out.println();
            } else {
                System.out.println("No more bottles of beer on the wall");
                System.out.println();
            }
        }
    }
}

