package nested_class;

public class Player {
    private int id;
    private String name;
    private int age;
    private int goals;
    private int titles;
    private int assist;

    public Player(int id, String name, int age, int goals, int titles, int assist) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.goals = goals;
        this.titles = titles;
        this.assist = assist;
    }

    public Player() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getTitles() {
        return titles;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", goals=" + goals +
                ", titles=" + titles +
                ", assist=" + assist +
                '}';
    }
}
