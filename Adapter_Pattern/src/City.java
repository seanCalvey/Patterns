public class City implements Prototype_City {
    private Location location;
    private int population;

    public City(String name, String country, int population) {
       this.location = new Location(name, country);
       this.population = population;
    }

    @Override
    public void setNewPopulation(int population) {
        this.population = population;
    }

    @Override
    public String readName() {
        return location.readName();
    }

    @Override
    public void printDetails() {
        System.out.println("City Details");
        System.out.println("-----------------------");
        System.out.println("Name: " + location.readName());
        System.out.println("Country: " + location.readCountry());
        System.out.println("Population: " + population);


    }
}
