package labs_examples.input_output.examples;

import java.io.*;

public class JcFileReaderBuffer
{
    public static void main(String[] args) {

        String jcFilePath = "src/labs_examples/input_output/files/char_data.txt";

        try {
            readFileCharacter(jcFilePath);
        } catch (IOException wormExc) {
            wormExc.printStackTrace();
        }

        try {
            jcReadLineByLine(jcFilePath);
        } catch (IOException worm) {
            worm.printStackTrace();
            System.out.println("Sorry could not find the file");
        }
        System.out.println("progam complete");

    }


    public static void readFileCharacter(String jcFilePath) throws IOException {

        FileInputStream readCharacters = new FileInputStream(jcFilePath);

        int letter;

        while ((letter = readCharacters.read())!= -1) {
            System.out.println((char) letter);

        }

    }

    public JcFileReaderBuffer() {
    }

    public static void jcReadLineByLine(String jcFilePath) throws IOException {

        File jcFile = new File(jcFilePath);

        BufferedReader byLine = new BufferedReader(new FileReader(jcFile));

        String line;

        while ((line = byLine.readLine()) != null)
            System.out.println(line);
    }
}

