class Common 
{ 
int l,b; 
public Common(int l,int b) 
{ 
this.l=l; 
this.b=b; 
} 
public void display() 
{ 
System.out.println("lenghth is="+l); 
System.out.println("breadth is="+b); 
} 
} 
class Rect extends Common 
{ 
public Rect(int x,int y) 
{ 
super (x,y); 
} 
public int area() 
{ 
return l*b; 
} 
} 
class Cuboid extends Common 
{ 
int h; 
public Cuboid(int a,int b,int c) 
{ 
super(a,b); 
h=c; 
} 
public void display(){ 
super.display(); 
System.out.println("height is"+h); 
} 
public int volume() 
{ 
return l*b*h; 
} 
} 
class Super_Keyword 
{ 
public static void main(String arg[]) 
{ 
Rect x1=new Rect(2,3); 
x1.display(); 
System.out.println("Area is"+x1.area()); 
Cuboid x2=new Cuboid(2,3,4); 
x2.display(); 
System.out.println("volume 
is="+x2.volume()); 
} 
}
