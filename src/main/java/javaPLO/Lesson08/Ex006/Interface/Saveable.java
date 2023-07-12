package javaPLO.Lesson08.Ex006.Interface;


import javaPLO.Lesson08.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
