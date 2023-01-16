package OOPs;

/**
 * Write a class named Person that has attributes for name, age,
 * and occupation. These attributes should be private.
 * Create getters and setters for each attribute following
 * Java conventions.
 */
public class Person {
        private String name;
        private int age;
        private String occupation;

        public Person(String n, int a, String o) {
            name = n;
            age = a;
            occupation = o;
        }

        public String getName() {
            return name;
        }

        public void setName(String newName) {
            name = newName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int newAge) {
            age = newAge;
        }

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String newOccupation) {
            occupation = newOccupation;
        }
    }


//add class definitions above this line


