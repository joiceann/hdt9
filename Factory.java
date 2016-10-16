/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt9;

/**
 *
 * @author JoiceAndrea
 */
public class Factory {
    /**
     * @param opcion
     * @param opcion1
     * the command line arguments
     */
    public Factory(){
        
    }
    public SplayTreeAbstract getTree(int opcion){
        if (opcion==1){
            return new SplayTree<String, String>();
        }
        else
            return null;
       
    }
}