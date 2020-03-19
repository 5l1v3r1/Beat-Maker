package application;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MainController {
	

		Media m ;
		MediaPlayer mp;
		
		@FXML
	    private JFXButton btn1;

	    @FXML
	    private JFXButton btn2;

	    @FXML
	    private JFXButton btn4;

	    @FXML
	    private JFXButton btn6;

	    @FXML
	    private JFXButton btn3;

	    @FXML
	    private JFXButton btn5;


	    public void clicked1()
	    {			
	    	
	    	Media m = new Media(this.getClass().getResource("/sounds/bubbles.mp3").toString());
	    	MediaPlayer mp=new MediaPlayer(m);	
	    	mp.setAutoPlay(true);
	    	mp.play();
	    	System.out.println();	
	
	    }


	    public void clicked2()
	    {
	    	Media m =  new Media(this.getClass().getResource("/sounds/clay.mp3").toString());  
			MediaPlayer mp=new MediaPlayer(m);
	    	mp.play();
	    	
	    }

	    public void clicked3()
	    {
			
	    	Media m =  new Media(this.getClass().getResource("/sounds/confetti.mp3").toString());  
			MediaPlayer mp=new MediaPlayer(m);
	    	mp.play();
	    	
	    }

	    public void clicked4()
	    {
	    	Media m =  new Media(this.getClass().getResource("/sounds/glimmer.mp3").toString());  
			MediaPlayer mp=new MediaPlayer(m);
	    	mp.play();
	    	
	    }

	    public void clicked5()
	    {
			 
	    	Media m =  new Media(this.getClass().getResource("/sounds/moon.mp3").toString());  
			MediaPlayer mp=new MediaPlayer(m);
	    	mp.play();
	    	
	    }

	    public void clicked6()
	    {
			 
	    	Media m =  new Media(this.getClass().getResource("/sounds/ufo.mp3").toString());  
			MediaPlayer mp=new MediaPlayer(m);
	    	mp.play();
	    	 
	    }
	    
}
