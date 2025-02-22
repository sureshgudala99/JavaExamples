package com.test.javaex;

import java.io.Serializable;

public class ConfigurationManger implements Cloneable,Serializable {

   private static  ConfigurationManger instance;

   private ConfigurationManger()
   {

   }


   private static ConfigurationManger getInstance()
   {
       if (instance==null)
       synchronized (ConfigurationManger.class)
       {
           if (instance==null) {

               instance = new ConfigurationManger();
           }
       }

       return instance;
   }

   public Object readResolve()
   {
       return instance;
   }

        @Override
   public Object clone() throws CloneNotSupportedException
{
    throw  new CloneNotSupportedException();
}

}
