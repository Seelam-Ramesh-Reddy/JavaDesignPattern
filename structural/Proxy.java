package structural;

public class Proxy {
    public static void main(String[] args) {
        Subject subject=new ProxyClass();
        subject.execute();
    }
}


class ProxyClass extends RealSubject{
    @Override
    public void execute() {
        System.out.println("checking the security");

        System.out.println("calling real object since it has passed in all security...");
        super.execute();
    }
}

class RealSubject implements Subject{

    @Override
    public void execute() {
        System.out.println("this is the real object");
    }
}


interface Subject{
    void execute();
}
