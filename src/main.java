import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.Random;

/**
 * Created by DanyDanh
 */
public class main {
    IntBuffer aBuffer = IntBuffer.allocate(1000);
    public static void main(String[] args) {


    }

    class RandomGenThread extends Thread{
        Random random= new Random();
        public void generate() throws InterruptedException {
            while (true){

                int R= random.nextInt(100)+1;
                Thread.sleep(R/100);
                aBuffer.put(R);

            }

        }

        @Override
        public void run() {
            super.run();
            try {
                generate();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class RandomGetterThread1 extends Thread{
        public void catchRand(){


        }

        @Override
        public void run() {
            super.run();
            catchRand();
        }
    }

}
