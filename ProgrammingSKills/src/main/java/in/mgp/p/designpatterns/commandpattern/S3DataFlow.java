package in.mgp.p.designpatterns.commandpattern;

public class S3DataFlow implements DataFlow{

    S3Data s3Data;
    public S3DataFlow (S3Data s3Data) {
        this.s3Data = s3Data;

    }
    @Override
    public void flowThrough() {
        s3Data.establishS3Connection();
        s3Data.storeDataInS3();
    }

}
