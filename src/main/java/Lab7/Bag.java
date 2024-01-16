package Lab7;

public class Bag implements Pushable{
    private double VolumeOfBag;

    public Bag(double volumeOfBag) {
        VolumeOfBag = volumeOfBag;
    }

    @Override
    public boolean push(double v) {
        boolean pushResult = false;
        if (v <= VolumeOfBag ) {pushResult = true;}
        return pushResult;
    }
}
