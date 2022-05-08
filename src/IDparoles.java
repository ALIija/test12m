import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Vector;
import java.util.function.IntFunction;

public class IDparoles {
    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDparoles() {

        logininfo.put("balts", "torte1");
        logininfo.put("Rose", "cat");
        logininfo.put("Ozols56", "tosters");
        logininfo.put(" ", " ");
    }

    protected HashMap<String, String> getLogininfo() {
        return logininfo;
    }
    // public static void main(String[] args) throws Exception {
    // Vector<Vector<String>> idparoles = getDataFromFile("src/IDparoles.txt");
    // for (Vector<String> row : idparoles) {
    // System.out.println(row.get(0) + " " + row.get(1) + " " + row.get(2));
    // }
    // }

    // private static Vector<Vector<String>> getDataFromFile(String source) {
    // Vector<Vector<String>> items = new Vector<Vector<String>>();
    // try {
    // FileReader fileReader = new FileReader(source, StandardCharsets.UTF_8);
    // BufferedReader bufferedReader = new BufferedReader(fileReader);
    // String fileRow;
    // String fileRowElements[];
    // while ((fileRow = bufferedReader.readLine()) != null) {
    // fileRowElements = fileRow.split(",");
    // Vector<String> row = new Vector<String>();
    // for (String col : fileRowElements) {
    // row.addElement(col);
    // }
    // items.addElement(row);
    // }
    // bufferedReader.close();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // return items;

    // }

}
