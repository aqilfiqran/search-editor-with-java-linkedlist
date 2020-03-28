package json.list;

public class Data {
    private String editor;
    private int freq;

    public Data(String editor) {
        this.editor = editor;
        this.freq = 1;
    }

    public String getEditor() {
        return this.editor;
    }

    public int getFreq() {
        return this.freq;
    }

    public void incFreq() {
        this.freq += 1;
    }
}