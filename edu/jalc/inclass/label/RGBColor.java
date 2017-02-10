package edu.jalc.inclass.label;

public class RGBColor {
   private final int red;
   private final int green;
   private final int blue;

   private RGBColor(){
      this.red = 20;
      this.green = 1;
      this.blue = 4;
   }

   public RGBColor(int red, int green, int blue){
      this.red = red;
      this.green = green;
      this.blue = blue;
   }

   public int getRed() {
      return red;
   }

   public int getGreen() {
      return green;
   }

   public int getBlue() {
      return blue;
   }
}