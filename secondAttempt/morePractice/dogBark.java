class dogBark {
	String name;
	int size;
	
	String bark() {
		if (size > 60) {
			return "Woof! Woof! Woof!";
		}
		else if (size > 30) {
			return "Ruuf! Ruuf! Ruuf!";
		}
		else {
			return "Yip! Yip! Yip!";
		}
	}
}

class dogBarkTestDrive {
	public static void main(String[] args) {
		dogBark first = new dogBark();
		first.name = "fido";
		first.size = 30;

		dogBark sec = new dogBark();
		sec.name = "Simba";
		sec.size = 60;

		dogBark third = new dogBark();
		third.name = "Bosco";
		third.size = 15;

		System.out.println("The first dog is " + first.name + " and his bark is " + first.bark(3));
		System.out.println("The second dog is " + sec.name + " and his bark is " + sec.bark(3));
		System.out.println("The third dog is " + third.name + " and her bark is " + third.bark(3));
	}
}
class dogBark {
        String name;
        int size;

        String bark() {
                if (size > 60) {
                        return "Woof! Woof! Woof!";
                }
                else if (size > 30) {
                        return "Ruuf! Ruuf! Ruuf!";
                }
                else {
                        return "Yip! Yip! Yip!";
                }
        }
}

class dogBarkTestDrive {
        public static void main(String[] args) {
                dogBark first = new dogBark();
                first.name = "fido";
                first.size = 30;

                dogBark sec = new dogBark();
                sec.name = "Simba";
                sec.size = 60;

                dogBark third = new dogBark();
                third.name = "Bosco";
                third.size = 15;

                System.out.println("The first dog is " + first.name + " and his bark is " + first.bark());
                System.out.println("The second dog is " + sec.name + " and his bark is " + sec.bark());
                System.out.println("The third dog is " + third.name + " and her bark is " + third.bark());
        }
}

