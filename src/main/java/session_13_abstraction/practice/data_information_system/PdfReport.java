package session_13_abstraction.practice.data_information_system;

import java.util.List;

public class PdfReport extends Report implements PdfExportable {

    public PdfReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void exportToPdf() {
        //code goes here
    }

    @Override
    public void showPreview() {

    }
}