
/**
 * HtmlTitle will create the element of the title of our web site. Here we modified the addValue to return a value.
 *
 * @author Ioannis Chantolios
 * @version 07/01/2018
 */
public class HtmlTitle implements HtmlElement
{
    public HtmlTitle()
    {
    }

    public String startBlock() {
        return "<title>";
    }
    
    public String addValue(String value) {
        return value;
    }
    
    public String endBlock() {
        return "</title>";
    }
    
        
}