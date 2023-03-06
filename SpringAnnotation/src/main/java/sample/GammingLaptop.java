package sample;

import org.springframework.stereotype.Component;

@Component("laptop1")
public class GammingLaptop implements Laptop{
    Processor pro;

    public GammingLaptop(Processor pro) {
        this.pro = pro;
    }

    @Override
    public void getType() {
        System.out.println("Laptop type is Gaming");
    }

    @Override
    public void getProcessorInfo() {
        pro.getName();
    }
}
