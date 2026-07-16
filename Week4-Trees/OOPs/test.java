interface test{
    void square(int x);
}
class arithmetic implements test{
    public void square(int x){
        System.out.println("Square is "+(x*x));
    }
}

class ToTestInt {

    public static void main(String[] args) {

        arithmetic obj = new arithmetic();

        obj.square(5);
    }
}
class Outer {

    void display() {
        System.out.println("Outer display");
    }


    class Inner {

        void display() {
            System.out.println("Inner display");
        }
    }
}


class Main {

    public static void main(String[] args) {

        Outer obj = new Outer();

        obj.display();


        Outer.Inner in = obj.new Inner();

        in.display();
    }
}

class Point {

    private int x;
    private int y;

    public Point() {

        x = 0;
        y = 0;
    }

    public Point(int x,int y) {

        this.x = x;
        this.y = y;
    }

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }

    public void setXY(int x,int y) {

        this.x = x;
        this.y = y;
    }

    public void display(){

        System.out.println(x+" "+y);
    }
}
class Box {

    int length;
    int breadth;

    Box(int l,int b){

        length=l;
        breadth=b;
    }

    int area(){

        return length*breadth;
    }
}

class Box3D extends Box {
    int height;

    Box3D(int l,int b,int h){

        super(l,b);

        height=h;
    }

    int volume(){

        return length*breadth*height;
    }
}