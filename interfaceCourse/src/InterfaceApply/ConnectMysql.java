package InterfaceApply;

public class ConnectMysql implements ConnectDb{
    @Override
    public void connect() {
        System.out.println("连接mysql数据库...");
    }

    @Override
    public void close() {
        System.out.println("断开mysql数据库...");
    }
}
