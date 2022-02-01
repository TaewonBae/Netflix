 package netflix.netflix.Database;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

 public class Netflix_DB_list {
     public String Netflix_name;
     public Bitmap Netflix_image;
     public Bitmap Netflix_image2;
     public String Netflix_text1;
     public String Netflix_text2;
     public String Netflix_text3;
     public String Netflix_text4;
     public String Netflix_text5;
     public String Netflix_text6;
     public String Netflix_text7;
     public String Netflix_text8;
     public String Netflix_text9;
     public String Netflix_text10;

     public String Netflix_youtube;

     public Netflix_DB_list(String Netflix_name, Bitmap Netflix_image,Bitmap Netflix_image2, String Netflix_text1, String Netflix_text2, String Netflix_text3, String Netflix_text4,
                            String Netflix_text5, String Netflix_text6,String Netflix_text7,String Netflix_text8,String Netflix_text9, String Netflix_text10, String Netflix_youtube){
         this.Netflix_name = Netflix_name;
         this.Netflix_image = Netflix_image;
         this.Netflix_image2 = Netflix_image2;
         this.Netflix_text1 = Netflix_text1;
         this.Netflix_text2 = Netflix_text2;
         this.Netflix_text3 = Netflix_text3;
         this.Netflix_text4 = Netflix_text4;
         this.Netflix_text5 = Netflix_text5;
         this.Netflix_text6 = Netflix_text6;
         this.Netflix_text7 = Netflix_text7;
         this.Netflix_text8 = Netflix_text8;
         this.Netflix_text9 = Netflix_text9;
         this.Netflix_text10 = Netflix_text10;
         this.Netflix_youtube = Netflix_youtube;



     }

     public Netflix_DB_list(){ }

     public String getNetflix_name(){ return Netflix_name; }
     public void setNetflix_name(String Netflix_name){ this.Netflix_name = Netflix_name; }

     public Bitmap getNetflix_image(){return Netflix_image;}
     public void setNetflix_image(byte[] Netflix_image){
         byte[] image = Netflix_image;
         Bitmap bm = BitmapFactory.decodeByteArray(image,0,image.length);
         this.Netflix_image = bm;}

     public Bitmap getNetflix_image2(){return Netflix_image2;}
     public void setNetflix_image2(byte[] Netflix_image2){
         byte[] image2 = Netflix_image2;
         Bitmap bm2 = BitmapFactory.decodeByteArray(image2,0,image2.length);
         this.Netflix_image2 = bm2;}

     public String getNetflix_text1(){ return Netflix_text1; }
     public void setNetflix_text1(String Netflix_text1){ this.Netflix_text1 = Netflix_text1; }

     public String getNetflix_text2(){ return Netflix_text2; }
     public void setNetflix_text2(String Netflix_text2){ this.Netflix_text2 = Netflix_text2; }

     public String getNetflix_text3(){ return Netflix_text3; }
     public void setNetflix_text3(String Netflix_text3){ this.Netflix_text3 = Netflix_text3; }

     public String getNetflix_text4(){ return Netflix_text4; }
     public void setNetflix_text4(String Netflix_text4){ this.Netflix_text4 = Netflix_text4; }

     public String getNetflix_text5(){ return Netflix_text5; }
     public void setNetflix_text5(String Netflix_text5){ this.Netflix_text5 = Netflix_text5; }

     public String getNetflix_text6(){ return Netflix_text6; }
     public void setNetflix_text6(String Netflix_text6){ this.Netflix_text6 = Netflix_text6; }

     public String getNetflix_text7(){ return Netflix_text7; }
     public void setNetflix_text7(String Netflix_text7){ this.Netflix_text7 = Netflix_text7; }

     public String getNetflix_text8(){ return Netflix_text8; }
     public void setNetflix_text8(String Netflix_text8){ this.Netflix_text8 = Netflix_text8; }

     public String getNetflix_text9(){ return Netflix_text9; }
     public void setNetflix_text9(String Netflix_text9){ this.Netflix_text9 = Netflix_text9; }

     public String getNetflix_text10(){ return Netflix_text10; }
     public void setNetflix_text10(String Netflix_text10){ this.Netflix_text10 = Netflix_text10; }

     public String getNetflix_youtube(){ return Netflix_youtube; }
     public void setNetflix_youtube(String Netflix_youtube){ this.Netflix_youtube = Netflix_youtube; }


 }
