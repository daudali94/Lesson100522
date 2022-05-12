package peaksoft;

public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
        System.out.println(name + " " + designation + " " + companyName);
    }

    public Programmer() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    static void coding () {
        System.out.println("Пишет код");
    }
    @Override
    public void learn () {
        System.out.println("Учится программировать");
    }
    @Override
    public void walk () {
        System.out.println("Ходит в школу программирования");
    }
    @Override
    public void eat () {
        System.out.println("Кушает сендвич");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
