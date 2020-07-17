
/**
 * HtmlHeader will create the element of header in the web site. Here we modified the addValue to return a value.
 *
 * @author Ioannis Chantolios
 * @version 07/01/2018
 */
public class HtmlHeader implements HtmlElement
{
    public HtmlHeader()
    {
    }

    public String startBlock() {
        return "<header>";
    }
    
    public String addValue(String value) {
        return value;
    }
    
    public String endBlock() {
        return "</header>";
    }
}