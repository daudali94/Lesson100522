package peaksoft;

public class Singer extends Person{
    private String groupName;

    public Singer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
        System.out.println(name + " " + designation + " " + groupName);
    }

    public Singer() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    static void singing () {
        System.out.println("Поет");
    }
    static void playGuitar () {
        System.out.println("Играет на гитаре");
    }
    @Override
    public void learn () {
        System.out.println("Учится петь");
    }
    @Override
    public void walk () {
        System.out.println("Ходит в школу вокала");
    }
    @Override
    public void eat () {
        System.out.println("Кушает бургер");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}
