package OOPs;

public class EncapsulationLabChallenge {
    public static void main(String[] args) {

        //add code below this line
        Person myPerson = new Person("Citra Curie", 16, "student");

        System.out.println(myPerson.getName());
        myPerson.setName("Roman Faraday");
        System.out.println(myPerson.getName());

        System.out.println(myPerson.getAge());
        myPerson.setAge(18);
        System.out.println(myPerson.getAge());

        System.out.println(myPerson.getOccupation());
        myPerson.setOccupation("plumber");
        System.out.println(myPerson.getOccupation());


        //add code above this line
    }
}
