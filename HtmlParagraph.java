
/**
 * HtmlParagraph is creating the element of a paragraph in the web site. Here we modified the addValue to return a value.
 *
 * @author Ioannis Chatolios
 * @version 07/01/2018
 */
public class HtmlParagraph implements HtmlElement
{
    public HtmlParagraph()
    {
    }

    public String startBlock() {
        return "<paragraph>";
    }
    
    public String addValue(String value) {
        return value;
    }
    
    public String endBlock() {
        return "</paragraph>";
    }
}