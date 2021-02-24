import processing.core.PApplet;
public class TryProcessing extends PApplet {

    public static final int WIDTH=640;
    public static final int HEIGHT=480;
    public static final int DIAMETER=10;
    int x1=0,x2=0,x3=0,x4=0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

//    @Override
//    public void setup() {
//        System.out.println("Printed from setup method");
//
//    }


    @Override
    public void draw() {
        //paintWhite();
        drawCircleOne();
        drawCircleSecond();
        drawCircleThird();
        drawCircleFourth();


    }

    private void drawCircleOne() {
        ellipse(x1,HEIGHT/5,DIAMETER,DIAMETER);
        x1+=1;
    }
    private void drawCircleSecond() {
        ellipse(x2,2*HEIGHT/5,DIAMETER,DIAMETER);
        x2+=2;
    }
    private void drawCircleThird() {
        ellipse(x3,3*HEIGHT/5,DIAMETER,DIAMETER);
        x3+=3;
    }
    private void drawCircleFourth() {
        ellipse(x4,4*HEIGHT/5,DIAMETER,DIAMETER);
        x4+=4;
    }


//    private void paintWhite()
//    {
//        background(255);
//    }


}
