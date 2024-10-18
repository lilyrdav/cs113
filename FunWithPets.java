public class FunWithPets {
    public static void main(String[] args) {
        Animal snoopy = new Animal("dog", "Snoopy");
        Person cb = new Person("Charlie Brown", snoopy);
        //How do we print cb's pet's name?
        StdOut.println(cb.pet.name); //Animal object - cb is the Person object and pet is the instance variables
    }

    public static int numPets(Person[] people, String targetType) {
        int count = 0;
        for (Person p : people) {
            if (p.pet.type.equals(targetType)) {
                count++;
            }
        }
        return count;
    }
}