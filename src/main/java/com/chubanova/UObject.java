package com.chubanova;


import com.chubanova.move.Movable;

public interface UObject {

     Object getProperty(String propertyName);

     void setProperty(String propertyName, Object property);
}
