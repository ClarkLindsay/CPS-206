public class Momento{
   private State state;
   
   public Momento(State state){
      this.state = state;
   }
   
   public State getState(){
      return state;
   }
   
   public String toString(){
      return state.toString();
   }
}