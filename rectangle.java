import ch.aplu.turtle.*;
Turtle t1 = new Turtle();
class Square{
    int size;
    public void drawSquare(int size){
	for(int i= 0; i<4;i++){
	    t1.fd(size);
            t1.right(90);
	}
    }
    public static void main(String[]args){
	new Square().drawSquare(100);
	}
}