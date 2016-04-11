package com.ifanybug.tools;

import android.app.Activity;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;


public class FormData {
    private int[] views;
    private HashMap<String,String> values = new HashMap<>();
    private Activity view;
    public FormData(int[] views,Activity view)
    {
        this.views = views;
        this.view = view;

    }

    public HashMap<String,String> get()
    {
        for(int editid:views){
                EditText edit = (EditText) view.findViewById(editid);
                String val = edit.getText().toString();
                String tag = edit.getTag().toString();
                values.put(tag, val);
        }
        return values;
    }

    public void set(HashMap<String,String> values){
        for(int editid:views){
            EditText edit = (EditText) view.findViewById(editid);
            String tag = edit.getTag().toString();
            for(Map.Entry<String,String> value:values.entrySet()){
                if(value.getKey() == tag){
                    edit.setText(value.getValue());
                }
            }
        }
    }
}
