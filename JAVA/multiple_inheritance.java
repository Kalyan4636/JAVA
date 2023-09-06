public class multiple_inheritance {
    public static void main(String[] args) {


    SmartPhone sp1 = new SmartPhone();
    Phone p1 = new SmartPhone();

    ICamera c1 = new SmartPhone();
    IMusicplayer m1 = new SmartPhone();

	 	sp1.videocall();
	 	p1.call();
	 	p1.message();
	 	c1.click();
	 	c1.record();
	 	m1.play();
	 	m1.pause();
	    m1.stop();

}
}

class Phone {

    void call() {
        System.out.println("call");
    }

    void message() {
        System.out.println("Message");
    }
}

interface ICamera {

    void click();

    void record();
}

interface IMusicplayer {
    void play();

    void pause();

    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicplayer {

    void videocall() {
        System.out.println("Video call");
    }

    @Override
    public void click() {
        System.out.println("Picture click");
    }

    @Override
    public void record() {
        System.out.println("Record video");
    }

    @Override
    public void play() {
        System.out.println("Play music");
    }

    @Override
    public void pause() {
        System.out.println("Pause Music");
    }
    @Override
    public void stop() {
        System.out.println("Stop music");
    }
}
