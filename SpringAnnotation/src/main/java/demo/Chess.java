package demo;

import org.springframework.stereotype.Component;

@Component("sport2")

public class Chess implements Sports{
    @Override
    public void getName() {
        System.out.println("sport name is Chess");
    }

    @Override
    public void getType() {
        System.out.println("Game type is Indoor");
    }
}
