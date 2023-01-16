package Inheritence;

/**
 *
 * Create the class Child such that the following criteria are met:
 * Child is a subclass of Parent1 and Parent2
 * Override identify so that it returns “This method is called from Child”
 * Create the method identify2 that invokes the identify method from Parent2.
 * Create the method identify3 that invokes the identify method from Parent1.
 * Important, Changes will need to be made to the Parent1 and/or Parent2 classes.
 */
class Parent1 {
    public String identify() {
        return "This method is called from Parent1";
    }
}

class Parent2 extends Parent1 {
    public String identify() {
        return "This method is called from Parent2";
    }

    public String identify2() {
        return super.identify();
    }
}

//add class definitions below this line

class Child extends Parent2 {
    public String identify() {
        return "This method is called from Child";
    }

    public String identify2() {
        return super.identify();
    }

    public String identify3() {
        return super.identify2();
    }
}

//add class definitions above this line

