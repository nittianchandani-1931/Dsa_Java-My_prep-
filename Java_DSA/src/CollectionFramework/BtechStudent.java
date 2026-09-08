package CollectionFramework;

public class BtechStudent implements Comparable<BtechStudent> {
    public int age;
    public String name;
    public int weight;

    @Override
    public String toString() {
        return "BtechStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight + '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public BtechStudent(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(BtechStudent that) { // This method is called for current object
        // we will define our sorting logic here

        // sort basis on age
        // return this.age - that.age; // Ascending order of age
        if (this.age == that.age) {
            return this.name.compareTo(that.name);
        }
        return that.age - this.age; // Descending order of age

    }
}
