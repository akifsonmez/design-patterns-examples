public class SingletonExample {
    private static SingletonExample uniqueInstance = null;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new SingletonExample();

        return uniqueInstance;
    }

}