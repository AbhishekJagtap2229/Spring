package demo;

import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sports{
    @Override
    public void getName() {
        System.out.println("Sport name is Cricket");
    }

    @Override
    public void getType() {
        System.out.println("Type is OutDoor");

    }
}
