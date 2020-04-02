import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;



/*import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;*/

public class Calculations {
	/*Calculations(){    
		JFrame f=new JFrame("Button Example"); 
					//submit button
		JButton b=new JButton("Submit");    
		b.setBounds(100,100,140, 40);    
					//enter name label
		JLabel label = new JLabel();		
		label.setText("Enter Name :");
		label.setBounds(10, 10, 100, 100);
					//empty label which will show event after button clicked
		JLabel label1 = new JLabel();
		label1.setBounds(10, 110, 200, 100);
					//textfield to enter name
		JTextField textfield= new JTextField();
		textfield.setBounds(110, 50, 130, 30);
					//add to frame
		f.add(label1);
		f.add(textfield);
		f.add(label);
		f.add(b);    
		f.setSize(300,300);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		
							//action listener
		b.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					label1.setText("Name has been submitted.");				
			}          
	      });
		}         
	
	
		public static void main(String[] args) {    
		    new Calculations();    
		}    
		*/
	
	
	public static void main(String[] args){
		
		
		int atlv1=0;
		int atlv2=0;
		
		double data1,data2,data3;
		Random rand = new Random(); 
        Scanner in = new Scanner(System.in); 
        
        System.out.println(" Press 1 for G scheme  \tor\t  2 for I scheme");
        int x = in.nextInt(); 
        
        if(x==1){
        	
        System.out.println(" How many subjects?");
        int y = in.nextInt(); 
        
        try{
        FileWriter fw=new FileWriter("X"+(rand.nextInt(1000))+"Result.txt");
        
        for(int i=1;i<=y;i++){
	        System.out.println("TSI :: Enter % students above external level");
	        float a = in.nextFloat(); 
	        System.out.println("You entered float "+a); 
	        
	        
	        System.out.println("PSI :: Enter % students above external level");
	        float b = in.nextFloat(); 
	        System.out.println("You entered float "+b); 
	        
	        float c=(a+b)/2;
	        System.out.println("Average is : "+c);
	        if(c<=60){
	        	atlv1=1;
	        	System.out.println("yes"+atlv1);
	        	
	        }
	        else if(c>60 && c<=70){
	        	atlv1=2;
	        	System.out.println("yes"+atlv1);   	
			        }
	        else if(c>70){
	        	atlv1=3;
	        	System.out.println("yes"+atlv1);
			}
	        
	        
	        System.out.println("TS1 :: Enter % students above internal level");
	        float p = in.nextFloat(); 
	        System.out.println("You entered float "+p); 
	        
	        System.out.println("TS2 :: Enter % students above internal level");
	        float q = in.nextFloat(); 
	        System.out.println("You entered float "+q); 
	        
	        System.out.println("TW :: Enter % students above internal level");
	        float r = in.nextFloat(); 
	        System.out.println("You entered float "+q); 
	        
	        float s=(p+q+r)/3;
	        System.out.println("Average is : "+s);
	        
	        if(s<=60){
	        	atlv2=1;
	        	System.out.println("yes"+atlv2);
	        	
	        }
	        else if(s>60 && s<=70){
	        	atlv2=1;
	        	System.out.println("yes"+atlv2);   	
			        }
	        else if(s>70 && s<=100){
	        	atlv2=1;
	        	System.out.println("yes"+atlv2);
			}
	        
	        
	        data1=atlv1*0.8;
	        data2=atlv2*0.2;
	        data3=data1+data2;
	        System.out.println("Answer is :: \t"+data3);
	        fw.write("Answer::\t"+data3);   
        }//for
	        
        }//try
        catch(Exception e){
        	
        	System.out.println(e);
        }
        
        
        
        
        }//if
        else if(x==2){
        	
        	
        	System.out.println(" How many subjects?");
            int z = in.nextInt(); 
            	
            for(int j=1;j<=z;j++){
	        	
	        	  System.out.println("TSI :: Enter % students above external level");
	              float a = in.nextFloat(); 
	              System.out.println("You entered float "+a); 
	              
	              
	              System.out.println("PSI :: Enter % students above external level");
	              float b = in.nextFloat(); 
	              System.out.println("You entered float "+b); 
	              
	              float c=(a+b)/2;
	              System.out.println("Average is : "+c);
	              if(c<=60){
	              	atlv1=1;
	              	System.out.println("yes"+atlv1);
	              	
	              }
	              else if(c>60 && c<=70){
	              	atlv1=2;
	              	System.out.println("yes"+atlv1);   	
	      		        }
	              else if(c>70){
	              	atlv1=3;
	              	System.out.println("yes"+atlv1);
	      		}
	              
	              
	              System.out.println("TS1 :: Enter % students above internal level");
	              float p = in.nextFloat(); 
	              System.out.println("You entered float "+p); 
	              
	              System.out.println("TS2 :: Enter % students above internal level");
	              float q = in.nextFloat(); 
	              System.out.println("You entered float "+q); 
	              
	              System.out.println("TW :: Enter % students above internal level");
	              float r = in.nextFloat(); 
	              System.out.println("You entered float "+q); 
	              
	              float s=(p+q+r)/3;
	              System.out.println("Average is : "+s);
	              
	              if(s<=60){
	              	atlv2=1;
	              	System.out.println("yes"+atlv2);
	              	
	              }
	              else if(s>60 && s<=70){
	              	atlv2=1;
	              	System.out.println("yes"+atlv2);   	
	      		        }
	              else if(s>70 && s<=100){
	              	atlv2=1;
	              	System.out.println("yes"+atlv2);
	      		}
	              
	              
	              data1=atlv1*0.8;
	              data2=atlv2*0.2;
	              data3=data1+data2;
	              System.out.println("Answer is :: \t"+data3);
        	
        	
        	
        	
        }//for
            
        }//elif
		
		
		
	}//main
	
	
 }//class
