package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
        //video is 1 min 57 seconds, while we did not reach to last second
        // print "Watching YouTube video: seconds: 1"
        //print "Finished watching Cat video, lets start another one"

        while(seconds < 117){
            System.out.println("Watching YouTube video: seconds: " +seconds);
            seconds++;
            Thread.sleep(1000);// PAUSE the code execution for a 1000 milliseconds.(1 second)
        }
        System.out.println("Finished watching Cat video, lets start another one.");
    }
}
