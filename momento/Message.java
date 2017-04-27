public class Message{
   private State state;
   
   public Message(State state){
      this.state = state;
   }
   
   public State getState(){
      return state;
   }
   
   public String toString(){
      return state.toString();
   }

}