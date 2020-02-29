package xiancheng;
/*
* 使用匿名内部类创建线程
* */
public class ThreadDeam3 {
    public static void main(String[] args) {
        System.out.println("线程开始执行");
        //使用匿名内部类创建线程
        new Thread(new Runable(){
            @Override
            public void run() {
                for (int i = 0; i <200 ; i++) {
                    System.out.println("run: "+i);
                }
            }
        }).start();
        System.out.println("线程已经开始执行");
        for (int i = 0; i < 200; i++) {
            System.out.println("main "+i);
        }

    }
}
