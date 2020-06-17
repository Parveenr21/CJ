package Bizarre;

import java.util.Objects;

public class ObjectComparisonClass {
    private String name;
    private int age;
    private String passport;

    @Override
    public String toString() {
        return "ObjectComparisonClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passport='" + passport + '\'' +
                '}';
    }

    public void setName()
    {
        name="Parveen";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectComparisonClass that = (ObjectComparisonClass) o;
        return age == that.age &&
                name.equals(that.name) &&
                passport.equals(that.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }

    public void setAge()
    {
        age=35;
    }

    public ObjectComparisonClass() {
        setAge();
        setName(); //Commmeting this will set name as null and in equals..if we perform
        //return age == that.age &&
        //                name.equals(that.name) &&             here it would be NPE
        //                passport.equals(that.passport);
        setPassport();
    }

    public void setPassport()
    {
        passport="Indian";
    }




}
