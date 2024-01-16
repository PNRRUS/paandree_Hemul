package Lab7;

public class Packet implements Pushable{
    private double VolumeOfPacket;

    public Packet(double volumeOfPacket) {
        VolumeOfPacket = volumeOfPacket;
    }

    @Override
    public boolean push(double v) {
        boolean pushResult = false;
        if (v <= VolumeOfPacket ) {pushResult = true;}
        return pushResult;
    }
}
