package pdfReader;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PdfReading {

  static   File file;

  static private   void readPdf() throws IOException {

      file = new File(".//Data.//p.pdf");
      PDDocument document = PDDocument.load(file);

      String text =new PDFTextStripper().getText(document);
      document.close();

      System.out.println("Text from pdf : " + text);

    }

    public static void main(String[] args) throws IOException{

      readPdf();
    }
}
