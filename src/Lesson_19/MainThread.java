package Lesson_19;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        // если не хотим создавать отдельный класс то анон класс
        /* {Thread t = new Thread()
            public void run() {
                // все, что тут, будет выполняться потоком (! не путать со start!!!)))
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i);
                }
            }
        };*/ // или соплайером написать после нью треад -> логика.;
        System.out.println(Thread.currentThread());
        /*MyFirstThread mft = new MyFirstThread();
        mft.start();*/
       /* System.out.println("The main starts its' work");
        Child c = new Child();
        c.start();
        c.join();
        System.out.println("The main thread has finished its' work");
        // sout выходит когда хочет. пока запускается поток. чтобы точно определаить очередность не поможет приоритет. а поможет:
        // метод join ( он говорит тому классу, к-й пораждает поток "дождись пока поток не закончит работу")
        // в скобках можно указать миллисек, тогда он ждет только столько времени потомт выводит мейн например.

        // если нам нужно запустить примеру 20 одинаковых потоков. то лучше цикл (создание, старт внутри)

        Thread t =new Thread(){
            @Override
            public void run() {
                System.out.println("My thread");
            }
        };
        t.start();
        t.setName("c67-thread");
        t.setPriority(2);// чем выше приоритет тем приоритнее. но джава не всегда так четко выполняет.
        System.out.println(t);*/


        Thread th = new Thread(new MySecondThread());
        th.start();
    }
}
