package javaPLO.lesson08.Ex006.Applications;

import javaPLO.lesson08.Ex006.Document.TextDocument;
import javaPLO.lesson08.Ex006.Format.TextFormat;

import java.util.ArrayList;
import java.util.List;



public class Notepad {
    private List<TextDocument> documents;
    private int index;

    public Notepad() {
        documents = new ArrayList<>();
        index = -1;
    }

    public void newFile() {
        documents.add(new TextDocument());
        index++;
    }

    public TextDocument currentDocument(){
        return documents.get(index);
    }

    public void SaveAs(String path, TextFormat format) {
        format.SaveAs(documents.get(index), path);
    }
}
