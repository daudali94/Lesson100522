package peaksoft;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------------------------");
	Programmer programmer = new Programmer("Ali", "Программист", "Peaksoft");
    Programmer.coding();
    programmer.learn();
    programmer.walk();
    programmer.eat();
        System.out.println("-------------------------");

    Singer singer = new Singer("Saikal", "Певец", "Kyz-Burak");
    Singer.playGuitar();
    Singer.singing();
    singer.learn();
    singer.walk();
    singer.eat();
        System.out.println("-------------------------");
    Dancer dancer = new Dancer("Atai", "Танцор", "Tumar-KR");
    Dancer.dancing();
    dancer.learn();
    dancer.walk();
    dancer.eat();

    }
}
