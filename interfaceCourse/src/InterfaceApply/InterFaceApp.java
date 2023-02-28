package InterfaceApply;

public class InterFaceApp {
    public static void main(String[] args) {
        ConnectMysql mysql=new ConnectMysql();
        ConnectOrical orical=new ConnectOrical();
        Tdb(mysql);
        Tdb(orical);
    }
    public static void Tdb(ConnectDb connectDb){
        connectDb.connect();
        connectDb.close();
    }
}

