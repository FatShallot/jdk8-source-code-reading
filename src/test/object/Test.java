package test.object;

public class Test {
    public static void main(String[] args) {
        getClassTest();
    }

    /**
     * 如果一个类的实际类型是他的子类，则getClass()方法获取到的是哪个类型？
     * 子类类型
     */
    public static void getClassTest() {
        Person person = new Boy();
        // 输出：class test.object.Boy
        System.out.println(person.getClass());
    }
}
