package InterfaceApply;

public class ConnectOrical implements ConnectDb{
    @Override
    public void connect() {
        System.out.println("链接Oracl数据库...");
    }

    @Override
    public void close() {
        System.out.println("断开Orcal数据库");
    }
}
