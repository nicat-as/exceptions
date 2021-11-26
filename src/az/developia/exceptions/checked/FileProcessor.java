package az.developia.exceptions.checked;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileProcessor {
    public InputStream getFile(String filePath) throws FileNotFoundException {
        return new FileInputStream(filePath);
    }

    public String readStream(InputStream inputStream) throws IOException {
        return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
    }
}
