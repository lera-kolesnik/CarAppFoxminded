public interface Serviceable {

    public boolean isReadyToService();

    public int getDistanceOnService();

    public void addDistance(int additionalDistance);

    public void addDistance(double additionalDistance);
}
