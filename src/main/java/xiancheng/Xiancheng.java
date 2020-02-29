package xiancheng;

/*第一种继承Thread
* */

class CreateThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("run: "+i);
        }

    }
}
 public class Xiancheng {

     public static void main(String[] args) {
         CreateThread createThread = new CreateThread();
         //注意使用 异步需调用start方法
         createThread.start();

     }
}



