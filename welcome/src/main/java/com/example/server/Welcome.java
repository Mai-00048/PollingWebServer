package com.example.welcome.service;

public class Welcome {

    private  String lang;
    private  String msg;
   

    int rand = (int)(Math.random() * (3)) + 1; 
     

    public Welcome() {
             
        switch (rand) 
       { 
               case 1: 
              lang = "en";
              msg = "Welcome";
                   break ; 
               case 2:
              lang = "ar";
              msg = "أهلا بك"; 
                   break ; 
               case 3: 
              lang = "in";
              msg = "स्वागत हे";
                   break ; 
          
               default:
 
            // Print statement corresponding case
            System.out.println("no match");
           } 
         
    
    }
       
      
    


    public String getLang() { return lang; }
    public String getMsg() { return msg; }
   
}
