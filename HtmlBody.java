
/**
 * HtmlBody will produce the element of the body of our web site. 
 *
 * @author Ioannis Chantolios
 * @version 07/01/2018
 */
public class HtmlBody implements HtmlElement
{
    public HtmlBody()
    {
    }

    public String startBlock() {
        return "<body>";
    }
    
    public String addValue(String value) {
        return "";
    }
    
    public String endBlock() {
        return "</body>";
    }
}