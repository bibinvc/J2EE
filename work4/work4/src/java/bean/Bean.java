/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author bvcbi
 */
public class Bean {
    
    private String title;
    private String content;
    private double bonuscal;

   

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
     public double getBonuscal() {
        return this.bonuscal;
    }

    public void setBonuscal() throws Exception{
        if (content != null && content.length() > 0) {
            try {
                int a;
                a = Integer.parseInt(title);
                int b;
                b = Integer.parseInt(content);
                bonuscal = a*b; 
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else 
        {
            bonuscal=0.0;
     
        }
    }

    }
    

