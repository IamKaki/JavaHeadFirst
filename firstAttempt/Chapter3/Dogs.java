 class Dogs{
	 String name;
	 public static void main(String[] args){
		 Dogs dog1 = new Dogs();
		 dog1.name = "fido";
		 dog1.bark();

		 Dogs[] myDogs = new Dogs[3];
		 myDogs[0] = new Dogs();
		 myDogs[1] = new Dogs();
		 myDogs[2] = dog1;

		 myDogs[0].name = "simba";
		 myDogs[1].name = "poppy";

		 System.out.print("The name of the last dog is ");
		 System.out.println(myDogs[2].name);

		 int x = 0;
		 while (x < myDogs.length){
			 myDogs[x].bark();
			 x = x + 1;
		 }
	 }
	 public void bark(){
		 System.out.println (name + " says ruff ruff!");
	 }
 }
