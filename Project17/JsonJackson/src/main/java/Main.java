import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.internal.org.objectweb.asm.TypeReference;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        objectMapper.setDateFormat(df);

        // Create a student object
//        Student student = new Student("Ivan", 18, new Date(),new Child("Jimmy"));
//        objectMapper.writeValue(new File("ivan.json"), student);
            List<Student> studentFromJson = objectMapper.readValue(new File("ivan.json"),new TypeReference<List<Student>>();
            System.out.println(studentFromJson);

    }
}