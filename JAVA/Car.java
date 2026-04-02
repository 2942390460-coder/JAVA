public class Car {

    String model;
    int wheel;

    public Car(String m){
        this.model = m;
        this.wheel = 4;
    }
    public void drive(){
        if(this.wheel < 4){
            System.out.println(this.model + "no go");
            return;
        }
        System.out.println(this.model + "go");
    }
    public int getNumberwheel(){
        return this.wheel;
    }
    public void driveIntoDitch(int lostwheel){
        this.wheel = this.wheel - lostwheel;
    }
    public static void main(String[] args) {
        Car c1 = new Car("benchi");
        c1.drive();
        c1.driveIntoDitch(2);
        c1.drive();
    }
}
