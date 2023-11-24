Custom XML Parser 

-OVERVIEW-
This document provides instructions for installing and using the Custom XML Parser program, which is designed to process XML content and identify syntax errors.

-INSTALLATION INSTRUCTIONS-
1. Download the 'Parser jar' from the provided location.
2. Place the JAR File in a content directory on your system.

-USAGE INSTRUCTIONS-
1. Prepare Your XML File: Ensure your XML file is ready to be parsed. Save it in an accessible directory. 
2. Running the Parser: 
    -Open a command prompt or terminal.
    -Navigate to the directory where 'Parser.jar' is located.
    -Use the following command to run the parser:
    java -jar Parser.jar "<Path to your XML file>"
    -Replace '<Path to your XML file>' with the actual path to your XML file. 
3. Interpreting the Results: 
    - The parser will output any syntax errors found in the XML file.
    - Each error will include the type (Warning, Error, Fatal Error), a descriptive message, and the location (line and column) in the XML file.

-TROUBLESHOOTING-
Java Not Recognized:
    - if the 'java -jar' command is not recognized, ensure that Java is properly installed and that your 'PATH' environment variable includes Java's 'bin' directory.
Issues with Running the JAR:
    - Ensure that 'Parser.jar' is not corrupted or missing. Redownload the file if necessary.
    - Verify that the path to the XML file is correct.