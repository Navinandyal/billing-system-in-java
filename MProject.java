import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.util.*;


public class MProject extends Applet
{
	int welf=0;
	float subt=0;
	Random random=new Random();
	String CusRefran=String.format("%04d",random.nextInt(9999));

	

	Font f;

	// Text box's for input customer information 
	TextField CusRefT=new TextField();
	TextField fnameT=new TextField();
	TextField SnameT=new TextField();
	TextField AddressT=new TextField();
	TextField MobnumT=new TextField();

	// Textbox's for input product information 
	TextField PriceT=new TextField();
	TextField QtyT=new TextField();

	//Textbox's for Billing Info
	TextField StotalT=new TextField();
	TextField GtaxT=new TextField();
	TextField ToatalT=new TextField();

	TextArea BillingArea=new TextArea();

	//Label's for customer information 
	Label CusRefL=new Label("Customer Ref ");
	Label fnameL=new Label("First Name");
	Label SnameL=new Label("SurName");
	Label AddressL=new Label("Address");
	Label MobnumL=new Label("Mobile");

	//Label's for product information 
	Label SelcatL=new Label("Select categories ");
	Label SubcatL=new Label("Sub categories");
	Label ProcnL=new Label("Product name");
	Label PriceL=new Label("Price");
	Label QtyL=new Label("Quantity");

	//Lable's for Billing Info
	Label StotalL=new Label("Sub Total ");
	Label GtaxL=new Label("Gov tax ");
	Label ToatalL=new Label("Total ");

	Button AddbutB=new Button("Add To Cart");
	Button GenbillB=new Button("Genrate Bill");
	Button ClearB=new Button("Clear");

	

	String categry[]={"Select Option","Clothing","LifeStyle","Mobiles"};
	
	JComboBox SelcatC=new JComboBox(categry);
	JComboBox SubcatC=new JComboBox();
	JComboBox ProcnC=new JComboBox();
	
	public void paint(Graphics g)
	{
		g.setColor(Color.pink);		//Background colour of deBillingAreails box's 
		g.fillRect(0,240,270,300);
		g.fillRect(280,240,270,300);
		g.fillRect(560,240,270,300);
		g.setColor(Color.green);		//Background colour of deBillingAreails boxe's Heading 
		g.fillRoundRect(30,250,200,30,50,30);
		g.fillRoundRect(320,250,200,30,50,30);
		g.fillRoundRect(590,250,200,30,50,30);		
		g.setColor(Color.blue);		//Background colour of Attribute boxe's 
		g.drawString("Castomer details",70,270);
		g.drawString("Product details",380,270);
		g.drawString("Billing details",650,270);

		g.setFont(f);			// Font of applet 
		g.drawString("Billing Software",150,180);
	}

	public void welcome()
	{
		BillingArea.append("==================================================================");
		BillingArea.append("\n\t\t\tWELCOME TO Billing SYSTEM\n");
		BillingArea.append("==================================================================");
		BillingArea.append("\nCustomer Ref :"+CusRefran);
		BillingArea.append("\nFirst Name :"+fnameT.getText());
		BillingArea.append("\nSurname :"+SnameT.getText());
		BillingArea.append("\nAddress :"+AddressT.getText());
		BillingArea.append("\nPhone Number :"+MobnumT.getText());
		BillingArea.append("\n==================================================================");
		BillingArea.append("\nProducts\t\tQty\t\tPrice");
		BillingArea.append("\n==================================================================");
	}

	public void init()
	{
		f=new Font("Arial",Font.BOLD,150);

		CusRefT.setText(String.valueOf(CusRefran));

		SelcatC.setBounds(420,300,120,20);
		SubcatC.setBounds(420,350,120,20);
		ProcnC.setBounds(420,400,120,20);

		CusRefL.setBounds(10,300,100,20);
		fnameL.setBounds(10,350,100,20);
		SnameL.setBounds(10,400,100,20);
		AddressL.setBounds(10,450,100,20);
		MobnumL.setBounds(10,500,100,20);

		CusRefT.setBounds(120,300,130,20);
		fnameT.setBounds(120,350,130,20);
		SnameT.setBounds(120,400,130,20);
		AddressT.setBounds(120,450,130,20);
		MobnumT.setBounds(120,500,130,20);

		SelcatL.setBounds(310,300,100,20);
		SubcatL.setBounds(310,350,100,20);
		ProcnL.setBounds(310,400,100,20);
		PriceL.setBounds(310,450,100,20);
		QtyL.setBounds(310,500,100,20);

		PriceT.setBounds(420,450,120,20);
		QtyT.setBounds(420,500,120,20);

		AddbutB.setBounds(0,560,170,75);
		GenbillB.setBounds(200,560,170,75);
		ClearB.setBounds(400,560,170,75);
			
		StotalL.setBounds(570,300,100,20);
		GtaxL.setBounds(570,350,100,20);
		ToatalL.setBounds(570,400,100,20);

		StotalT.setBounds(680,300,120,20);
		GtaxT.setBounds(680,350,120,20);
		ToatalT.setBounds(680,400,120,20);

		BillingArea.setBounds(850,240,500,300);

		setLayout(null);
		setBackground(Color.cyan);

		add(BillingArea);
			
		add(SelcatC);
		add(SubcatC);
		add(ProcnC);
			
		add(CusRefL);
		add(CusRefT);
		add(fnameL);
		add(fnameT);
		add(SnameL);
		add(SnameT);
		add(AddressL);
		add(AddressT);
		add(MobnumL);
		add(MobnumT);

		add(SelcatL);
		add(SubcatL);
		add(ProcnL);
		add(PriceL);
		add(QtyL);
	
		add(PriceT);
		add(QtyT);
		
		add(StotalL);
		add(GtaxL);
		add(ToatalL);
		
		add(StotalT);
		add(GtaxT);
		add(ToatalT);

		add(AddbutB);
		add(GenbillB);
		add(ClearB);
			

		add(PriceT);
		add(QtyT);

		welcome();

		SelcatC.addActionListener(new cat());
		SubcatC.addActionListener(new scat());
		ProcnC.addActionListener(new pcat());
		AddbutB.addActionListener(new atoc());
		GenbillB.addActionListener(new gto());
		ClearB.addActionListener(new clear());

	}

	
	class cat implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				if(SelcatC.getSelectedItem().equals("Select Option"))
				{
					SubcatC.removeAllItems();
				}
				if(SelcatC.getSelectedItem().equals("Clothing"))
				{
					SubcatC.removeAllItems();
					SubcatC.addItem("Select Option");
					SubcatC.addItem("Pant");
					SubcatC.addItem("T-Shirts");
					SubcatC.addItem("Shirts");
				}
				if(SelcatC.getSelectedItem().equals("LifeStyle"))
				{
					SubcatC.removeAllItems();
					SubcatC.addItem("Select Option");
					SubcatC.addItem("Bath Soap");
					SubcatC.addItem("Face Cream");
					SubcatC.addItem("Hair Oil");
				}
				if(SelcatC.getSelectedItem().equals("Mobiles"))
				{
					SubcatC.removeAllItems();
					SubcatC.addItem("Select Option");
					SubcatC.addItem("Iphone");
					SubcatC.addItem("Realme");
					SubcatC.addItem("One Plus");
				}	
						
			}

			catch(Exception a)
			{
				System.out.println(a);
			}
		}
	}
	class scat implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				if(SubcatC.getSelectedItem().equals("Select Option"))
				{
					ProcnC.removeAllItems();
				}
				if(SubcatC.getSelectedItem().equals("Pant"))
				{
					ProcnC.removeAllItems();
					ProcnC.addItem("Select Option");
					ProcnC.addItem("Levis");
					ProcnC.addItem("Mufti");
					ProcnC.addItem("Spykar");
				}
				if(SubcatC.getSelectedItem().equals("T-Shirts"))
				{
					ProcnC.removeAllItems();
					ProcnC.addItem("Select Option");
					ProcnC.addItem("Polo");
					ProcnC.addItem("RoadStar");
					ProcnC.addItem("Nike");
				}
				if(SubcatC.getSelectedItem().equals("Shirts"))
				{
					ProcnC.removeAllItems();
					ProcnC.addItem("Select Option");
					ProcnC.addItem("Peter England");
					ProcnC.addItem("Louis Phillipe");
					ProcnC.addItem("Park Avenue");
				}
				if(SubcatC.getSelectedItem().equals("Bath Soap"))
				{
					ProcnC.removeAllItems();
					ProcnC.addItem("Select Option");
					ProcnC.addItem("LifeBoy");
					ProcnC.addItem("Lux");
					ProcnC.addItem("Pearl");
				}
				if(SubcatC.getSelectedItem().equals("Face Cream"))
				{
					ProcnC.removeAllItems();
					ProcnC.addItem("Select Option");
					ProcnC.addItem("Fair&Lovely");
					ProcnC.addItem("Ponds");
					ProcnC.addItem("Garnier");
				}
				if(SubcatC.getSelectedItem().equals("Hair Oil"))
				{
					ProcnC.removeAllItems();
					ProcnC.addItem("Select Option");
					ProcnC.addItem("Parachute");
					ProcnC.addItem("Jashmin");
					ProcnC.addItem("Bajaj");
				}
				if(SubcatC.getSelectedItem().equals("Iphone"))
				{
					ProcnC.removeAllItems();
					ProcnC.addItem("Select Option");
					ProcnC.addItem("Iphone_X");
					ProcnC.addItem("Iphone_11");
					ProcnC.addItem("Iphone_12");
				}
				if(SubcatC.getSelectedItem().equals("Realme"))
				{
					ProcnC.removeAllItems();
					ProcnC.addItem("Select Option");
					ProcnC.addItem("Realme 6");
					ProcnC.addItem("Realme 7");
					ProcnC.addItem("Realme pro");
				}
				if(SubcatC.getSelectedItem().equals("One Plus"))
				{
					ProcnC.removeAllItems();
					ProcnC.addItem("Select Option");
					ProcnC.addItem("One Plus 6");
					ProcnC.addItem("One Plus 7");
					ProcnC.addItem("One Plus 8");
				}		
			}

			catch(Exception a)
			{
				System.out.println(a);
			}
		}
	}
	class pcat implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				if(ProcnC.getSelectedItem().equals("Levis"))
				{
					int TempPrice=500;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Mufti"))
				{
					int TempPrice=600;
					PriceT.setText(String.valueOf(TempPrice));
				}	
				if(ProcnC.getSelectedItem().equals("Spykar"))
				{
					int TempPrice=650;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Polo"))
				{
					int TempPrice=700;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("RoadStar"))
				{
					int TempPrice=800;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Nike"))
				{
					int TempPrice=900;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Peter England"))
				{
					int TempPrice=800;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Louis Phillipe"))
				{
					int TempPrice=900;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Park Avenue"))
				{
					int TempPrice=700;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("LifeBoy"))
				{
					int TempPrice=50;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Lux"))
				{
					int TempPrice=70;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Pearl"))
				{
					int TempPrice=80;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Fair&Lovely"))
				{
					int TempPrice=50;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Ponds"))
				{
					int TempPrice=70;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Garnier"))
				{
					int TempPrice=100;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Parachute"))
				{
					int TempPrice=200;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Jashmin"))
				{
					int TempPrice=300;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Bajaj"))
				{
					int TempPrice=400;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Iphone_x"))
				{
					int TempPrice=50000;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Iphone_11"))
				{
					int TempPrice=70000;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Iphone_12"))
				{
					int TempPrice=90000;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Realme 6"))
				{
					int TempPrice=20000;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Realme 7"))
				{
					int TempPrice=30000;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("Realme pro"))
				{
					int TempPrice=40000;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("One Plus 6"))
				{
					int TempPrice=50000;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("One Plus 7"))
				{
					int TempPrice=80000;
					PriceT.setText(String.valueOf(TempPrice));
				}
				if(ProcnC.getSelectedItem().equals("One Plus 8"))
				{
					int TempPrice=90000;
					PriceT.setText(String.valueOf(TempPrice));
				}

			}

			catch(Exception a)
			{
				System.out.println(a);
			}
			finally
			{
				QtyT.setText(String.valueOf(1));

			}
		}
	}
	class atoc implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			
						
			if(e.getSource() == AddbutB)
				{
					int g=0;
					float n,b,m,tax,k;
					n=Float.parseFloat(PriceT.getText());
					b=Float.parseFloat(QtyT.getText());		
					m=n*b;
					subt=subt+m;
					tax=0.18f;
					StotalT.setText(String.valueOf(subt));
					k=subt*tax;
					GtaxT.setText(String.valueOf(k));		
					ToatalT.setText(String.valueOf(subt+k));
					if(welf==0)
					{
						BillingArea.setText(" ");
						welcome();			
						welf=welf+1;
					}			
					BillingArea.append("\n"+ProcnC.getSelectedItem()+"\t\t"+QtyT.getText()+"\t\t"+m);
					CusRefT.setText(String.valueOf(CusRefran));
				}
		} 
	}
	class gto implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == GenbillB)
				{
					float a,b,c;
					a=Float.parseFloat(StotalT.getText());
					b=Float.parseFloat(GtaxT.getText());		
					c=Float.parseFloat(ToatalT.getText());		
					BillingArea.append("\n==================================================================");
					BillingArea.append("\nsub Amount:\t\t\t"+a);
					BillingArea.append("\ntax Amount:\t\t\t"+b);
					BillingArea.append("\nTotal Amount:\t\t\t"+c);
					BillingArea.append("\n==================================================================");
				}
		} 
	}
	
	class clear implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == ClearB)
				{
					CusRefran=String.format("%04d",random.nextInt(9999));
					CusRefT.setText(" ");
					CusRefT.setText(String.valueOf(CusRefran));
					fnameT.setText(" ");
					SnameT.setText(" ");
					AddressT.setText(" ");
					MobnumT.setText(" ");
					PriceT.setText(" ");
					QtyT.setText(" ");
					StotalT.setText(" ");
					GtaxT.setText(" ");
					ToatalT.setText(" ");
					BillingArea.setText(" ");
					subt=0;
					welcome();
					welf=0;
					SelcatC.setSelectedItem(null);
					SubcatC.setSelectedItem(null);
					ProcnC.setSelectedItem(null);
					
				}
		} 
	}


}