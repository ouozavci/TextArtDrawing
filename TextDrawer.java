import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.imageio.*;

import com.sun.prism.Graphics;
import com.sun.prism.Image;


public class TextDrawer {
	
	static int newW = 50;
	static int newH = 20;

	public static void main(String[] args){
		System.out.println("Enter file path of the image:");
		Scanner input = new Scanner(System.in);
		String filePath = input.nextLine();
		input.close();
		BufferedImage img=null;
		try{
			img = ImageIO.read(new File(filePath));
		}catch(IOException e){
			System.out.println("Error!");
		}
		
		
		
		BufferedImage output = new BufferedImage(newW, newH, img.getType());
		Graphics2D gr = output.createGraphics();
		gr.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
		    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		gr.drawImage(img, 0, 0, newW, newH, 0, 0, img.getWidth(),
		    img.getHeight(), null);
		gr.dispose();
		
			
		char[][] text = new char[output.getWidth()][output.getHeight()];

		for(int i=0;i<output.getWidth();++i){
			for(int j=0;j<output.getHeight();++j){
		        int rgb = output.getRGB(i, j);
		        int r = (rgb >> 16) & 0xFF;
		        int g = (rgb >> 8) & 0xFF;
		        int b = (rgb & 0xFF);

		        int grayLevel = (r + g + b) / 3;
		        
		        
		        
		        
		        if(grayLevel > 220){
		        	text[i][j]='.';
		        }
		        else if(grayLevel>200){
		        	text[i][j]=',';
		        }
		        else if(grayLevel>180){
		        	text[i][j]=';';
		        }
		        else if(grayLevel>150){
		        	text[i][j]='+';
		        }
		        else if(grayLevel>120){
		        	text[i][j]='o';
		        }
		        else if(grayLevel > 100){
		        	
		        	text[i][j]='0';
		        }
		        else if(grayLevel>80){
		        	text[i][j]='@';
		        }
		        else{
		        	text[i][j]='W';
		        	
		        }
		        
		        int gray = (grayLevel << 16) + (grayLevel << 8) + grayLevel; 
		        output.setRGB(i, j, gray);
			}
		}
			
		try{
		    PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
		    
			for(int i=0;i<output.getHeight();++i){
				for(int j=0;j<output.getWidth();++j){
					writer.print(text[j][i]);
				}
				writer.print("<br>");
				writer.print('\n');
			}	
			
		
		   
		    writer.close();	
		} catch (IOException e) {
		   // do something
		}
		
		File outFile = new File("output.png");
		try {
			ImageIO.write(output, "png", outFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}

