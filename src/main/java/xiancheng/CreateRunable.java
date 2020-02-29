package xiancheng;
/*
实现Runable接口方式实现多线程
* */
class Runable implements Runnable{

    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("run: "+i);
        }
    }
}

public class CreateRunable {
    public static void main(String[] args) {
        System.out.println("创建多线程开始 main");
        Runable runable = new Runable();
        //注意runable是实现，而不是继承
        Thread thread = new Thread(runable);
        thread.start();
        System.out.println("创建多线程已经执行 main");
        for (int i = 0; i <100 ; i++) {
            System.out.println("main "+i);
        }
    }
}
