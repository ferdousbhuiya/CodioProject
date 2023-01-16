package OOPs;

/**
 * Create the Watch class following the conventions of encapsulation.
 * The class should have the following attributes:
 * manufacturer - string that represents who makes the watch
 * model - string that represents the specific watch
 * diameter - integer that represents (in millimeters) the diameter of the watch
 * waterResistance - integer that represents (in meters) the water resistance of the watch
 * material - string that represents what the watch is made of
 * Each attribute has a getter and a setter.
 *
 * In addition, the method printWatch will return a multiline string
 * that is a summary of the Watch instance.
 */
class Watch {
    private String manufacturer;
    private String model;
    private int diameter;
    private int waterResistance;
    private String material;

    public Watch (String ma, String mo, int d, int wr, String mat) {
        manufacturer = ma;
        model = mo;
        diameter = d;
        waterResistance = wr;
        material = mat;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String newManufacturer) {
        manufacturer = newManufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int newDiameter) {
        diameter = newDiameter;
    }

    public int getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(int newWaterResistance) {
        waterResistance = newWaterResistance;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String newMaterial) {
        material = newMaterial;
    }

    public String summary() {
        String summary = "";
        summary += "Manufacturer: " + capitalize(manufacturer) + "\n";
        summary += "Model: " + capitalize(model) + "\n";
        summary += "Diameter: " + diameter + " mm\n";
        summary += "Water Resistance: " + waterResistance + " m\n";
        summary += "Material: " + capitalize(material);
        return summary;
    }

    private String capitalize(String s) {
        String capitalizedString = "";
        capitalizedString += s.substring(0, 1).toUpperCase();
        capitalizedString += s.substring(1);
        return capitalizedString;
    }
}

//add class definitions above this line


