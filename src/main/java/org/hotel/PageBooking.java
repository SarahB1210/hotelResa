package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageBooking {

	@FindBy (xpath = "//div[@class='scheduler_default_cell']")
	WebElement cel1;
	
	@FindBy (xpath = "//form/h1")
	WebElement titre_popup;
	
	@FindBy (id = "name")
	WebElement champ_nom;
	
	@FindBy (xpath = "//input[@type='submit']")
	WebElement button_save;
	
	@FindBy (xpath ="//*[@class='scheduler_default_event_inner']")
	WebElement resaCell;
	
	@FindBy (xpath ="//div[@class='scheduler_default_cell scheduler_default_cell_business']")
	WebElement target;
	
	@FindBy (xpath = "//div[@class='scheduler_default_message']")
	WebElement message_action;
	
	@FindBy (xpath="//div[contains(@class,'delete')]")
	WebElement croix_delete;
}
