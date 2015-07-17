package thjug.springtest;

import org.springframework.stereotype.Component;

@Component("helloWorld")
public class HelloWorld implements Hello {

    @Override
    public String say() {
        return "Hello World !";
    }
}
