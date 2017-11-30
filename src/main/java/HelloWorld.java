public class HelloWorld {

    World myWorld;

    public HelloWorld(World world) {
        myWorld = world;
    }

    public String hello() {
        return String.format("Hello %s!", myWorld.sayWhat());
    }

}
