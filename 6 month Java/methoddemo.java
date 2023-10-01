class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int fun) {
        this.age = fun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class methoddemo {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setAge(30);
        obj.setName("Reddy");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
