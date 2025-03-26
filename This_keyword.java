class This_keyword {
    String name;

    public Person(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        This_keyword person = new This_keyword("Dolly");
        person.display();  
    }
}
