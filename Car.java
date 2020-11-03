public abstract class Car implements Serviceable {

    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    private int distance = 0;
    protected int distanceOnService = 0;

    public Car(String name, int yearOfProduction, int price, int weight, Color color) { //конструктор
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public void addDistance(int additionalDistance) {
        if (additionalDistance < 0) {
            try {
                throw new Exception("Distance cannot be less 0");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("no distance at all");
            }
        }
        distance += additionalDistance;
        distanceOnService += additionalDistance;
    }

    public void addDistance(double additionalDistance) {
        if (additionalDistance < 0) {
            try {
                throw new Exception("Distance cannot be less 0");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("no distance at all");
            }
        }
        distance += additionalDistance;
        distanceOnService += additionalDistance;
    }

    public int getDistanceOnService() {
        return distanceOnService;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", price=" + price + ", weight=" + weight + ", yearOfProduction="
                + yearOfProduction + ", color=" + color + ", distance=" + distance + ", distanceOnService=" + distanceOnService + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        result = prime * result + weight;
        result = prime * result + yearOfProduction;
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (color != other.color)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        if (weight != other.weight)
            return false;
        if (yearOfProduction != other.yearOfProduction)
            return false;
        return true;
    }
}
