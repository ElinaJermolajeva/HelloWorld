package lekcijaSesi.labDarbs;

import com.github.javafaker.Faker;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.out;

public class WordGenerator {
    public static void main(String[] args) throws IOException {
        Faker faker = new Faker();
        XWPFDocument document = new XWPFDocument();

        FileOutputStream out = new FileOutputStream(new File("Elina.docx"));
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(" Mani sauc Elīna. Es dzīvoju Daugavpilī");


        document.write(out);
        out.close();
        System.out.println("Elina.docx is written succesfully");

    }
}
