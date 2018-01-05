package singletonTest1;

class Singleton {

    private static Singleton instance;
    private volatile int count = 0;
    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
    
    public synchronized void countUp() {
    	
    	count++;
    }
    

}
