public class Singleton {

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            System.out.println(SingletonEager.getInstance());
            System.out.println(SingletonLazy.getInstance());
        }
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

    static {
        SingletonInstance=new SingletonLazy();
    }
    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        return SingletonInstance;
    }
}