package Multi_threading.Tasks;

import java.io.*;
import java.util.ArrayList;

public class FileLinesRemover {
    public static ArrayList<String> allLines = new ArrayList<>();
    public static ArrayList<String> forRemoveLines = new ArrayList<>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file_1;
        String file_2;
        String line;
        try {
            file_1 = reader.readLine();
            file_2 = reader.readLine();

            FileInputStream file_reader_1 = new FileInputStream(file_1);
            FileInputStream file_reader_2 = new FileInputStream(file_2);

            reader = new BufferedReader(new InputStreamReader(file_reader_1));
            while ((line = reader.readLine()) != null) {
                allLines.add(line);
            }

            reader = new BufferedReader(new InputStreamReader(file_reader_2));
            while ((line = reader.readLine()) != null) {
                forRemoveLines.add(line);
            }

        } catch (IOException io) {
            io.printStackTrace();
        }
        try {
            new FileLinesRemover().joinData();
        } catch (CorruptedDataException cde) {
            cde.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}

class CorruptedDataException extends IOException {}