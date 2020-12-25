import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class TypeKeyword extends Keyword {
	

	
	private static int FRAME_WIDTH = 360;
	private static int FRAME_HEIGHT = 160;
//	private static int FIELD_WIDTH = 10;
	
	private JRadioButton MP3Button;
	private JRadioButton MP4Button;
	private JRadioButton DocButton;
	private JRadioButton PdfButton;
	

//	private JLabel studentIDLabel;
//	private JLabel studentNameLabel;
//	private JTextField studentIDField;
//	private JTextField studentNameField;
	private JButton searchButton;
//	private JButton resetButton;
	private ButtonGroup group;
	private static JFrame frame;
	
	private Keyword keyword;
	

	
	public TypeKeyword(){
		
		
		frame = new JFrame();
		
		frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		

//		studentIDLabel = new JLabel("Student ID:");
//		studentIDField = new JTextField(FIELD_WIDTH);
//		studentNameLabel = new JLabel("Student Name:");
//		studentNameField = new JTextField(FIELD_WIDTH);
		
		createTypeBtn();  
		createSearchBtn();     
//		createResetBtn();       
		createPanel();       
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public void createTypeBtn()
	{
		group = new ButtonGroup();
		  
		MP3Button = new JRadioButton("MP3");
		MP4Button = new JRadioButton("MP4");
		DocButton = new JRadioButton("DOC");
		PdfButton = new JRadioButton("PDF");
		

	
		group = new ButtonGroup();
		group.add(MP3Button);
		group.add(MP4Button);
		group.add(DocButton);
		group.add(PdfButton);
		
		

		JPanel Panel1 = new JPanel();
		Panel1.setLayout(new GridLayout(1,4));

		Panel1.add(MP3Button);
		Panel1.add(MP4Button);
		Panel1.add(DocButton);
		Panel1.add(PdfButton);
		
		Panel1.setBorder(new TitledBorder(new EtchedBorder(), "Which Type You Want The Most¡H"));
	
	
	
//		class MP3BtnListener implements ActionListener
//		{
//			public void actionPerformed(ActionEvent event)
//			{
////				studentIDField.setEditable(true);	
////				studentNameField.setEditable(true);
//			}
//		}
//		
//			ActionListener listener1 = new MP3BtnListener();
//			MP3Button.addActionListener(listener1);
//
//		class MP4BtnListener implements ActionListener
//		{
//			public void actionPerformed(ActionEvent event)
//			{
////				studentIDField.setEditable(true);	
////				studentNameField.setEditable(false);
//
//			}
//		}
//		
//			ActionListener listener2 = new MP4BtnListener();
//			MP4Button.addActionListener(listener2);
//			
//		class DocBtnListener implements ActionListener
//		{
//			public void actionPerformed(ActionEvent event)
//			{
////				studentIDField.setEditable(true);	
////				studentNameField.setEditable(false);
//
//			}
//		}
//		
//			ActionListener listener3 = new DocBtnListener();
//			DocButton.addActionListener(listener3);
//			
//		class PdfBtnListener implements ActionListener
//		{
//			public void actionPerformed(ActionEvent event)
//			{
////				studentIDField.setEditable(true);	
////				studentNameField.setEditable(false);
//
//			}
//		}
//			
//			ActionListener listener4 = new PdfBtnListener();
//			PdfButton.addActionListener(listener4);
//	}
	
	
	public void createSearchBtn()
	{
		searchButton = new JButton("Search");
		
		class SearchBtnListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(MP3Button.isSelected())
				{
//					getRegisterFromRegisterFrame().addStudent(studentIDField.getText(),studentNameField.getText());
					
//					¦^¶ÇKeyword©MType¨ìhtmlCounter
				}
				else if(MP4Button.isSelected())
				{
//					getRegisterFromRegisterFrame().removeStudent(studentIDField.getText());
					
//					¦^¶ÇKeyword©MType¨ìhtmlCounter
				}
				else if(DocButton.isSelected())
				{
//					getRegisterFromRegisterFrame().removeStudent(studentIDField.getText());
				
//					¦^¶ÇKeyword©MType¨ìhtmlCounter
				}
				else if(PdfButton.isSelected())
				{
//					getRegisterFromRegisterFrame().removeStudent(studentIDField.getText());
					
//					¦^¶ÇKeyword©MType¨ìhtmlCounter
				}
				
			}
		}
		
			ActionListener listener = new SearchBtnListener();
			searchButton.addActionListener(listener);
	}
	
//	public void createResetBtn()
//	{
//		resetButton = new JButton("Reset");
//		
//		class ResetBtnListener implements ActionListener
//		{
//			public void actionPerformed(ActionEvent event)
//			{	
//				studentIDField.setText(null);
//				studentNameField.setText(null);
//			}
//		}
//		
//			ActionListener listener = new ResetBtnListener();
//			resetButton.addActionListener(listener);
//	}



	public void createPanel()
	{
		JPanel main = new JPanel();
		JPanel one = new JPanel();
		one.add(MP3Button);
		one.add(MP4Button);
		one.add(DocButton);
		one.add(PdfButton);
		main.add(one,BorderLayout.NORTH);
		
//		JPanel two = new JPanel();
//		two.setLayout(new GridLayout(2,2));
//		two.add(studentIDLabel);
//		two.add(studentIDField);
//		two.add(studentNameLabel);
//		two.add(studentNameField);
//		main.add(two,BorderLayout.CENTER);
		
		JPanel three = new JPanel();
	    three.add(searchButton);
//	    three.add(resetButton);
	    main.add(three,BorderLayout.SOUTH);
	    
	    frame.add(main);
	    
	}
	
	
}


