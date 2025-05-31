package uap.base;

public abstract class Shape {
    protected String name;

    public Shape() {}

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getName() {
        return this.name;
    }

    public abstract void printInfo();
}
