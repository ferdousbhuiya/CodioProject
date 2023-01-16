package Inheritence;

class CelestialBody {
    private double size;
    private double mass;
    private String composition;
    private String name;

    public CelestialBody(double s, double m, String c, String n) {
        size = s;
        mass = m;
        composition = c;
        name = n;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double newSize) {
        size = newSize;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double newMass) {
        mass = newMass;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String newComposition) {
        composition = newComposition;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

//add class definitions below this line

class Satellite extends CelestialBody {
    private String hostPlanet;

    public Satellite(double s, double m, String c, String n, String h) {
        super(s, m, c, n);
        hostPlanet = h;
    }

    public String getHostPlanet() {
        return hostPlanet;
    }

    public void setHostPlanet(String newHostPlanet) {
        hostPlanet = newHostPlanet;
    }
}

class Planet extends CelestialBody {
    private String hostStar;

    public Planet(double s, double m, String c, String n, String st) {
        super(s, m, c, n);
        hostStar = st;
    }

    public String getHostStar() {
        return hostStar;
    }

    public void setHostStar(String newHostStar) {
        hostStar = newHostStar;
    }
}


//add class definitions above this line

