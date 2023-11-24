import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.StringReader;

public class CustomXMLParser {

    static class CustomHandler extends DefaultHandler {

        private Locator locator;

        // Called when parser encounters <element>
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {
            // Handle element start
        }

        // Called when parser encounters </element>
        @Override
        public void endElement(String uri, String localName, String qName) {
            // Handle element end
        }

        // Called for character data
        @Override
        public void characters(char[] ch, int start, int length) {
            // Handle character data
        }

        // Called to set the locator
        @Override
        public void setDocumentLocator(Locator locator) {
            this.locator = locator;
        }

        // Handle warnings
        @Override
        public void warning(SAXParseException e) {
            printError("Warning", e);
        }

        // Handle recoverable errors
        @Override
        public void error(SAXParseException e) {
            printError("Error", e);
        }

        // Handle non-recoverable errors
        @Override
        public void fatalError(SAXParseException e) throws SAXException {
            printError("Fatal Error", e);
            // throw e; // Uncomment if you want to stop parsing on fatal errors
        }

        // Print error details
        private void printError(String type, SAXParseException e) {
            System.out.println(type + ": " + e.getMessage() +
                    " at line " + locator.getLineNumber() +
                    ", column " + locator.getColumnNumber());
        }
    }

    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            CustomHandler handler = new CustomHandler();

            String xmlContent = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<XMLDATA>\n" +
                    "    <!-- Your XML structure here -->\n" +
                    "</XMLDATA>";

            saxParser.parse(new InputSource(new StringReader(xmlContent)), handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
