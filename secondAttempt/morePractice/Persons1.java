public class Persons1 {
        //Declare the instance variables
        private String name;
        private int age;

        //Create public methods to access and modify the private varaibles
        public void setName(String newName) {
                name = newName;
        }
        public String getName() {
                return name;
        }
        public void setAge(int newAge) {
                age = newAge;
        }
        public int getAge() {
                return age;
        }
}

class Persons1TestDrive {
        public static void main(String[] args) {
                //Declare an array of type Persons names person with an index of 6
                Persons1[] person = new Persons1[6];

                //Declare and initialize the age and names arrays
                String[] names = {"Patrick Gicovi", "Fridah Wambugi", "John Kariuki", "Joy Mutitu", "Mathew Waweru", "Fredrick Karani"};
                int[] age = {62, 56, 33, 28, 24, 19};

                //Create new person objects in a loop and populate the instance variables
                for (int i = 0; i < person.length; i++) {
                        person[i] = new Persons1();
                        person[i].setName(names[i]);
                        person[i].setAge(age[i]);
                }

                //get the objects with their assigned values and print them out using a loop
                for (int i = 0; i < person.length; i++) {
                        if (i == 0) {
			System.out.println("We have " + person[i].getName() + " aged " + person[i].getAge() + ".");
			}
			
			else if (i == person.length - 1 ) {
				System.out.println("Lastly we have " + person[5].getName() + " aged " + person[5].getAge() + ".");
			}
			else
				System.out.println("Then we have " + person[i].getName() + " aged " + person[i].getAge() + ".");
			}			
		}
}
