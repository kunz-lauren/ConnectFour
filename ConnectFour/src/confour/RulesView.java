/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

/**
 *
 * @author Daniel
 */
public class RulesView extends Menu {
    RulesControl control = new RulesControl();
    
    @Override
    public void go(){
        control.display();
    }
}
