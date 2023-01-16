package Inheritence;

public class Exercise1 {
    public static void main(String[] args) {

        //add code below this line
        Satellite s = new Satellite(2651, 3716, "helium", "moon", "earth");
        Planet p = new Planet(5349, 8910, "nitrogen", "earth", "sun");

        System.out.println(s.getSize());
        System.out.println(s.getMass());
        System.out.println(s.getComposition());
        System.out.println(s.getName());
        System.out.println(s.getHostPlanet());
        System.out.println(p.getSize());
        System.out.println(p.getMass());
        System.out.println(p.getComposition());
        System.out.println(p.getName());
        System.out.println(p.getHostStar());


        //add code above this line
    }

}
