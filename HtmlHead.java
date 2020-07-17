
/**
 * HtmlHead class contains a constructor method and the three methods which will create the head element in the web site.
 *
 * @author Ioannis Chantolios
 * @version 07/01/2018
 */
public class HtmlHead implements HtmlElement
{
    public HtmlHead()
    {
    }

    public String startBlock() {
        return "<head>";
    }
    
    public String addValue(String value) {
        return "";
    }
    
    public String endBlock() {
        return "</head>";
    }
}
