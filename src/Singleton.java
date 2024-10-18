public class Singleton {
       private static Singleton singleInstance = null;

    private Singleton() {
        // Initialization code, if needed
    }

    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
    public void showMessage() {

        System.out.println("Hello, Singleton is Working");
    }
}


 class Main {
    public static void main(String[] args) {
        Singleton fgr=Singleton.getInstance();
        fgr.showMessage();
    }
}