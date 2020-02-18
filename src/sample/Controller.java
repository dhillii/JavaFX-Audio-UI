/**
 * @file Controller.java
 * @author David Hill, Jr.
 */

package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Control;
import javafx.event.*;


public class Controller {
    @FXML
    private Slider slider1;
    @FXML
    private Slider slider2;
    @FXML
    private Slider slider3;
    @FXML
    private Slider slider4;

    @FXML
    public void VolumeCtrl(ActionEvent event){

        String speakerName = ((Control)event.getSource()).getId();
        boolean visibility;
        switch(speakerName) {
            case "speaker-0":
                visibility = slider1.isVisible();
                slider1.setVisible(!visibility);
                break;
            case "speaker-1":
                visibility = slider2.isVisible();
                slider2.setVisible(!visibility);
                break;
            case "speaker-2":
                visibility = slider3.isVisible();
                slider3.setVisible(!visibility);
                break;
            case "speaker-3":
                visibility = slider4.isVisible();
                slider4.setVisible(!visibility);
                break;
        }
    }
}
