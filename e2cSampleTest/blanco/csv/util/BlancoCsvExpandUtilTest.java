package blanco.csv.util;

import junit.framework.TestCase;
import blanco.commons.util.BlancoJavaSourceUtil;

public class BlancoCsvExpandUtilTest extends TestCase {

    /*
     * Test method for
     * 'blanco.csv.util.BlancoCsvExpandUtil.escapeStringAsJavaSource(String)'
     */
    public void testEscapeStringAsJavaSource() {
        assertEquals("ABC", BlancoJavaSourceUtil
                .escapeStringAsJavaSource("ABC"));
        assertEquals("\\\"ABC\\\"", BlancoJavaSourceUtil
                .escapeStringAsJavaSource("\"ABC\""));
        assertEquals("A\\\\BC", BlancoJavaSourceUtil
                .escapeStringAsJavaSource("A\\BC"));
        assertEquals("A\\\\B\\\\C", BlancoJavaSourceUtil
                .escapeStringAsJavaSource("A\\B\\C"));
        assertEquals("A\\\\\\\\C", BlancoJavaSourceUtil
                .escapeStringAsJavaSource("A\\\\C"));
        assertEquals("A\\\\\\\\\\\"C\\\"", BlancoJavaSourceUtil
                .escapeStringAsJavaSource("A\\\\\"C\""));
    }

}
