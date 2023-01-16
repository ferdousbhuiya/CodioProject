package ObjectExample;

/**
 * Create the variable dog1, and instantiate an object of the Dog class.
 * This dog’s name is Marceline and she is a German Shepherd.
 * Create the variable dog2 and make a deep copy of dog1.
 * dog2 should be named Cajun and have the breed Belgian Malinois.
 *
 *
 * Expected Output
 * Test your code by printing the name and breed of each dog to make sure they
 * fulfill the requirements above. Most importantly,
 * the third print statement will print false.
 */


public class Dog {
    String name;
        String breed;

        public Dog(String n, String b) {
            name = n;
            breed = b;
        }

    Dog(Dog d) {
            name = d.name;
            breed = d.breed;
        }
    }


