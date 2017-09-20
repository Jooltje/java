package lan.network.sandbox.servlet;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Named;

@Named("abc")
@Default
@ApplicationScoped
public class SimpleMessage implements Message {

    public SimpleMessage() {
    }

    @Override
    public String getText() {
        return "Simple message by cdi";
    }

}
