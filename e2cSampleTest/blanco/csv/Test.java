package blanco.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.Date;

import junit.framework.TestCase;
import blanco.sample.csv.io.BlancoCsvSampleCsvReader;
import blanco.sample.csv.io.BlancoCsvSampleCsvWriter;
import blanco.sample.csv.record.BlancoCsvSampleCsvRecord;

public class Test extends TestCase {
    public void testSample() throws Exception {
        new File("./tmp").mkdirs();

        BlancoCsvSampleCsvRecord record = null;
        BlancoCsvSampleCsvWriter writer = new BlancoCsvSampleCsvWriter(
                new BufferedWriter(new FileWriter("./tmp/testSample.csv")));
        record = new BlancoCsvSampleCsvRecord();
        record.setField1("abc");
        record.setField2("‚ ‚¢");
        record.setField3(new Integer(123));
        record.setField4(new Long(456));
        record.setField5(new Date());
        record.setField6(new BigDecimal("1.3"));
        record.setField11("abc");
        record.setField12("‚ ‚¢");
        record.setField13(123);
        record.setField14(456);
        record.setField15(new Date());
        record.setField16(new BigDecimal("1.3"));
        writer.writeRecord(record);

        record.setField1("def");
        record.setField5(new Date());
        writer.writeRecord(record);

        writer.flush();
        writer.close();

        BlancoCsvSampleCsvReader reader = new BlancoCsvSampleCsvReader(
                new BufferedReader(new FileReader("./tmp/testSample.csv")));
        record = reader.readRecord();
        System.out.println(record.getField1());
        System.out.println(record.getField2());
        System.out.println(record.getField3());
        System.out.println(record.getField4());
        System.out.println(record.getField5());
        System.out.println(record.getField6());

        record = reader.readRecord();
        System.out.println(record.getField1());
        System.out.println(record.getField2());
        System.out.println(record.getField3());
        System.out.println(record.getField4());
        System.out.println(record.getField5());
        System.out.println(record.getField6());

        record = reader.readRecord();
        assertNull(record);
        reader.close();
    }
}
