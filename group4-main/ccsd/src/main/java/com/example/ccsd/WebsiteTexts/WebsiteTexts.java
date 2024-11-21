package com.example.ccsd.WebsiteTexts;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "WebsiteTexts")

public class WebsiteTexts {

// Text Class
class Text {
    // Encapsulating the name and age
    // only approachable and used using
    // methods defined
    @Id
    private String id;
    private String titleText;
    private String headerText;
    private String footerText;
    private String bodyText;
    private long contactNum;

    

    public String getTitleText() { return titleText; }
    public void setTitleText(String titleText) { this.titleText = titleText; }

    public String getHeaderText() { return headerText; }
    public void setHeaderText(String headerText) { this.headerText = headerText; }

    public String getFooterText() { return footerText; }
    public void setFooterText(String footerText) { this.footerText = footerText; }

    public String getBodyText() { return bodyText; }
    public void setBodyText(String bodyText) { this.bodyText = bodyText; }

    public long getContactNum() { return contactNum; }
    public void setContactNum(long contactNum) { this.contactNum = contactNum; }
}


// Driver Class
public class Main {
    // main function
    public void main(String[] args)
    {
        // person object created
        Text text = new Text();
        text.setTitleText("Experience the world of creativity");
        text.setHeaderText("Global.AI");
        text.setFooterText("Interested? Contact US | In Collaboration with :");
        text.setBodyText("null");
        text.setContactNum(1123456789);

        // Using methods to get the values from the
        // variables
        System.out.println(text.getTitleText());
        System.out.println(text.getHeaderText());
        System.out.println(text.getFooterText());
        System.out.println(text.getBodyText());
        System.out.println(text.getContactNum());



    }
}
}