package Act7;

public class MountainBike extends Bicycle {

    public int height=12;
    public MountainBike(int gears, int currentSpeed) {
        super(gears, currentSpeed);
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "MountainBike{" +
                "height=" + height + "," +
                "bicycle Desc  =  " + super.bicycleDesc() + "," +
                '}';
    }
    
}
