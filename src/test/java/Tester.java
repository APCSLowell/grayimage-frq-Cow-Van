

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class Tester {

   @Test
   public void partA () {
      int [][] pixels1 = {{255,184,178,84,129},
                    {84,255,255,130,84},
                    {78, 255, 0,0, 78},
                    {84,130,255,130,84}};
      GrayImage image = new GrayImage(pixels1);
      int result = image.countWhitePixels();
      assertEquals(5,image.countWhitePixels(),"Test failed: Expected output 5 from countWhitePixels() but " + result + " was returned");
   }

   @Test
   public void partB(){
      int[][] pixels2 = {
      {221, 184, 178,  84, 135},
      { 84, 255, 255, 130,  84},
      { 78, 255,   0,   0,  78},
      { 84, 130, 255, 130,  84}
    };
    
    int[][] result = {
      {221, 184, 100,  84, 135},
      { 0, 125, 171, 130 ,  84},
      { 78, 255,   0,   0,  78},
      { 84, 130, 255, 130,  84}
    };
    
    GrayImage image = new GrayImage(pixels2);
    GrayImage afterImage = new GrayImage(result);
    image.processImage();
    assertEquals(afterImage.toString(),image.toString() );
   }



}
