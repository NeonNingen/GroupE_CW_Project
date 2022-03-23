/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupe_cwk2.groupe_cwk2;

/**
 *
 * @author Amit
 */
public class Card 
{
    //variables
    private String card_id;
    private int card_order;
    private String card_text;
    private String card_vocab;

    
    //getters
    public String getCard_id() 
    {
        return card_id;
    }

    public int getCard_order() 
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
    public void setCard_id(String card_id) 
    {
        this.card_id = card_id;
    }

    public void setCard_order(int card_order) 
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
