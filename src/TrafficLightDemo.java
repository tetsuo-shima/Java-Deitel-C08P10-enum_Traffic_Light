/**
 * Created by dwight on 11/18/14.
 */
public class TrafficLightDemo {
    public static void main(String[] args) {
        System.out.println("Traffic Light Times:");

        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%-10s%d seconds\n", light, light.getTime());
        }
    }
}
