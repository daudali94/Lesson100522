package peaksoft;

public class Dancer extends Person{
    private String boundName;

    public Dancer(String name, String designation, String boundName) {
        super(name, designation);
        this.boundName = boundName;
        System.out.println(name + " " + designation + " " + boundName);
    }

    public Dancer() {
    }

    public String getBoundName() {
        return boundName;
    }

    public void setBoundName(String boundName) {
        this.boundName = boundName;
    }
    static void dancing () {
        System.out.println("Танцует");
    }
    @Override
    public void learn () {
        System.out.println("Учится танцевать");
    }
    @Override
    public void walk () {
        System.out.println("Ходит в школу танца");
    }
    @Override
    public void eat () {
        System.out.println("Кушает колбасу");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "boundName='" + boundName + '\'' +
                '}';
    }
}
