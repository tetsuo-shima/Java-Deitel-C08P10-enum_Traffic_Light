/**
 * Created by dwight on 11/18/14.
 */
public enum TrafficLight {
    RED(85),
    YELLOW(10),
    GREEN(85);

    private int time;

    TrafficLight(int time) {
        this.time = time;
    }

    public int getTime(){
        return time;
    }
}
