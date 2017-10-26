/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testautocompletetext;

import java.util.ArrayList;

/**
 *
 * @author phamh
 */
public class Handler extends Object {
    private ArrayList<Message> messages;
    
    public Handler(){
        messages = new ArrayList<>();
    }
    
    public final Message obtainMessage(int what, Object obj){
        Message message = new Message(what, obj, this);
        messages.add(message);
        return message;
    }
    
    public final Message obtainMessage(int what){
        Message message = new Message(what, this);
        messages.add(message);
        return message;
    }

    public void handleMessage(Message msg){
        messages.remove(msg);
    }

    public final boolean hasMessages(){
        return !messages.isEmpty();
    }
}
