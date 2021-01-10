package Learn_Java.jProjects;

enum trafficlightcolor {
    RED, GREEN, YELLOW
}

class trafficlightsimulator implements Runnable {
    private trafficlightcolor tlc;
    private boolean stop = false;
    private boolean changed = false;

    trafficlightsimulator(trafficlightcolor init) {
        tlc = init;
    }
    trafficlightsimulator() {
        tlc = trafficlightcolor.RED;
    }

    public void run() {
        while(!stop) {
            try {
                switch(tlc) {
                    case GREEN:
                    Thread.sleep(10000);
                    break;

                    case YELLOW:
                    Thread.sleep(2000);
                    break;

                    case RED:
                    Thread.sleep(12000);
                    break;
                }
            } catch(InterruptedException exc) {
                System.out.println("Error: " + exc);
            }
            changecolor();
        }
    }

    synchronized void changecolor() {
        switch(tlc) {
            case RED:
            tlc = trafficlightcolor.GREEN;
            break;

            case YELLOW:
            tlc = trafficlightcolor.RED;
            break;

            case GREEN:
            tlc = trafficlightcolor.YELLOW;
        }
        changed = true;
        notify();
    }

    synchronized void waitforchange() {
        try {
            while(!changed)
            wait();
            changed = false;
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
    }

    synchronized trafficlightcolor getcolor() {
        return tlc;
    }

    synchronized void cancel() {
        stop = true;
    }
}

class trafficlightdemo {
    public static void main(String[] args) {
        trafficlightsimulator tl = new trafficlightsimulator(trafficlightcolor.GREEN);
        Thread thrd = new Thread(tl);
        thrd.start();

        for(int i = 0; i < 9; i++) {
            System.out.println(tl.getcolor());
            tl.waitforchange();
        }
        tl.cancel();
    }
}