package edu.jalc.inclass.label;

public class SodaBottleLabel {

   private final int height;
   private final RGBColor rgbColor;
   private final DrPepperLogo drPepperLogo;

   private SodaBottleLabel(){
      this.height = 8;
      this.rgbColor = null;
      this.drPepperLogo = null;
   }

   public SodaBottleLabel(int height, RGBColor rgbColor, DrPepperLogo drPepperLogo){
      this.height = height;
      this.rgbColor = rgbColor;
      this.drPepperLogo = drPepperLogo;
   }

   public int getHeight() {
      return height;
   }

   public RGBColor getRGBColor() {
      return rgbColor;
   }

   public DrPepperLogo getDrPepperLogo() {
      return drPepperLogo;
   }
}