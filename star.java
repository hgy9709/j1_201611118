import ch.aplu.turtle.*;

class Star{
    Turtle t1 = new Turtle();
    void drawStar(int size){
	for(int i=0;i<5;i++){
	    t1.fd(size);
	    t1.right(144);
	}
    }
    public static void main(String[] args){
	  new Star().drawStar(120);
	  }
    }