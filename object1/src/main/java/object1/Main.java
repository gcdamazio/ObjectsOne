package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        Person amor = new Person("Bill", 34, 180);
        Car car1 = new Car("Toyota","Corolla",2015,60000);
        Chair chair1 = new Chair("wood","black",3);
        Dog roxy =new Dog("Roxy",9,"labrador");
        System.out.println(roxy.getName() + " "+ "is " + roxy.getAge());
        roxy.setAge(11);
        System.out.println(roxy.getName() + " "+ "will be " + roxy.getAge() + "yo in two years.");

    }
}
