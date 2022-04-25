package models;

/**
 * This class is used to:
 * - Download SQLite Driver.
 * - And creates the SQL Database (if it does not exist).
 * - Once the connect instance is closed, then the connection is turned off.
 * @author Zain
 */

public class Card 
{
    //variables
    private int card_id;
    private int card_points;
    private String card_role;
    private String card_text;
    private String card_order;
    private String card_vocab;
    private int dialogue_id;

    
    //getters
    public int getCard_id() 
    {
        return card_id;
    }

    public String getCard_order() 
    {
        return card_order;
    }

    public String getCard_text() 
    {
        return card_text;
    }

    public String getCard_vocab() 
    {
        return card_vocab;
    }

    
    //setters
    public void setCard_id(int card_id) 
    {
        this.card_id = card_id;
    }

    public void setCard_order(String card_order) 
    {
        this.card_order = card_order;
    }

    public void setCard_text(String card_text) 
    {
        this.card_text = card_text;
    }

    public void setCard_vocab(String card_vocab) 
    {
        this.card_vocab = card_vocab;
    }
    
    
    
    
    
}
