import java.io.*;

public class Lab03 {
    public static void main(String[] args) {
        String jsonOutput = "post.json";
        String xmlOutput = "post.xml";

        // Writing JSON
        try (PrintWriter out = new PrintWriter(new FileWriter(jsonOutput))) {
            out.println("{");
            out.println("  \"author\": \"Alice\",");
            out.println("  \"content\": \"Just finished my Java project!\",");
            out.println("  \"likes\": 15,");
            out.println("  \"tags\": [\"#programming\", \"#java\"],");
            out.println("  \"comments\": [");
            out.println("    {\"user\": \"Bob\", \"text\": \"Great work!\"},");
            out.println("    {\"user\": \"Charlie\", \"text\": \"Congratulations!\"},");
            out.println("    {\"user\": \"Diana\", \"text\": \"Well done, Alice!\"}");
            out.println("  ]");
            out.println("}");
        } catch (IOException e) { e.printStackTrace(); }

        // Writing XML
        try (PrintWriter out = new PrintWriter(new FileWriter(xmlOutput))) {
            out.println("<Post>");
            out.println("  <Author>Alice</Author>");
            out.println("  <Content>Just finished my Java project!</Content>");
            out.println("  <Tags>");
            out.println("    <Tag>#programming</Tag>");
            out.println("    <Tag>#java</Tag>");
            out.println("  </Tags>");
            out.println("  <Comments>");
            out.println("    <Comment><User>Bob</User><Text>Great work!</Text></Comment>");
            out.println("    <Comment><User>Charlie</User><Text>Congratulations!</Text></Comment>");
            out.println("    <Comment><User>Diana</User><Text>Well done, Alice!</Text></Comment>");
            out.println("  </Comments>");
            out.println("</Post>");
        } catch (IOException e) { e.printStackTrace(); }

        System.out.println("Success! Task 3 files generated.");
    }
}