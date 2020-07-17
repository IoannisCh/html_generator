import java.util.ArrayList;

/**
 * HtmlGenerator contains the methods that are implemented actually with co-operation with other classes in order the final
 * product to be created. The HtmlGenerator method will create the frame, and addElement is creating each of them, while generate
 * method will do so for as many we want, something we determined in the HtmlDocument.
 *
 * @author Ioannis Chantolios
 * @version 07/01/2018
 */
public class HtmlGenerator
{
    private ArrayList<String> htmlElements;

    public HtmlGenerator() {
        htmlElements = new ArrayList();
        htmlElements.add("<html>");
    }

    public void addElement(String element) {
        htmlElements.add(element);
    }
    
    public String generate() {
        String result = "";
        for (String element : htmlElements) {
            result = result + element;
        }
        result = result + "</html>";
        return result;
    }
}
