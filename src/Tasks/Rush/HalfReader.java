package Tasks.Rush;

import java.io.*;

public class HalfReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file_reader = new FileInputStream(bufferedReader.readLine());
        FileOutputStream file_writer_1 = new FileOutputStream(bufferedReader.readLine());
        FileOutputStream file_writer_2 = new FileOutputStream(bufferedReader.readLine());
        bufferedReader.close();

        int available = file_reader.available();

        if (available % 2 == 0) {
            for (int i = 0; i < available / 2; i++) {
                file_writer_1.write(file_reader.read());
            }
        } else {
            for (int i = 0; i < available / 2 + 1; i++) {
                file_writer_1.write(file_reader.read());
            }
        }
        available = file_reader.available();
        for (int i = 0; i < available; i++) {
            file_writer_2.write(file_reader.read());
        }

        file_reader.close();
        file_writer_1.close();
        file_writer_2.close();
    }
}
//        byte[] buffer = new byte[file_reader.available()];
//        for (int i = 0; i < buffer.length; i++) {
//            buffer[i] = (byte)file_reader.read();
//        }
//        if (buffer.length % 2 == 0) {
//            file_writer_1.write(buffer, 0, buffer.length / 2);
//            file_writer_2.write(buffer, buffer.length / 2, buffer.length / 2);
//        } else {
//            int mid = buffer.length / 2;
//            file_writer_1.write(buffer, 0, mid);
//            file_writer_2.write(buffer, mid, mid + 1);
//        }