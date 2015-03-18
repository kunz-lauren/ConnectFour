/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour.menus;

import confour.Menu;
import confour.RulesControl;

/**
 *
 * @author Daniel
 */
public class RulesView extends Menu {
    RulesControl control = new RulesControl();
    
    public void go(){
        control.display();
    }
}
