/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testautocompletetext;

/**
 *
 * @author phamh
 */
public class Message extends Object{
    int mWhat;
    Object mObj;
    Handler mTarget;
    
    public Message(int what, Object obj) {
        mWhat = what;
        mObj = obj;
    }
    
    public Message(int what, Object obj, Handler target) {
        mWhat = what;
        mObj = obj;
        mTarget = target;
    }
    
    public Message(int what, Handler target) {
        mWhat = what;
        mTarget = target;
    }
    
    public Message(int what){
        mWhat = what;
    }

    public void sendToTarget(){
        mTarget.handleMessage(this);
    }
}
