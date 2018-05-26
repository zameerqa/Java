package MethodOverRidingExample;

public class Game {
	public static void play(Animal a){
		a.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		play(a);
		Dog dog=new Dog();
		play(dog);
		play(new Dog());		
		Cat cat=new Cat();
		play(cat);
		Animal a1=new Dog();
		a.run();

	}

}
