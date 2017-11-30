public class HelloWorld {

    public String hello() {
        return String.format("Hello %s!", new World().sayWhat());
    }

}
