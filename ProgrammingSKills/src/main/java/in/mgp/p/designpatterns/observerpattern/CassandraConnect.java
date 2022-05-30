package in.mgp.p.designpatterns.observerpattern;

public class CassandraConnect implements Observer{


    private String casCreds;
    private float casDataSize ;
    private String casDataFormat;


    @Override
    public void update(String dataFormat, String dataContent, float dataSize) {
        this.casCreds = "appp/aa*****";
        this.casDataSize = dataSize *  (41025* 1024);
        this.casDataFormat = dataFormat;

        depictDataDisplay();

    }

    public void depictDataDisplay() {
        System.out.println( " S3 Dat ==> "+ casDataFormat + "  ||  S3 Size--> " + casDataSize  + " ||  S3 creds ==> "  +casCreds  );
    }
}


