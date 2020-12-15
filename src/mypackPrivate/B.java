package mypackPrivate;

public class B {
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.number);
        obj.msg();
        // loi 2 dong tren vi thuoc tinh va phuong thuc cua lop A la private
    }
}
