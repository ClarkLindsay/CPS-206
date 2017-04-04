class Example implements Optional, Mysterious{

   private Optional optional; 
   
   public Example(){}
   
   public Example(Optional optional){
      this.optional = optional;
   }
   
   public void doOptional(){
      if(optional == null)
         System.out.println("Default behaviour");
      else
         optional.doOptional();
   }
   
   public void doMysterious(Injectiable injectiable){
      if(injectiable == null)
         System.out.println("Default behaviour");
      else
         injectiable.doInjectiable();
   }   
}