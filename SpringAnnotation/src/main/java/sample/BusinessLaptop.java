package sample;

import org.springframework.stereotype.Component;

@Component("laptop2")
public class BusinessLaptop implements Laptop{
    Processor pro;

    public BusinessLaptop(Processor pro) {
        this.pro = pro;
    }

    @Override
    public void getType() {
        System.out.println("Laptop type is Business");
    }

    @Override
    public void getProcessorInfo() {
    pro.getName();
    }
}
