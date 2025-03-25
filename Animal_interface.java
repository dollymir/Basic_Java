interface Animal{
    abstract void sound();
}
class Tiger implements Animal{
    public void sound(){
        System.out.println("Tiger says growl growl");
    }
}
class Horse implements Animal{
    public void sound(){
        System.out.println("Horse says Woof Woof");
    }
}
public class Animal_interface
{
	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.sound();
		Horse h = new Horse();
		h.sound();
	}
}