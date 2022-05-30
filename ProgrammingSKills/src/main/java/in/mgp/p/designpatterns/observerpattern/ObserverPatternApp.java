package in.mgp.p.designpatterns.observerpattern;

public class ObserverPatternApp {
    public static void main(String[] args) {
        S3Connect s3Connect = new S3Connect();
        CassandraConnect cassandraConnect = new CassandraConnect();

        ConnectData connectData = new ConnectData();
        connectData.registerObserver(s3Connect);
        connectData.registerObserver(cassandraConnect);

        connectData.dataChanged();
        connectData.unregisterObserver(s3Connect);

        connectData.dataChanged();
    }

}
