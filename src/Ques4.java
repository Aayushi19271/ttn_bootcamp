package aayushi;

interface ConstInterface{
    Employee ConstMethod(String name,Integer age, String city);
}

class Employee{
    String name;
    Integer age;
    String city;

    Employee(String name, Integer age, String city)
    {
        this.name = name;
        this.age = age;
        this.city= city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ConstInterface constref = Employee::new;
        System.out.println(constref.ConstMethod("aayushi", 24, "Delhi"));
    }
}
