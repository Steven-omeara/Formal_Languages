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
/**
 * file: Main.java
 * author: Steven O'Meara
 * course: CMPT 440
 * assignment: Milestone 2
 * due date: May 2, 2016
 * version: 1.3
 * 
 * This file contains the setup for the GUI as well as the rest of the extra features
 */

/**
 * Main
 * 
 * This function creates the GUI, it adds all of the buttons and panels. It will set all of the on action 
 * and other necessary methods in the program
 * 
 * Parameters:
 *   None
 *   
 * Return Value:
 *   None, just called in main args to run GUI
 */
public class Main extends Application
{
  Button startLex;
  HTMLEditor userOutput;
  Stage window;
  String finalOutput;
  String color1 = "Blue";
  String color2 = "Green";
  
  @Override
  public void start(Stage primaryStage) throws Exception
  {
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
      /**
       * handle
       * 
       * This function is used to activate the FileChooser to send to a function to load a file in
       * 
       * Parameters:
       *   None
       *   
       * Return Value:
       *   None
       * 
       */
      @Override
      public void handle(ActionEvent arg0) 
      {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Load File");
        
        //Sets a filter to only allow txt files to be chosen
        FileChooser.ExtensionFilter txtFilter = new FileChooser.ExtensionFilter("Txt files (*.txt)","*.txt");
        fileChooser.getExtensionFilters().add(txtFilter);
        
        //Activates a window to load a file
        File file = fileChooser.showOpenDialog(window);
        if (file !=null)
        {
          try 
          {
        	//Runs a a method to load the file if a file is selected
            open(file);
          }
          catch (IOException e) 
          {
            e.printStackTrace();
          }
        }
      }
    }
    );
    
    MenuItem miSavefile = new MenuItem("Save File...");
    miSavefile.setOnAction(new EventHandler<ActionEvent>()
    {
      /**
       * handle
       * 
       * This function is used to activate on click and save the current text to a file
       * 
       * Parameters:
       *   None
       *   
       * Return Value:
       *   None
       */
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
          //Run a function to save a file
          save(file, theString);
        }
      }
    }
    );
    
    //Add MenuItems to the main Menu
    mFile.getItems().addAll(miLoadfile, miSavefile);
    
    //Adding Original Color option
    MenuItem miOriginalColor = new MenuItem("Original Color");
    miOriginalColor.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      /**
       * handle
       * 
       * This function runs on click of the original colors button, it sets the globals of the colors of accepted and comments
       * 
       * Parameters:
       *   None
       * 
       * Return Values:
       *   None
       */
      public void handle(ActionEvent arg0) 
      {
        color1 = "Blue";
        color2 = "Green";
      }
    }
    );
    
    //Adding Light Color option
    MenuItem miLightColor = new MenuItem("Light Color");
    miLightColor.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      /**
       * handle
       * 
       * This function runs on click of the light color button, it sets the globals of the colors of accepted and comments
       * 
       * Parameters:
       *   None
       * 
       * Return Values:
       *   None
       */
      public void handle(ActionEvent arg0) 
      {
        color1 = "Purple";
        color2 = "Pink";
      }
    }
    );
    
    //Add the Colors to the color option bar
    mColorScheme.getItems().addAll(miOriginalColor, miLightColor);
    
    //Add the Menu bar main item
    menu.getMenus().addAll(mFile,mColorScheme);	
    
    //Set up new Button 
    startLex = new Button();
    startLex.setText("Check language");
    startLex.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      /**
       * handle
       * 
       * This function takes the text from the HTML area and sends it to be lexed, it then sets the HTML editor to the returned value of the lex
       * 
       * Parameters:
       *   None
       *   
       * Return Values:
       *   None
       */
      public void handle(ActionEvent arg0) 
      {
        String htmlText = stripHTMLTags(userOutput.getHtmlText());
        //System.out.println("Initial String: " + htmlText);
        finalOutput = lex.lexString(htmlText,color1,color2);
        //System.out.println("Final Output: " + finalOutput + "\n");
        userOutput.setHtmlText(finalOutput);
      }
    }
    );
    
    //Set up new HTML editor
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
  
  /**
   * stripHTMLTags
   * 
   * This function is used to regex out html tags from a string, this is used before putting the string into the lex
   * 
   * Parameters:
   *   htmlText: The text with the html in it
   *   
   * Return values:
   *   finalstring: The plain text of the html given above
   */
  private String stripHTMLTags(String htmlText) 
  {
    String getNL = htmlText.replaceAll("<p>", "~");	
    String getNBSP = getNL.replaceAll("&nbsp;", " ");
    Pattern htmlpattern = Pattern.compile("<[^>]*>");
    Matcher htmlmatcher = htmlpattern.matcher(getNBSP);
    final StringBuffer finalstring = new StringBuffer(getNBSP.length());
    while(htmlmatcher.find()) 
    {
      htmlmatcher.appendReplacement(finalstring, "");
    }
    htmlmatcher.appendTail(finalstring);
    return finalstring.toString().trim();
  }
  
  /**
   * stripHTMLTagsWrite
   * 
   * This function serves the same purpose of the regex above but instead of changing <p> to ~ it 
   * changes it to \n so that it can be written to a file correctly.
   * 
   * Parameters:
   *   htmlText: The text that has html tags in it
   *   
   * Return values:
   *   finalString: The string with out the html tags and \n as new lines
   */
  private String stripHTMLTagsWrite(String htmlText) 
  {
    String getNL = htmlText.replaceAll("<p>", "\n");	
    String getNBSP = getNL.replaceAll("&nbsp;", " ");
    Pattern htmlpattern = Pattern.compile("<[^>]*>");
    Matcher htmlmatcher = htmlpattern.matcher(getNBSP);
    final StringBuffer finalstring = new StringBuffer(getNBSP.length());
    while(htmlmatcher.find()) 
    {
      htmlmatcher.appendReplacement(finalstring, " ");
    }
    htmlmatcher.appendTail(finalstring);
    return finalstring.toString().trim();
  }
  
  /**
   * open
   * 
   * This is used to open a file from the desktop, it will take all of the lines and set them in between a html tag
   * and if a new line is found it will add a new <p> to the html with the line 
   * 
   * Parameters:
   *   file: The file that he user is loading in
   *   
   * Return values:
   *   none
   */
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
  
  /**
   * save
   * 
   * This function takes in a file and a string and then saves it as a new txt file
   * 
   * Parameters:
   *   file:The name of the file that you are saving to
   *   input:The string that you are saving to the file
   * 
   * Return Values:
   *   None
   */
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
      e.printStackTrace();
    }
  }
  
  /**
   * main
   * 
   * This is the main function, anything in it will run on launch, it just runs the GUI
   * 
   * Parameters:
   *   args: arguments that will run
   */
  public static void main(String[] args)
  {
    launch(args);
  }
}
