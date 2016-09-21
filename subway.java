class Subway { 
int line; 
void run() {    
System.out.println(line+" lines runs"); 
} 
void setLine(int l){
line=l;
} 
} 
Subway do=new Subway(); 
do.setLine(3); 
do.run(); 
