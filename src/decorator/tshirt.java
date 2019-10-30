/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import javafx.scene.image.ImageView;

/**
 *
 * @author alisu
 */
public class tshirt extends Gifts{
    
    GiftBoxInterface box;
    ImageView img;
    
     public tshirt(GiftBoxInterface newGiftBox) {
        super(newGiftBox);
        this.box = newGiftBox;
    }
    
    @Override
    public String getDescription(){
    
        return tempGiftBox.getDescription() + ", T-shirt";
        
    }
    
    @Override
    public double getCost(){
        
        return tempGiftBox.getCost() + 10.00;
    
    }

    @Override
    public void setImage(ImageView imageView) {
        if (!imageView.isVisible()) {
                    imageView.setVisible(true);  
                }else{
                    imageView.setVisible(false);
        }
    }

    
}
