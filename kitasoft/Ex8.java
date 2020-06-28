class Animal {
    public String Name;
    public int Age;

    public Animal(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public void ShowProfile() {
        System.out.printf("名前は %s, %d歳です。\n", this.Name, this.Age);
    }

    public void Speak() {
        System.out.println(".....");
    }
}

class Cat extends Animal {
    public Cat(String Name, int Age) {
        super(Name, Age);
    }

    public void Sleep() {
        System.out.println("スースー");
    }

    @Override
    public void Speak() {
        System.out.println("ニャー");
    }
}

class Dog extends Animal {
    public Dog(String Name, int Age) {
        super(Name, Age);
    }

    public void Run() {
        System.out.println("トコトコ");
    }

    @Override
    public void Speak() {
        System.out.println("ワンワン");
    }
}

public class Ex8 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        String[] cat_names = {"siro", "kuro"};
        String[] dog_names = {"pochi", "bess"};

        int[] cat_ages = {4, 7};
        int[] dog_ages = {8, 9};

        int cat_count = 0;
        int dog_count = 0;

        for(int i=0; i<animals.length; ++i) {
            if(i % 2 == 0) {
                animals[i] = new Cat(cat_names[cat_count],cat_ages[cat_count]);
                cat_count++;
            } else if (i % 2 == 1) {
                animals[i] = new Dog(dog_names[dog_count], dog_ages[dog_count]);
                dog_count++;
            }
        }
        
        for(Animal animal : animals)
            animal.Speak();
    }
}