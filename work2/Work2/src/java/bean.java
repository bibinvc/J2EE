/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author  bvcbi
 */
public class bean {
    public String num; 
    public String multiplier;
    public double result;
    

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }

    public double getResult() {
        return result;
    }

    public void setResult(String multiplier) {
        if (multiplier != null && multiplier.length() > 0) {
            try {
                int mul= Integer.parseInt(multiplier);
                result = mul*100.0;
            }
            catch(Exception e) {
               e.printStackTrace();
            }
        }
        else 
        {
            result=0.0;
        }
    }
        
        
       
    
 

   
 
}
