import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.web.HTMLEditor;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class Main extends Application
{
	Button startLex;
	HTMLEditor userOutput;
	Stage window;
	String finalOutput;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		//Test
		BorderPane root = new BorderPane();
		
		//Set up window Stage
		window = primaryStage;
		window.setTitle("Formal Languages: Lex");
	
		
		//Set up the MenuBar
		MenuBar menu = new MenuBar();
		
		//Set up the Menu 
		Menu mFile = new Menu("File");
		Menu mColorScheme = new Menu("Color Schemes");
		
		//Adding a item under a main menu
		MenuItem miLoadfile = new MenuItem("Load File...");
		miLoadfile.setOnAction(new EventHandler<ActionEvent>()
				{

					@Override
					public void handle(ActionEvent arg0) 
					{
						FileChooser fileChooser = new FileChooser();
						fileChooser.setTitle("Load File");
						
						FileChooser.ExtensionFilter txtFilter = new FileChooser.ExtensionFilter("Txt files (*.txt)","*.txt");
						fileChooser.getExtensionFilters().add(txtFilter);
						
						File file = fileChooser.showOpenDialog(window);
						if (file !=null)
						{
							try {
								open(file);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
				);
		
		MenuItem miSavefile = new MenuItem("Save File...");
		miSavefile.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0) 
			{
				FileChooser fileChooser = new FileChooser();
				fileChooser.setTitle("Save File");
				
				//Set Filter
				FileChooser.ExtensionFilter txtFilter = new FileChooser.ExtensionFilter("Txt files (*.txt)","*.txt");
				fileChooser.getExtensionFilters().add(txtFilter);
				
				//Get HTML text
				String theString = stripHTMLTagsWrite(userOutput.getHtmlText());
				
				//Show save file dialog
				File file = fileChooser.showSaveDialog(window);
				
				if(file != null)
				{
					save(file, theString);
				}
			}
		}
		);
		
		//Add MenuItems to the main Menu
		mFile.getItems().addAll(miLoadfile, miSavefile);
		
		//Add the Menu bar main item
		menu.getMenus().addAll(mFile,mColorScheme);	
		
		//Set up new Button and set up location in grid
		startLex = new Button();
		startLex.setText("Check language");
		startLex.setOnAction(new EventHandler<ActionEvent>()
				{

					@Override
					public void handle(ActionEvent arg0) 
					{
						String htmlText = stripHTMLTags(userOutput.getHtmlText());
						System.out.println("Initial String: " + htmlText);
						finalOutput = lex.lexString(htmlText);
						System.out.println("Final Output: " + finalOutput + "\n");
						userOutput.setHtmlText(finalOutput);
					}
				
				});
		
		//Set up new HTML editor and set location in grid
		userOutput = new HTMLEditor();
		userOutput.setMaxWidth(600);
		userOutput.setMaxHeight(525);
		
		//Set up the layout
		root.setTop(menu);
		root.setCenter(userOutput);
		root.setBottom(startLex);
		
		Scene scene = new Scene(root, 600, 600);
		window.setScene(scene);
		window.show();
		
		
	}
	
	//Edit this :D
	private String stripHTMLTags(String htmlText) 
	{
		String getNL = htmlText.replaceAll("<p>", "~");	
		String getNBSP = getNL.replaceAll("&nbsp;", " ");
        Pattern pattern = Pattern.compile("<[^>]*>");
        Matcher matcher = pattern.matcher(getNBSP);
        final StringBuffer sb = new StringBuffer(getNBSP.length());
        while(matcher.find()) 
        {
            matcher.appendReplacement(sb, " ");
        }
        matcher.appendTail(sb);
        return sb.toString().trim();
    }
	
	private String stripHTMLTagsWrite(String htmlText) 
	{
		String getNL = htmlText.replaceAll("<p>", "\n");	
		String getNBSP = getNL.replaceAll("&nbsp;", " ");
        Pattern pattern = Pattern.compile("<[^>]*>");
        Matcher matcher = pattern.matcher(getNBSP);
        final StringBuffer sb = new StringBuffer(getNBSP.length());
        while(matcher.find()) 
        {
            matcher.appendReplacement(sb, " ");
        }
        matcher.appendTail(sb);
        return sb.toString().trim();
    }
	
	private void open(File file) throws IOException
	{
		String line = null;
		Integer currLine = 0;
		String setFinal = "<html><head></head><body>";
		FileReader theFile = new FileReader(file);
		BufferedReader loadfile = new BufferedReader(theFile);
		while((line = loadfile.readLine()) != null)
		{
			if(currLine > 0)
			{
				setFinal += "<p>" + line;
			}
			else
			{
				setFinal += line;
				currLine = currLine + 1;
			}
		}
		
		setFinal = setFinal + "</body></html>";
		userOutput.setHtmlText(setFinal);
		loadfile.close();
	}
	
	private void save(File file, String input)
	{
		try 
		{
			FileWriter theWriter = new FileWriter(file);
			theWriter.write(input);
			theWriter.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}
