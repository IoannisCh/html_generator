import java.io.PrintWriter;
/**
 * In this class we have four methods. One private, one constructor which intializes, a create method under which
 * our html objects are created and a save method which will save our final result in a file.
 *
 * @author Ioannis Chantolios
 * @version 07/01/2018
 */
public class HtmlDocument
{
    private HtmlGenerator html;

    public HtmlDocument()
    {
        html = new HtmlGenerator();
    }

    public void create() {
        //creation of html objects
        HtmlHead head = new HtmlHead();
        HtmlHeader headerA = new HtmlHeader();
        HtmlHeader headerB = new HtmlHeader();
        HtmlTitle title = new HtmlTitle();
        HtmlBody body = new HtmlBody();
        HtmlParagraph paragraph = new HtmlParagraph();
        
        html.addElement(head.startBlock());
        html.addElement(title.startBlock());
        html.addElement(title.addValue("Morgan Freeman"));
        html.addElement(title.endBlock());
        html.addElement(head.endBlock());
        html.addElement(body.startBlock());
        html.addElement(headerA.startBlock());
        html.addElement(headerA.addValue("<b>Morgan Freeman Bio</b>"));
        html.addElement(headerA.endBlock());
        html.addElement(paragraph.startBlock());
        html.addElement(paragraph.addValue("With an authoritative voice and calm demeanor, this ever popular American actor has grown into one of the most respected figures in modern US cinema. Morgan was born on June 1, 1937 in Memphis, Tennessee, to Mayme Edna (Revere), a teacher, and Morgan Porterfield Freeman, a barber. The young Freeman attended Los Angeles City College before serving several years in the US Air Force as a mechanic between 1955 and 1959. His first dramatic arts exposure was on the stage including appearing in an all-African American production of the exuberant musical Hello, Dolly!."));
        html.addElement(paragraph.endBlock());
        html.addElement(headerB.startBlock());
        html.addElement(headerB.addValue("<b>Last updated:</b> 09/01/2018"));
        html.addElement(headerB.endBlock());
        html.addElement(body.endBlock());
        
        System.out.println(html.generate());
    }
    public void save(){
        try (PrintWriter writer = new PrintWriter("Freeman_Morgan.html", "UTF-8")){
writer.println(html.generate());
writer.close();}catch (Exception e){}
}        
}
