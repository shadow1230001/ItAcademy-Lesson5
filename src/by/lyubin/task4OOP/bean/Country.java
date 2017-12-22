package by.lyubin.task4OOP.bean;

public class Country {
    private String name;
    private String capital;
    private District[] districts;
    private int numberOfRegions;

    private int regionCounter = 0;

    public Country(String name, String capital, int numberOfRegions) {
        this.name = name;
        this.capital = capital;
        this.numberOfRegions = numberOfRegions;
        this.districts = new District[numberOfRegions];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public int getNumberOfRegions() {
        return numberOfRegions;
    }

    public void setNumberOfRegions(int numberOfRegions) {
        this.numberOfRegions = numberOfRegions;
    }

    private double getArea() {
        return calcAreaOfRegions();
    }

    public String showArea() {
        double area = calcAreaOfRegions();
        return " Area of " + this.name + " is " + area + " sqrt km ";
    }

    public void addRegion(District district) {
        if (regionCounter < districts.length) {
            districts[regionCounter] = district;
            regionCounter++;
        } else {
            System.out.println("You can add only " + districts.length + " districts");
        }

    }

    public void showRegions() {
        System.out.format("%-15s %15s %25s %n", "District", "District center", "Area, thsds.sqrt km");

        for (District district : districts) {
            System.out.format("%-15s %15s %25s %n", district.getName(), district.getRegionCenter(), district.getArea());
        }

        System.out.format("%-15s %15s %25s %n", "", "", "Total: " + getArea());
    }

    private double calcAreaOfRegions() {
        double totalArea = 0;

        for (District district : districts) {
            totalArea += district.getArea();
        }

        return totalArea;
    }
}
