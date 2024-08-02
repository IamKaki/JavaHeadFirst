class DogBark {
    String name;
    int size;

    String bark() {
        if (size > 60) {
            return "Woof! Woof! Woof!";
        } else if (size > 30) {
            return "Ruff! Ruff! Ruff!";
        } else {
            return "Yip! Yip! Yip!";
        }
    }
}

class DogBarkTestDrive {
    public static void main(String[] args) {
        DogBark first = new DogBark();
        first.name = "Fido";
        first.size = 30;

        DogBark sec = new DogBark();
        sec.name = "Simba";
        sec.size = 60;

        DogBark third = new DogBark();
        third.name = "Bosco";
        third.size = 15;

        System.out.println("The first dog is " + first.name + " and his bark is " + first.bark());
        System.out.println("The second dog is " + sec.name + " and his bark is " + sec.bark());
        System.out.println("The third dog is " + third.name + " and her bark is " + third.bark());
    }
}

