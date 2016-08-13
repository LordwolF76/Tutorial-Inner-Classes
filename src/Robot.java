

public class Robot {


// this is an inner class of Robot
    public class Brain {
        public void  think() {
            System.out.println("Robot " + id + " is thinking!");
        }
    }

    //need a class that is grouped with Robot otherwise it's a normal class
    static class Battery {
        public void  charge() {
            System.out.println("Battery charging....");
        }
    }


    private int id;

    public Robot(int id) {
        this.id = id;
    }

    public void start(){
        System.out.println("Starting Robot " + id);

        Brain brain = new Brain();
        brain.think();

        //class inside a method
        class Temp{
            public void doSomething(){
                System.out.println("ID is: " + id);
            }
        }

        Temp temp = new Temp();
        temp.doSomething();
    }
}
