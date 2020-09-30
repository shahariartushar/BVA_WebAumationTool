import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.nio.charset.Charset;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Font;

public class SetBV_google extends JFrame {

	private JPanel contentPane;
	private JTextField fNameLower;
	private JTextField fNameUpper;
	private JTextField lNameLower;
	private JTextField lNameUpper;
	private JTextField uNameLower;
	private JTextField uNameUpper;
	private JTextField passLower;
	private JTextField passUpper;
	private JTextField cPassLower;
	private JTextField cPassUpper;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetBV_google frame = new SetBV_google();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SetBV_google() {
		setTitle("SET BOUNDARY VALUE(site: Google)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 289);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLower = new JLabel("LOWER V.");
		lblLower.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 10));
		lblLower.setBounds(241, 13, 56, 16);
		contentPane.add(lblLower);
		
		JLabel lblUpper = new JLabel("UPPER V.");
		lblUpper.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 10));
		lblUpper.setBounds(366, 13, 56, 16);
		contentPane.add(lblUpper);
		
		fNameLower = new JTextField();
		fNameLower.setHorizontalAlignment(SwingConstants.RIGHT);
		fNameLower.setBounds(205, 42, 116, 22);
		contentPane.add(fNameLower);
		fNameLower.setColumns(10);
		
		fNameUpper = new JTextField();
		fNameUpper.setHorizontalAlignment(SwingConstants.RIGHT);
		fNameUpper.setBounds(333, 42, 116, 22);
		fNameUpper.setColumns(10);
		contentPane.add(fNameUpper);
		
		lNameLower = new JTextField();
		lNameLower.setHorizontalAlignment(SwingConstants.RIGHT);
		lNameLower.setBounds(205, 71, 116, 22);
		lNameLower.setColumns(10);
		contentPane.add(lNameLower);
		
		lNameUpper = new JTextField();
		lNameUpper.setHorizontalAlignment(SwingConstants.RIGHT);
		lNameUpper.setBounds(333, 71, 116, 22);
		lNameUpper.setColumns(10);
		contentPane.add(lNameUpper);
		
		uNameLower = new JTextField();
		uNameLower.setHorizontalAlignment(SwingConstants.RIGHT);
		uNameLower.setBounds(205, 100, 116, 22);
		uNameLower.setColumns(10);
		contentPane.add(uNameLower);
		
		uNameUpper = new JTextField();
		uNameUpper.setHorizontalAlignment(SwingConstants.RIGHT);
		uNameUpper.setBounds(333, 100, 116, 22);
		uNameUpper.setColumns(10);
		contentPane.add(uNameUpper);
		
		passLower = new JTextField();
		passLower.setEditable(false);
		passLower.setHorizontalAlignment(SwingConstants.RIGHT);
		passLower.setBounds(205, 129, 116, 22);
		passLower.setColumns(10);
		contentPane.add(passLower);
		
		passUpper = new JTextField();
		passUpper.setEditable(false);
		passUpper.setHorizontalAlignment(SwingConstants.RIGHT);
		passUpper.setBounds(333, 129, 116, 22);
		passUpper.setColumns(10);
		contentPane.add(passUpper);
		
		cPassLower = new JTextField();
		cPassLower.setEditable(false);
		cPassLower.setHorizontalAlignment(SwingConstants.RIGHT);
		cPassLower.setBounds(205, 158, 116, 22);
		cPassLower.setColumns(10);
		contentPane.add(cPassLower);
		
		cPassUpper = new JTextField();
		cPassUpper.setEditable(false);
		cPassUpper.setHorizontalAlignment(SwingConstants.RIGHT);
		cPassUpper.setBounds(333, 158, 116, 22);
		cPassUpper.setColumns(10);
		contentPane.add(cPassUpper);
		
		JButton btnNewButton = new JButton("RUN");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(205, 202, 244, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//todo: 
				//1. handle check-box
				//2. text-box null check
				
				
				System.setProperty("webdriver.chrome.driver", ".\\lib\\chrome driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&flowName=GlifWebSignIn&flowEntry=SignUp&hl=en");
				driver.manage().window().maximize();
				
				
				//todo:
				//1. add more fields and send them in a function
				
				
				try 
				{
					usernameTestExecution(driver);
				} 
				catch (InterruptedException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setForeground(new Color(0, 153, 0));
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(27, 202, 138, 25);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//todo: dispose this window
				Home window = new Home();
				window.frmHome.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(204, 0, 0));
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		contentPane.add(btnNewButton_1);
		
		JCheckBox cbFName = new JCheckBox("First Name");
		cbFName.setFont(new Font("Georgia", Font.PLAIN, 11));
		cbFName.setBackground(new Color(192, 192, 192));
		cbFName.setSelected(true);
		cbFName.setBounds(27, 42, 138, 23);
		contentPane.add(cbFName);
		
		JCheckBox cbLName = new JCheckBox("Last Name");
		cbLName.setFont(new Font("Georgia", Font.PLAIN, 11));
		cbLName.setBackground(new Color(192, 192, 192));
		cbLName.setSelected(true);
		cbLName.setBounds(27, 71, 138, 23);
		contentPane.add(cbLName);
		
		JCheckBox cbUName = new JCheckBox("Username");
		cbUName.setFont(new Font("Georgia", Font.PLAIN, 11));
		cbUName.setBackground(new Color(192, 192, 192));
		cbUName.setSelected(true);
		cbUName.setBounds(27, 102, 138, 23);
		contentPane.add(cbUName);
		
		JCheckBox cbPass = new JCheckBox("Password");
		cbPass.setFont(new Font("Georgia", Font.PLAIN, 11));
		cbPass.setBackground(new Color(192, 192, 192));
		cbPass.setBounds(27, 131, 138, 23);
		contentPane.add(cbPass);
		
		JCheckBox cbCPass = new JCheckBox("Confirm Password");
		cbCPass.setFont(new Font("Georgia", Font.PLAIN, 11));
		cbCPass.setBackground(new Color(192, 192, 192));
		cbCPass.setBounds(27, 158, 138, 23);
		contentPane.add(cbCPass);
	}
	
	//BVA of username
	private void usernameTestExecution(WebDriver driver) throws InterruptedException 
	{
		//todo:
		//1. run BVA in loop
		//2. write in file

		int limitArray[] = getLimitArray(getUNameLower(),getUNameUpper());
		String[] testCase = getTestCase(limitArray);
		boolean resultFinder = true;
		
		for(int i=0; i<limitArray.length; i++)
		{	
			resultFinder = true;
			
			Thread.sleep(2000);
			WebElement username = driver.findElement(By.name("Username"));
			username.sendKeys(testCase[i]);
			
			Thread.sleep(2000);
			WebElement password = driver.findElement(By.name("Passwd"));
			password.click();
		
			Thread.sleep(2000);
			try 
			{
				WebElement error = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/div"));
			
				//todo:
				//1.extract error message and find the correct one
				//System.out.println(error.getText());
			
				if(error.getText().contains("Sorry"))
				{
					resultFinder = false;
				}

			}
			catch(Exception e) 
			{
				  //  Block of code to handle errors
			}
			
			if(resultFinder == false)
			{
				System.out.println("Error Found!");
			}
			else if(resultFinder == true)
			{
				System.out.println("Successful.");
			}
			
			driver.navigate().refresh();
		}
		
		
		//driver.navigate().refresh();
	}
	
	@SuppressWarnings("null")
	public String[] getTestCase(int [] limitArray) 
	{
		String[] testCase = new String[limitArray.length];
		
		for(int i=0; i<limitArray.length; i++)
		{
			testCase[i] = getRandomString(limitArray[i]);
		}
	 
	    return testCase;
	}
	
	public String getRandomString(int length) 
	{
		int leftLimit = 97; //'a'
	    int rightLimit = 122; //'z'
	    Random random = new Random();
	 
	    String generatedString = random.ints(leftLimit, rightLimit + 1).limit(length).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	 
	    return generatedString;
	}
	
	public int[] getLimitArray(int lower, int upper) 
	{
		int[] limitArray={lower-1,lower,(lower+upper)/2,upper,upper+1};
	 
	    return limitArray;
	}
	
	public int getFNameLower()
	{
		return Integer.parseInt(fNameLower.getText().trim());
	}
	
	public int getFNameUpper()
	{
		return Integer.parseInt(fNameUpper.getText().trim());
	}
	
	public int getLNameLower()
	{
		return Integer.parseInt(lNameLower.getText().trim());
	}
	
	public int getLNameUpper()
	{
		return Integer.parseInt(lNameUpper.getText().trim());
	}
	
	public int getUNameLower()
	{
		//System.out.println(uNameLower.getText().trim());
		return Integer.parseInt(uNameLower.getText().trim());
	}
	
	public int getUNameUpper()
	{
		//System.out.println(uNameUpper.getText().trim());
		return Integer.parseInt(uNameUpper.getText().trim());
	}
	
	public int getPassLower()
	{
		return Integer.parseInt(passLower.getText().trim());
	}
	
	public int getPassUpper()
	{
		return Integer.parseInt(passUpper.getText().trim());
	}
	
	public int getCPassLower()
	{
		return Integer.parseInt(cPassLower.getText().trim());
	}
	
	public int getCPassUpper()
	{
		return Integer.parseInt(cPassUpper.getText().trim());
	}

}

