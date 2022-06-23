package Creational.src;

public class Singleton {

    public static void main(String[] args) {
            System.out.println(SingletonEager.getInstance()); System.out.println(" --> "+SingletonEager.getInstance());
            System.out.println(SingletonLazy.getInstance()); System.out.println("-->  "+SingletonLazy.getInstance());
    }
}

//Singleton eager initialization
class SingletonEager {
    private static SingletonEager SingletonInstance =new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return SingletonInstance;
    }
}

//


class SingletonLazy {
    private static SingletonLazy SingletonInstance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        if(SingletonInstance ==null){
            SingletonInstance= new SingletonLazy();
        }
        return SingletonInstance;
    }
}

class SingletonMethodSynchronized{
    private static SingletonMethodSynchronized singleSynchronized;
    private SingletonMethodSynchronized(){}

    public static synchronized SingletonMethodSynchronized getInstance(){
        if (singleSynchronized ==null){
            singleSynchronized =new SingletonMethodSynchronized();
        }
        return singleSynchronized;
    }
}


class SingletonSynchronized{
    private static SingletonSynchronized singleSynchronized;
    private SingletonSynchronized(){}

    public static  SingletonSynchronized getInstance(){
        if (singleSynchronized ==null){
            synchronized (SingletonSynchronized.class){
                if (singleSynchronized ==null){
                    singleSynchronized =new SingletonSynchronized();
                }
            }
        }
        return singleSynchronized;
    }
}