package multy_thread_sample;


/*
*   Многопоточность в Java
*   2 способа создание многопоточности (У КАЖДОГО ПОТОКА СВОЙ СТЕК)
*   Способ 1: Создание класса MyThread extends Thread и переопреления метода Run
*   Способ 2: Создание класса MyRunnable implement Runnable
*/


public class Sample {

    public static void main(String[] args) {

        // 1-й способ
        // Создаем объект класса нового потока
        MyThread myThread = new MyThread();
        // Запускаем поток (Добавляем его в пулл)
        myThread.start();


        // 2-й способ
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread2 = new Thread(myRunnable);
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();


        // Выводим в консоль имя потока
        System.out.println(Thread.currentThread().getName());

    }

}

// Способ 1
class MyThread extends Thread{

    // Все действия (методы выполняются в методе run)

    @Override
    public void run(){
        System.out.println("this is new thread");
//         Выводим в консоль имя потока
//        System.out.println(Thread.currentThread().getName());
    }

    // Метод выбрасывающий исключение
    private  void someMethod(){
        throw new RuntimeException(); //RuntimeException – это непроверенные исключения. Они возникают во время выполнения приложения.
    }

}

// Способ 2

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("this is thread - MyRunnable");
//         Выводим в консоль имя потока
//        System.out.println(Thread.currentThread().getName());
    }
}