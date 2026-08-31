public  class GcTest {
    static {
        System.out.println("Initialize");

    }
    protected  static void finalize() throws Throwable {
        System.out.println("Clean up");

    }

    public static void main(String[] args) {
        System.out.println("In main");
        GcTest gcTest = new GcTest();
        gcTest = null;
        System.gc();
    }
}