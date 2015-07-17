package thjug.springtest;

import org.springframework.stereotype.Component;

@Component("helloSpring")
public class HelloSpring implements Hello {

    @Override
    public String say() {
        return "Hello Spring !";
    }
}
