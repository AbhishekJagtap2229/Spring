package demo;

import org.springframework.stereotype.Component;

@Component("sport1")
public class Hockey implements Sports{
    @Override
    public void getName() {
        System.out.println("sport name is Hockey");
    }

    @Override
    public void getType() {
        System.out.println("Game type is Outdoor");
    }
}
