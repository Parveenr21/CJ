package AnonymousInnerClass;

public class AgeImpl implements Age{

    int x=10;

    @Override
    public void getAge() {
        System.out.println(x);
    }
}
