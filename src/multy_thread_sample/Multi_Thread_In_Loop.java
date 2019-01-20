package multy_thread_sample;

/*
**   В данном примере видно как проходит работа нескольких потоков в цикле
* */

public class Multi_Thread_In_Loop {

    public static void main(String[] args) {
        new MyThreadLoop().start();
        new MyThreadLoop().start();
        new MyThreadLoop().start();
    }

}

class MyThreadLoop extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 400; i++) {
            System.out.println("Thread name is - " + Thread.currentThread().getName() + " - " + i);
        }
    }
}