import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Student> studentDatabase = new HashMap<Integer, Student>();

        Student student1 = new Student("Computer Science","Joe",  3.02 );
        Student student2 = new Student("Biology","Doe",  3.52 );
        Student student3 = new Student("Computer Science","Smith",  2.75 );
        Student student4 = new Student("Physics","Ryan",  3.96 );
        Student student5 = new Student("Chemistry","Nerd",  4.00 );
        Student student6 = new Student("Computer Science","Jason",  3.33 );
        Student student7 = new Student("Physics","Josephine",  3.45 );


        studentDatabase.put(11111, student1);
        studentDatabase.put(22222, student2);
        studentDatabase.put(33333, student3);
        studentDatabase.put(44444, student4);
        studentDatabase.put(55555, student5);
        studentDatabase.put(66666, student6);
        studentDatabase.put(77777, student7);

        /*
        this  code is an example of how you can
        count words in a hash map
        * */
        HashMap<String, Integer> majorCount = new HashMap<>();

        for(Student s : studentDatabase.values()){
            if(majorCount.containsKey(s.getMajor())){
                majorCount.put(s.getMajor(), majorCount.get(s.getMajor()) + 1);
            }else {
                majorCount.put(s.getMajor(), 1);
            }
        }

        System.out.println(majorCount);


        /*
        this  code is an example of how you can
        read a text file. Parse each line and split
        each word based on space(" ").
        * */
        HashMap<String, String> pirateDictionary = new HashMap<>();
        String filePath = "pirate.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length == 2) {
                    String term = parts[0].trim();
                    String definition = parts[1].trim();
                    pirateDictionary.put(definition.toLowerCase(), term.toLowerCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(pirateDictionary);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputSentence = scanner.nextLine();
        scanner.close();

        String[] words = inputSentence.split("\\s+");
        StringBuilder translatedSentence = new StringBuilder();

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            if (pirateDictionary.containsKey(lowerCaseWord)) {
                translatedSentence.append(pirateDictionary.get(lowerCaseWord));
            } else {
                translatedSentence.append(word);
            }
            translatedSentence.append(" ");
        }

        // Print the translated sentence
        System.out.println("Translated sentence:");
        System.out.println(translatedSentence.toString().trim());

    }


}
