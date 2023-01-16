package UserDefinedClass;


/**
 *
 * Exercise 3
 * Create the Dog class with the string attributes
 * for name and breed. These attributes need to have getter
 * methods. Then create the method makeDogs that
 * returns an ArrayList of five Dog objects according to
 * the following table:
 *
 *
 * Dog	Name	Breed
 * 1	Marceline	German Shepherd
 * 2	Cajun	Belgian Malinois
 * 3	Daisy	Border Collie
 * 4	Rocky	Golden Retriever
 * 5	Bella	Irish Setter
 *
 */

//add class definitions below this line

    class Dog {
        private String name;
        private String breed;

        public Dog(String n, String b) {
            name = n;
            breed = b;
        }

        public String getName() {
            return name;
        }

        public String getBreed() {
            return breed;
        }

        public String toString() {
            return getClass().getName() + "[name=" + name + ", breed=" + breed + "]";
        }
    }


