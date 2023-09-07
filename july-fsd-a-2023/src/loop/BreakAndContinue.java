package loop;

public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("start");

        // stop the loop if you find anything that is multiple of 4?
        for (int i = 18; i <= 40; i++) {
            if (i % 4 == 0) {
                break;
            }
            System.out.println(i);
        }


        // don't print 5
        for (int i = 1; i <= 10; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }


        System.out.println("end");


    }
}
