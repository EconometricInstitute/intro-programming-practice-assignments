public class Person {
    private final String name;
    private final Pet pet;

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return name + ", has a friend called " + pet.getName() + " (" + pet.getBreed() + ")";
    }
}
