package ObjectExample;


/**
 * The class Mass is comprised of instance methods.
 * None of these methods change object attributes.
 * Convert these instance methods to static methods.
 * Note, all comparisons are done in grams.
 * Expected Output
 * The combinedWeight method should return 5506.532 when used with the following Mass objects.
 */
public class MutuabilityExercise3 {
    //add class definitions below this line

    class Mass {
        double milligrams;
        double grams;
        double kilograms;

        Mass(int mg, int g, int kg) {
            milligrams = mg;
            grams = g;
            kilograms = kg;
        }

        double totalWeight() {
            double tw = kilograms * 1000 + grams + milligrams / 1000;
            return tw;
        }

        static double combinedWeight(Mass m1, Mass m2) {
            return m1.totalWeight() + m2.totalWeight();
        }

        static String heavier(Mass m1, Mass m2) {
            double mass1 = m1.totalWeight();
            double mass2 = m2.totalWeight();
            if (mass1 > mass2) {
                return "The first object is heavier";
            } else if (mass2 > mass1) {
                return "The second object is heavier";
            } else {
                return "The two objects weigh the same";
            }
        }

        static double averageWeight(Mass m1, Mass m2) {
            return combinedWeight(m1, m2) / 2;
        }
    }
//add class definitions above this line
}
