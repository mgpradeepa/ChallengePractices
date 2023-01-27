package in.mgp.p.designpatterns.observerpattern;

public class S3Connect  implements  Observer{

    private String s3Creds;
    private float s3DataSize ;
    private String s3DataFormat;


    @Override
    public void update(String dataFormat, String dataContent, float dataSize) {
        this.s3Creds = " *****";
        this.s3DataSize = dataSize *  (4 * 1024);
        this.s3DataFormat = dataFormat;

        depictDataDisplay();
    }
    public void depictDataDisplay() {
        System.out.println( " S3 Dat ==> "+ s3DataFormat + "  ||  S3 Size--> " + s3DataSize  + " ||  S3 creds ==> "  +s3Creds  );
    }


}
